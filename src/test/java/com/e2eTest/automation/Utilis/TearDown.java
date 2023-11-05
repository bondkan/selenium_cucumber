package com.e2eTest.automation.Utilis;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class TearDown {

	/**
	 * This method is used to close browser. This method is called after the
	 * invocation of each test method in given class.
	 * 
	 * @After Methods annotated with @After execute after every scenario.
	 */
	@After
	public void quitDriver(Scenario scenario) {
		/**si cas de test ko ya3mal screan shot ba3id fermer navigateur (bich yorbitha ma3a rapport
		si cas de test ok fermer navigateur directement **/

		
		if (scenario.isFailed()) {
			final byte[] screenShot = ((TakesScreenshot) Setup.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "Screenshot: " + scenario.getName());	
		}
		Setup.getDriver().quit();
		Setup.getLogger().info("Scenario: " + scenario.getName() + "- finishid.status: " + scenario.getStatus());
	}
}