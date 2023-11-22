package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.AddNewCustomerRolesPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;

public class AddNewCustomersRolesStepDefinition {
	
	private SeleniumUtils seleniumUtils;
	private AddNewCustomerRolesPage addNewCustomerRolesPage;

	public AddNewCustomersRolesStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		addNewCustomerRolesPage = new AddNewCustomerRolesPage();
	}
	
	
	@Then("Je saisie le nom {string}")
	public void jeSaisieLeNom(String name) {
	
		seleniumUtils.writeText(AddNewCustomerRolesPage.getNameCustomerRoles(), name);
	}
	
	@Then("Je clique sur choisissez un produit")
	public void jeCliqueSurChoisissezUnProduit() {
		
		seleniumUtils.click(AddNewCustomerRolesPage.getButtonPurchasedWithProduct());
	}
	
	@Then("Je selectionne le produit {string}")
	public void jeSelectionneLeProduit(String text) throws InterruptedException {
	   
		AddNewCustomerRolesPage.switchToNewWindows();
		Thread.sleep(5000);
		seleniumUtils.writeText(AddNewCustomerRolesPage.getSearchProductName(), text);
		seleniumUtils.click(AddNewCustomerRolesPage.getButtonSearch());
		seleniumUtils.click(AddNewCustomerRolesPage.getButtonSelect());
		AddNewCustomerRolesPage.switchToTheParentWindow();
		
	}
	
	@Then("Je sauvegarde")
	public void jeSauvegarde(){
		
		seleniumUtils.click(AddNewCustomerRolesPage.getButtonSave());
	}

	
}
