@HomePage
Feature: Je souhaite gérer catalogue
  En tant que utilisateur je souhaite avoir gérer catalogue

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisie l E-mail "admin@yourstore.com"
    And Je saisie le Mot de passe "admin"
    And Je clique sur le bouton se connecter
    Then Je me redirige vers la page Home "Dashboard"
    When Je clique sur catalogue

  @CatalogSearchProduct
  Scenario: Je souhaite rechercher un Produit
    Then Je clique sur produit
    And Je me redirige vers la page products "Products"
    When Je saisie le nom de produit "Lenovo"
    And Je clique sur le recherche
    Then La page de la liste de produit affiche "Learn more about products"

  @CatalogAddNewCategories
  Scenario: Je souhaite ajouter un nouveau Categories
    Then Je clique sur categories
    And Je me redirige vers la page categories "Categories"
    When Je clique sur le bouton ajouter un nouveau
    And Je me redirige vers la page ajouter nouveau categories "Add a new category back to category list"
    When Je saisie le nom de produit de category "Camescopes professionnels"
    Then Je saisie la description "Cameras video professionnelles"
    And Je choisis Categorie Parentale
    And Je telecharge un fichier
    And Je coche la case Show on home page
    And Je saisie les trois valeurs "7,8,9" dans le champ Autoriser les clients à sélectionner la taille de la page
    # And je ouvre le Mappings
    # And je selectionne Limited to customer roles
    # And je selectionne Limited to stores
    And Je cliquer sur le bouton sauvegarder
    Then Je verifie le message de succes "×"

  @CatalogEditCategoryDetails
  Scenario: Je souhaite modifier le nouveau Categories
    Then Je clique sur categories
    And Je me redirige vers la page categories "Categories"
    When Je saisie le nom de categories "Electronics >> Camera & photo >> Camescopes professionnels"
    Then Je clique sur le bouton chercher
    Then Je clique sur le bouton modifier
   #  And Je me redirige vers la page modifier categories "Edit category details - Electronics  back to category list"  
   #  And Je saisie un nouveau description "Cameras video professionnelles modifier"
   #  And Je modifie l image
   #  And Je clique sur sauvegarder
   
   @CatalogExportCategoryDetails
   Scenario: Je souhaite Exporter la liste des Categories
   Then Je clique sur categories
    And Je me redirige vers la page categories "Categories"
    And Je clique sur l export
   
   
