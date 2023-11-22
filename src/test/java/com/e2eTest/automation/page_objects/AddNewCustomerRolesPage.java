package com.e2eTest.automation.page_objects;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

public class AddNewCustomerRolesPage extends BasePage {

	@FindBy(how = How.ID, using = "Name")
	private static WebElement nameCustomerRoles;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Choose a product']")
	private static WebElement buttonPurchasedWithProduct;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement buttonSave;

	/* Element Of New Window */

	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement SearchProductName;

	@FindBy(how = How.ID, using = "search-products")
	private static WebElement buttonSearch;

	@FindBy(how = How.XPATH, using = "//button[normalize-space()='Select']")
	private static WebElement buttonSelect;

	/****
	 * Constructor
	 ****/

	public AddNewCustomerRolesPage() {
		super(Setup.getDriver());
	}

	/****
	 * Method
	 ****/

	public static WebElement getNameCustomerRoles() {
		return nameCustomerRoles;
	}

	public static WebElement getButtonPurchasedWithProduct() {
		return buttonPurchasedWithProduct;
	}

	public static WebElement getButtonSave() {
		return buttonSave;
	}

	/****
	 * Method new window
	 ****/
	
	public static void switchToNewWindows() {
		// Récupérez les poignées des fenêtres actuelles
		String fenetrePrincipale = Setup.getDriver().getWindowHandle();
		for (String fenetre : Setup.getDriver().getWindowHandles()) {
			if (!fenetre.equals(fenetrePrincipale)) {
				// Commutez vers la nouvelle fenêtre
				Setup.getDriver().switchTo().window(fenetre);

			}
		}

	}
	
	public static void switchToTheParentWindow () {
		for (String fenetre : Setup.getDriver().getWindowHandles()) {
			Setup.getDriver().switchTo().window(fenetre);
            break;
        }
		
	}

	public static WebElement getSearchProductName() throws InterruptedException {
		Thread.sleep(5000);
		return SearchProductName;
	}

	public static WebElement getButtonSearch() {
		//SeleniumUtils.waitForVisibility(buttonSearch);
		return buttonSearch;
	}

	public static WebElement getButtonSelect() {
		//SeleniumUtils.waitForVisibility(buttonSelect);
		return buttonSelect;
	}

	
}
