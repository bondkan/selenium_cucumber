package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.UpdateCustomerDetailsPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;

public class UpdateCustomerDetailsStepDefinition {

	private SeleniumUtils seleniumUtils;
	private UpdateCustomerDetailsPage updateCustomerDetailsPage;

	public UpdateCustomerDetailsStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		updateCustomerDetailsPage = new UpdateCustomerDetailsPage();
	}
	
	@Then("Je me redirige vers la page modifier Clients {string}")
	public void jeMeRedirigeVersLaPageModifierClients(String string) {
	  
	}
	
	@Then("Je cliquer sur supprimer client")
	public void jeCliquerSurSupprimerClient() throws InterruptedException {
		
		seleniumUtils.click(UpdateCustomerDetailsPage.getButtonCustomerDelete());
		Thread.sleep(5000);
		UpdateCustomerDetailsPage.AlertDelete();
	}
	
}
