package com.e2eTest.automation.page_objects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class UpdateCustomerDetailsPage extends BasePage{

	@FindBy(how = How.ID, using = "customer-delete")
	private static WebElement buttonCustomerDelete;

	/****
	 * Constructor
	 ****/

	public UpdateCustomerDetailsPage() {
		super(Setup.getDriver());
	}

	public static WebElement getButtonCustomerDelete() {
		return buttonCustomerDelete;
	}

	public static void AlertDelete() {
		
		try {   
			WebDriverWait wait = new WebDriverWait(Setup.getDriver(), Duration.ofSeconds(20));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert simpleAlert = Setup.getDriver().switchTo().alert();
			simpleAlert.accept();
			System.out.println("Unexpected alert accepted");
		} catch (Exception e) {
			System.out.println("unexpected alert not present");
		}

	}

}
