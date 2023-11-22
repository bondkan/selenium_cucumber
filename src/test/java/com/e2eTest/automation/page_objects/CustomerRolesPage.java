package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class CustomerRolesPage extends BasePage {

	@FindBy(how = How.XPATH, using = "//p[normalize-space()='Customer roles']")
	private static WebElement customerRoles;

	@FindBy(how = How.XPATH, using = "//h1[@class='float-left']")
	private static WebElement textCustomerRoles;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement buttonAddNewCustomerRoles;

	/****
	 * Constructor
	 ****/

	public CustomerRolesPage() {
		super(Setup.getDriver());
	}
	
	/****
	 * Method
	 ****/

	public static WebElement getCustomerRoles() {
		return customerRoles;
	}

	public static WebElement getTextCustomerRoles() {
		return textCustomerRoles;
	}

	public static WebElement getButtonAddNewCustomerRoles() {
		return buttonAddNewCustomerRoles;
	}

}
