package com.e2eTest.automation.step_definitions;



import org.junit.Assert;

import com.e2eTest.automation.page_objects.AuthentificationPage;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.SeleniumUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AuthentificationStepDefinition {

	private AuthentificationPage authentificationPage;

	// creation objet diviser 2 partie
	private SeleniumUtils seleniumUtils; // hériter

	private ConfigFileReader configFileReader;

	public AuthentificationStepDefinition() {// construteur
		
		seleniumUtils = new SeleniumUtils();
		authentificationPage = new AuthentificationPage();
		configFileReader = new ConfigFileReader();
	}

	/* TC_01 */
	@Given("Je me connecte sur l application nopcommerce")
	public void jeMeConnecteSurLApplicationNopcommerce() {

		seleniumUtils.get(configFileReader.getProperties("home.recette"));
	}

	@When("Je saisie l E-mail {string}")
	public void jeSaisieLEMail(String email) {

		seleniumUtils.writeText(AuthentificationPage.getEmail(), email);
	}

	@When("Je saisie le Mot de passe {string}")
	public void jeSaisieLeMotDePasse(String password) {

		seleniumUtils.writeText(AuthentificationPage.getPassword(), password);
	}

	@When("Je clique sur le bouton se connecter")
	public void jeCliqueSurLeBoutonSeConnecter() {

		seleniumUtils.click(AuthentificationPage.getBtnLogin());
	}

	@Then("Je me redirige vers la page Home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) throws InterruptedException {
		
		Thread.sleep(3000);
		String messsage = AuthentificationPage.getDashboard().getText();
		System.out.println(messsage + "**************" );
		Assert.assertEquals(messsage, text);
	}

	/* TC_02 */

	@Then("Je verifie le message d erreur {string}")
	public void JeVerifieLeMessageDErreur(String text) throws InterruptedException{
		Thread.sleep(3000);
		String messsage = AuthentificationPage.getErrorMessage().getText();
		System.out.println(messsage + "**************" );
		Assert.assertEquals(messsage, text);
	}

	/* TC_03 */

	@When("Je clique sur le bouton deconnecter")
	public void jeCliqueSurLebButonDeconnecter()  {

		seleniumUtils.click(AuthentificationPage.getBtnLogout());

	}

}
