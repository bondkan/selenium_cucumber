package com.e2eTest.automation.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CatalogStepDefinition {

	private SeleniumUtils seleniumUtils;
	private CatalogPage catalogPage;
	public static String filePath = "C:\\Users\\Bondka Noura\\OneDrive\\Bureau\\Record Automation Test\\canon.png";

	public CatalogStepDefinition() {

		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();

	}

	@When("Je clique sur catalogue")
	public void jeCliqueSurCatalogue() throws InterruptedException {

		Thread.sleep(3000);
		seleniumUtils.click(CatalogPage.getMenuCatalog());
	}

	/***
	 * Products
	 ***/

	@When("Je clique sur produit")
	public void jeCliqueSurProduit() {

		seleniumUtils.click(CatalogPage.getCatalogProduct());
	}

	@Then("Je me redirige vers la page products {string}")
	public void jeMeRedirigeVersLaPageProducts(String text) throws InterruptedException {

		Thread.sleep(3000);
		String messsage = CatalogPage.getTextProduct().getText();
		System.out.println(messsage + "**************");
		Assert.assertEquals(messsage, text);
	}

	@When("Je saisie le nom de produit {string}")
	public void jeSaisieLeNomDeProduit(String product) {

		seleniumUtils.writeText(CatalogPage.getNameOfProduct(), product);
	}

	@Then("Je clique sur le recherche")
	public void jeCliqueSurLeRecherche() {

		seleniumUtils.click(CatalogPage.getSearch());
	}

	@Then("La page de la liste de produit affiche {string}")
	public void laPageDeLaListeDeProduitAffiche(String text) throws InterruptedException {

		Thread.sleep(3000);
		String messsage = CatalogPage.getLearnMoreAboutTheProducts().getText();
		System.out.println(messsage + "**************");
		Assert.assertEquals(messsage, text);
	}

	/***
	 * Categories
	 ***/

	@When("Je clique sur categories")
	public void jeCliqueSurCategories() throws InterruptedException {

		Thread.sleep(3000);
		seleniumUtils.click(CatalogPage.getCatalogCategories());
	}

	@Then("Je me redirige vers la page categories {string}")
	public void jeMeRedirigeVersLaPageCategories(String text) throws InterruptedException {

		Thread.sleep(3000);
		String messsage = CatalogPage.getCategories().getText();
		System.out.println(messsage + "**************");
		Assert.assertEquals(messsage, text);
	}

	@When("Je clique sur le bouton ajouter un nouveau")
	public void jeCliqueSurLeBoutonAjouterUnNouveau() {

		seleniumUtils.click(CatalogPage.getButtonAddNew());
	}

	@Then("Je me redirige vers la page ajouter nouveau categories {string}")
	public void jeMeRedirigeVersLaPageAjouterNouveauCategories(String text) throws InterruptedException {

		Thread.sleep(3000);
		String messsage = CatalogPage.getTextAddANewCategory().getText();
		System.out.println(messsage + "**************");
		Assert.assertEquals(messsage, text);
	}

	/*****************************/
	@When("Je saisie le nom de produit de category {string}")
	public void jeSaisieLeNomDeProduitDeCategory(String text) {

		seleniumUtils.writeText(CatalogPage.getNewCategoryName(), text);
		
	}

	@Then("Je saisie la description {string}")
	public void jeSaisieLaDescription(String text) throws InterruptedException {

		CatalogPage.iFrame();
		Thread.sleep(3000);
		seleniumUtils.writeText(CatalogPage.getNewCategoryDescription(), text);
	}

	@Then("Je choisis Categorie Parentale")
	public void jeChoisisCategorieParentale() throws InterruptedException {

		CatalogPage.getOutIFrame();
		seleniumUtils.click(CatalogPage.getnewCategoryParentCategory());
		Thread.sleep(3000);
		CatalogPage.selectOptionNewCategory();

	}

	@Then("Je telecharge un fichier")
	public void jeTelechargeUnFichier() throws InterruptedException {

		CatalogPage.getOutIFrame();
		System.out.println("I am out the frame");
		seleniumUtils.click(CatalogPage.getButtonUploadAFile());
		Thread.sleep(5000);
		catalogPage.uploadFileWithRobot(filePath);

	}

	@Then("Je cliquer sur le bouton sauvegarder")
	public void jeCliquerSurLeBoutonSauvegarder() throws InterruptedException {

		CatalogPage.getOutIFrame();
		Thread.sleep(6000);
		seleniumUtils.click(CatalogPage.getButtonSave());
	}

	@Then("Je verifie le message de succes {string}")
	public void JeVerifieLeMessageDeSucces(String text) {
		
		String messsage = CatalogPage.getTextSuccessInCreationgACategory().getText();
		System.out.println(messsage + "**************");
		// Assert.assertEquals(messsage, text);
		Assert.assertTrue(messsage.contains(text));

	}

	@Then("Je coche la case Show on home page")
	public void jeCocheLaCaseShowOnHomePage() {

		CatalogPage.checkShowOnHomepage();
	}

	@Then("Je saisie les trois valeurs {string} dans le champ Autoriser les clients à sélectionner la taille de la page")
	public void jeSaisieLesTroisValeursDansLeChampAllowCustomersToSelectPageSize(String text) {
		seleniumUtils.writeText(CatalogPage.getPageSizeOptions(), text);
		// CatalogPage.checkAllowCustomersToSelect();
	}

	@Then("Je ouvre le Mappings")
	public void jeOuvreLeMappings() {

	}

	@Then("Je selectionne Limited to customer roles")
	public void jeSelectionneLimitedToCustomerRoles() {

	}

	@Then("Je selectionne Limited to stores")
	public void jeSelectionneLimitedToStores() {

	}

	
	/***
	 * Update New Categories
	 ***/
	

	@When("Je saisie le nom de categories {string}")
	public void jeSaisieLeNomDeCategories(String text) {
		seleniumUtils.writeText(CatalogPage.getsearchCategoryName(), text);
	}
	
	@When("Je clique sur le bouton chercher")
	public void jeCliqueSurSonBoutonSearch() {
		seleniumUtils.click(CatalogPage.getbuttonSearchCategory());
	}

	@Then("Je clique sur le bouton modifier")
	public void jeCliqueSurLeBoutonModifier() {
		
		seleniumUtils.click(CatalogPage.getButtonEdit());
		
	}

	
	/***
	 * Export List Categories
	 * @throws InterruptedException 
	 ***/
	
	@Then("Je clique sur l export")
	public void jeCliqueSurLExport() throws InterruptedException {
		
		seleniumUtils.click(CatalogPage.getButtonExportCategories());
		Thread.sleep(3000);
		seleniumUtils.click(CatalogPage.getExportToExcelCategories());
		//CatalogPage.verifyExport();
	}
	
}
