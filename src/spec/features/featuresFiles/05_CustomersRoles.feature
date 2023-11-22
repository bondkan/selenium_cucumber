@customers_role 
Feature: Je souhaite gérer les roles des clients
  En tant que utilisateur je souhaite gérer promotion

Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisie l E-mail "admin@yourstore.com"
    And Je saisie le Mot de passe "admin"
    And Je clique sur le bouton se connecter
    Then Je me redirige vers la page Home "Dashboard"
    When Je selectionne le menu Clients
    
  @add_new_customers_roles
  Scenario: Je souhaite ajouter un nouveau role de client 
    Then Je clique sur Roles des clients
    #And Je me redirige vers la page Rôles des clients "Customer roles"
    When Je clique sur Ajouter un nouveau
    #Then Je me redirige vers la page Ajouter un nouveau rôle client "Add a new customer role"
    And Je saisie le nom "newCustomerRoles"
    And Je clique sur choisissez un produit
    And Je selectionne le produit "Build your own computer"
    And Je sauvegarde 

  