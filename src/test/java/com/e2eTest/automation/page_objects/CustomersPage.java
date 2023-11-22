package com.e2eTest.automation.page_objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

public class CustomersPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Customers']//i[contains(@class,'right fas fa-angle-left')]")
	private static WebElement menuCustomers;

	@FindBy(how = How.XPATH, using = "//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")
	private static WebElement customers;

	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Customers']")
	private static WebElement textCustomers;

	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Add new']")
	private static WebElement buttonAddNewCustomers;

	/***************/

	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissable']")
	private static WebElement messageSuccessCreatCustomers;

	@FindBy(how = How.XPATH, using = "//*[@id=\"customers-grid\"]/tbody/tr")
	private static List<WebElement> lignesOfCustomors;

	@FindBy(how = How.XPATH, using = "//*[@id=\"customers-grid\"]/tbody/tr/td")
	private static List<WebElement> elementsTextOfCustomors;

	@FindBy(how = How.XPATH, using = "//*[@id=\"customers-grid\"]/tbody/tr[1]/td[7]/a")
	private static WebElement buttonEdit;

	

	/****
	 * Constructor
	 ****/

	public CustomersPage() {
		super(Setup.getDriver());
	}

	/****
	 * Method Customers
	 ****/

	public static WebElement getMenuCustomers() {
		return menuCustomers;
	}


	public static WebElement getCustomers() {
		return customers;
	}

	public static WebElement getTextCustomers() {
		return textCustomers;
	}

	public static WebElement getButtonAddNewCustomers() {
		SeleniumUtils.waitForVisibility(buttonAddNewCustomers);
		return buttonAddNewCustomers;
	}

	/****
	 * Method Find Customers
	 ****/

	public static WebElement getMessageSuccessCreatCustomers() {
		return messageSuccessCreatCustomers;
	}

	public static void findEmail(String email) {
		// Parcourez chaque ligne du tableau
		for (WebElement ligne : lignesOfCustomors) {
			// Parcourez chaque élément de texte dans la ligne
			for (WebElement element : elementsTextOfCustomors) {
				// Vérifiez si le texte recherché est présent dans l'élément actuel
				if (element.getText().contains(email)) {

					System.out.println("Texte trouvé dans le tableau !");

				}
			}
		}

	}

	public static WebElement getButtonEdit() {
		return buttonEdit;
	}
	
	



}
