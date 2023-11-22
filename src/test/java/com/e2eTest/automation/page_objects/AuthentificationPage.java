package com.e2eTest.automation.page_objects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class AuthentificationPage extends BasePage{

	//Identification element+constructeur+creation methode
	
	/*retrieve web elements*/
	@FindBy(how = How.ID, using = "Email")
    private static WebElement email;
	
	@FindBy(how = How.ID, using = "Password")
    private static WebElement password;
	
	@FindBy(how = How.ID, using = "//li[normalize-space()='No customer account found']")
	private static WebElement errorMessage;//
	
	@FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='Logout']")
    private static WebElement btnLogout;
	
	@FindBy(how = How.XPATH, using = "//h1[normalize-space()='Dashboard']")
    private static WebElement dashboard;
	
	
	
	// @FindBy(id = "Email")
    //private static WebElement email;

	public AuthentificationPage() {
		//lazim na3ayat li driver ili sana3tou ana
		super(Setup.getDriver());
		
	}
	
	public static WebElement getEmail() {
		return email;
		}
	public static WebElement getPassword() {
		return password;
	}
	public static WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public static WebElement getErrorMessage() {
		return errorMessage;
	}
	
	public static WebElement getDashboard() {
		return dashboard;
	}

	public static WebElement getBtnLogout() {
		return btnLogout;
	}

	
	
	

}
