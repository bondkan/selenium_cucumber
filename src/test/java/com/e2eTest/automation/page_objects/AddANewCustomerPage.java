package com.e2eTest.automation.page_objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AddANewCustomerPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//h1[@class='float-left']")
	private static WebElement textAddANewCustomer;
	
	@FindBy(how = How.ID, using = "Email")
	private static WebElement email;
	
	@FindBy(how = How.ID, using = "Gender_Female")
	private static WebElement genderFemale;
	
	@FindBy(how = How.ID, using = "//span[@class='k-icon k-i-calendar']")
	private static WebElement calander;

	@FindBy(how = How.XPATH, using = "//input[@id='DateOfBirth']")
	private static WebElement dateOfBirth;
	
	@FindBy(how = How.ID, using = "//div[@class='input-group-append input-group-required']//div[@class='k-widget k-multiselect k-multiselect-clearable']")
	private static WebElement customerRoles;

	@FindBy(how = How.XPATH, using = "//*[@id=\"SelectedCustomerRoleIds\"]/option")
	private static WebElement customerRolesOption; 

	@FindBy(how = How.ID, using = "VendorId")
	private static WebElement managerOfVendor;
	
	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement buttonSave;

	/****
	 * Constructor
	 ****/

	public AddANewCustomerPage() {
		super(Setup.getDriver());
	}

	/****
	 * Method Add A New Customer Page
	 ****/

	public static WebElement getTextAddANewCustomer() {
		return textAddANewCustomer;
	}

	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getGenderFemale() {
		return genderFemale;
	}

	public static WebElement getCalander() {
		return calander;
	}

	public static WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public static WebElement getCustomerRoles() {
		return customerRoles;
	}

	public static WebElement getManagerOfVendor() {
		return managerOfVendor;
	}

	public static WebElement getButtonSave() {
		return buttonSave;
	}

	public static void selectOptionCustomerRoles() {
		Select select = new Select(customerRolesOption);
		List<WebElement> options = select.getOptions();
		for (WebElement option : options)
			System.out.println(option.getText()+ "**************");

		if (select.isMultiple()) {

			System.out.println("Select option Opel by value" + "**************");
			select.selectByIndex(2);
		}

	}

	public static void selectOptionManagerOfVendor() {
		Select select = new Select(managerOfVendor);
		select.selectByIndex(2);

	}

}
