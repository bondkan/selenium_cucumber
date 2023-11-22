package com.e2eTest.automation.page_objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.SeleniumUtils;
import com.e2eTest.automation.utils.Setup;

public class CatalogPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Catalog']")
	private static WebElement menuCatalog;

	/** WebElements Products **/

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Products']")
	private static WebElement catalogProducts;

	@FindBy(how = How.XPATH, using = "//h1[@class='float-left']")
	private static WebElement textProducts;

	@FindBy(how = How.ID, using = "SearchProductName")
	private static WebElement nameOfProduct;

	@FindBy(how = How.ID, using = "search-products")
	private static WebElement searchProducts;

	@FindBy(how = How.XPATH, using = "//div[@class='documentation-reference']//span[1]")
	private static WebElement learnMoreAboutTheProducts;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement addNewCategories;

	/** WebElements Categories **/

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Categories']")
	private static WebElement catalogCategories;

	@FindBy(how = How.XPATH, using = "//h1[@class='float-left']")
	private static WebElement categories;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement buttonAddNew;

	@FindBy(how = How.XPATH, using = "//h1[@class='float-left']")
	private static WebElement textAddANewCategory;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'×')]")
	private static WebElement textSuccessInCreationgACategory;

	/** WebElements Add a new category **/

	@FindBy(how = How.ID, using = "Name")
	private static WebElement newCategoryName;

	@FindBy(how = How.ID, using = "Description_ifr")
	private static WebElement frameDescription;

	@FindBy(how = How.ID, using = "tinymce")
	private static WebElement newCategoryDescription;

	@FindBy(how = How.ID, using = "ParentCategoryId")
	private static WebElement newCategoryParentCategory;

	@FindBy(how = How.XPATH, using = "//div[@class='qq-upload-button-selector btn bg-gradient-green']")
	private static WebElement buttonUploadAFile;

	@FindBy(how = How.XPATH, using = "//button[@name='save']//i[@class='far fa-save']")
	private static WebElement buttonSave;

	@FindBy(how = How.XPATH, using = "//input[@id='ShowOnHomepage']")
	private static WebElement checkShowOnHomepage;

	@FindBy(how = How.ID, using = "AllowCustomersToSelectPageSize")
	private static WebElement checkAllowCustomersToSelectPageSize;

	@FindBy(how = How.XPATH, using = "//*[@id=\"pnlPageSize\"]/div[2]/span[1]/span/span[2]/span[1]/span")
	private static WebElement buttonUp;

	@FindBy(how = How.ID, using = "PageSizeOptions")
	private static WebElement pageSizeOptions;

	/** Update New Category **/

	@FindBy(how = How.ID, using = "SearchCategoryName")
	private static WebElement searchCategoryName;

	@FindBy(how = How.ID, using = "search-categories")
	private static WebElement buttonSearchCategory;

	@FindBy(how = How.XPATH, using = "//*[@id=\"categories-grid\"]/tbody/tr[2]/td[5]/a")
	private static WebElement buttonEdit;
	
	/** Export List Category **/
	
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-success dropdown-toggle']")
	private static WebElement buttonExportCategories;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Export to Excel']")
	private static WebElement exportToExcelCategories;
	
	// Chemin où le fichier sera téléchargé
	public static String downloadPath = "C:\\Users\\Bondka Noura\\eclipse-workspace\\AutomationQA\\target\\categories.xlsx";
	
	/****
	 * Constructor
	 ****/
	
	public CatalogPage() {
		super(Setup.getDriver());
	}

	/***
	 * Getter Products
	 ***/

	public static WebElement getMenuCatalog() {
		return menuCatalog;
	}

	public static WebElement getCatalogProduct() {
		return catalogProducts;
	}

	public static WebElement getTextProduct() {
		return textProducts;
	}

	public static WebElement getNameOfProduct() {
		return nameOfProduct;
	}

	public static WebElement getSearch() {
		return searchProducts;
	}

	public static WebElement getLearnMoreAboutTheProducts() {
		return learnMoreAboutTheProducts;
	}

	/***
	 * Getter Categories
	 ***/

	public static WebElement getCatalogCategories() {
		return catalogCategories;
	}

	public static WebElement getCategories() {
		return categories;
	}

	public static WebElement getAddNewCategories() {
		return addNewCategories;
	}

	public static WebElement getButtonAddNew() {
		return buttonAddNew;
	}

	public static WebElement getTextAddANewCategory() {
		return textAddANewCategory;
	}

	public static WebElement getTextSuccessInCreationgACategory() {
		return textSuccessInCreationgACategory;
	}

	public static WebElement getsearchCategoryName() {
		return searchCategoryName;
	}

	public static WebElement getbuttonSearchCategory() {
		return buttonSearchCategory;
	}

	/***
	 * Getter Add a new category
	 ***/
	public static WebElement getNewCategoryName() {
		return newCategoryName;
	}

	public static WebElement getNewCategoryDescription() {
		return newCategoryDescription;

	}

	public static WebElement getnewCategoryParentCategory() {
		return newCategoryParentCategory;

	}

	public static WebElement getButtonUploadAFile() {
		return buttonUploadAFile;

	}

	public static WebElement getbuttonSave() {

		return buttonSave;

	}

	public static WebElement getPageSizeOptions() {

		return pageSizeOptions;

	}

	public static WebElement getButtonSave() {

		return buttonSave;

	}

	/***
	 *Getter edit categories
	 ***/

	public static WebElement getButtonEdit() {
		return buttonEdit;
	}
	
	/***
	 Getter export categories
	 ***/

	public static WebElement getButtonExportCategories() {
		return buttonExportCategories;
	}
	
	public static WebElement getExportToExcelCategories(){
		//SeleniumUtils.waitForVisibility(exportToExcelCategories);
		return exportToExcelCategories;
	}
	
	/*************************************************************************/

	public static void iFrame() {
		Setup.getDriver().switchTo().frame(frameDescription);
		System.out.println("***********I am in a frame**************");
	}

	public static void getOutIFrame() {
		Setup.getDriver().switchTo().defaultContent();
	}

	public static void selectOptionNewCategory() {
		Select select = new Select(newCategoryParentCategory);
		select.selectByValue("6");

	}

	public void uploadFileWithRobot(String imagePath) {

		StringSelection stringSelection = new StringSelection(imagePath);
		Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipBoard.setContents(stringSelection, null);

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}

		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(150);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void checkShowOnHomepage() {
		boolean isSelected = checkShowOnHomepage.isSelected();

		if (isSelected == false) {
			checkShowOnHomepage.click();
		}
	}

	public static void checkAllowCustomersToSelect() {

		boolean isSelected = checkAllowCustomersToSelectPageSize.isSelected();

		if (isSelected == true) {
			checkAllowCustomersToSelectPageSize.click();
			buttonUp.click();
		}
	}
	
	

}