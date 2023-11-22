package com.e2eTest.automation.step_definitions;


import com.e2eTest.automation.page_objects.CustomerRolesPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerRolesStepDefinition {

	private SeleniumUtils seleniumUtils;
	private CustomerRolesPage customerRolesPage;

	public CustomerRolesStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		customerRolesPage = new CustomerRolesPage();
	}

	@Then("Je clique sur Roles des clients")
	public void jeCliqueSurRolesDesClients() throws InterruptedException {
		
		Thread.sleep(3000);
		seleniumUtils.click(CustomerRolesPage.getCustomerRoles());
	}
	
	@When("Je clique sur Ajouter un nouveau")
	public void jeCliqueSurAjouterUnNouveau() throws InterruptedException {

		Thread.sleep(3000);
		seleniumUtils.click(CustomerRolesPage.getButtonAddNewCustomerRoles());

	}




}
