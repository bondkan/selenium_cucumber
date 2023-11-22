package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.CatalogPage;
import com.e2eTest.automation.page_objects.UpdateCategoriesPage;
import com.e2eTest.automation.utils.SeleniumUtils;
import org.openqa.selenium.Keys;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateCategoriesDefinitions {

	private SeleniumUtils seleniumUtils;
	private CatalogPage catalogPage;
	private UpdateCategoriesPage updateCategoriesPage;

	public UpdateCategoriesDefinitions() {

		seleniumUtils = new SeleniumUtils();
		catalogPage = new CatalogPage();
		updateCategoriesPage = new UpdateCategoriesPage();

	}

	@Then("Je me redirige vers la page modifier categories {string}")
	public void jeMeRedirigeVersLaPageModifierCategories(String string) {

	}

	@Then("Je saisie un nouveau description {string}")
	public void jeSaisieUnNouveauDescription(String string) {

	}

	@Then("Je modifie l image")
	public void jeModifierLImage() {

	}

	@Then("Je clique sur sauvegarder")
	public void jeCliqueSurSauvegarder() {

	}

}
