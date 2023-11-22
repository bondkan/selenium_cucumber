package com.e2eTest.automation.step_definitions;

import org.junit.Assert;


import com.e2eTest.automation.page_objects.CustomersPage;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomorsStepDefinition  {
	private SeleniumUtils seleniumUtils;
	private CustomersPage customersPage;

	public CustomorsStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		customersPage = new CustomersPage();
	}

	@When("Je selectionne le menu Clients")
	public void jeSelectionneLeMenuClients() {
		
		seleniumUtils.click(CustomersPage.getMenuCustomers());
	}
	@Then("Je clique sur Clients")
	public void jeCliqueSurClients() {
		
		seleniumUtils.click(CustomersPage.getCustomers());
	}
	
	@Then("Je me redirige vers la page Clients {string}")
	public void jeMeRedirigeVersLaPageClients(String text) throws InterruptedException {
		
		String messsage = CustomersPage.getTextCustomers().getText();
		System.out.println(messsage + "**************" );
		Assert.assertTrue(messsage.contains(text));
		
	}
	@When("Je clique sur le bouton Ajouter un nouveau")
	public void jeCliqueSurLeBoutonAjouterUnNouveau() throws InterruptedException {
		
		seleniumUtils.click(CustomersPage.getButtonAddNewCustomers());
		Thread.sleep(5000);
		System.out.println("2222");
	}
	
	@Then("Je me verifie le message {string}")
	public void jeMeVerifieLeMessage(String text) {
	    
		String messsage = CustomersPage.getMessageSuccessCreatCustomers().getText();
		System.out.println(messsage + "**************" );
		Assert.assertTrue(messsage.contains(text));
	}
	@Then("Je verifie que le client est ajouté dans la liste avec l email {string}")
	public void jeVerifieQueLeClientEstAjoutéDansLaListeAvecLEmail(String email) {
		
		CustomersPage.findEmail(email);
	}

	@When("Je clique sur modifier le client")
	public void jeModifieLeClient() {
		
		seleniumUtils.click(CustomersPage.getButtonEdit());
	}
	




















}
