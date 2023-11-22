package com.e2eTest.automation.step_definitions;

import org.junit.Assert;

import com.e2eTest.automation.page_objects.AddANewCustomerPage;
import com.e2eTest.automation.page_objects.CustomersPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddANewCustomerStepDefinition {
	private SeleniumUtils seleniumUtils;
	private AddANewCustomerPage addANewCustomerPage;

	public AddANewCustomerStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		addANewCustomerPage = new AddANewCustomerPage();

	}

	@Then("Je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPage(String text) throws InterruptedException {

		String messsage = AddANewCustomerPage.getTextAddANewCustomer().getText();
		System.out.println(messsage + "2**************");
		Assert.assertTrue(messsage.contains(text));
	}

	@Then("Je saisie Email {string}")
	public void jeSaisieEmail(String email) {

		seleniumUtils.writeText(AddANewCustomerPage.getEmail(), email);
	}

	@Then("Je coche Genre")
	public void jeCocheGenre() {

		seleniumUtils.click(AddANewCustomerPage.getGenderFemale());

	}

	@Then("Je saisie Date d anniversaire {string}")
	public void jeSaisieDateDAnniversaire(String date) throws InterruptedException {
		
		seleniumUtils.writeText(AddANewCustomerPage.getDateOfBirth(), date);
	}

	@Then("Je selectionne Roles des clients")
	public void jeSelectionneRolesDesClients() {

		seleniumUtils.click(AddANewCustomerPage.getCustomerRoles());
		AddANewCustomerPage.selectOptionCustomerRoles();
	}

	@Then("Je selectionne Responsable du vendeur")
	public void jeSelectionneResponsableDuVendeur() {
	
		AddANewCustomerPage.selectOptionManagerOfVendor();
	}

	@When("Je clique sur Sauvegarder client")
	public void jeCliqueSurSauvegarderClient() throws InterruptedException {
	
		seleniumUtils.click(AddANewCustomerPage.getButtonSave());
		Thread.sleep(5000);
	}

}
