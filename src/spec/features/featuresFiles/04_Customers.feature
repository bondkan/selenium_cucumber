Feature: Je souhaite gérer clients
  En tant que utilisateur je souhaite gérer clients

  Background: 
    Given Je me connecte sur l application nopcommerce
    When Je saisie l E-mail "admin@yourstore.com"
    And Je saisie le Mot de passe "admin"
    And Je clique sur le bouton se connecter
    Then Je me redirige vers la page Home "Dashboard"
    When Je selectionne le menu Clients
    
    @AddANewCustomor
  Scenario: Je souhaite ajouter un nouveau client
    Then Je clique sur Clients
    And Je me redirige vers la page Clients "Customers"
    When Je clique sur le bouton Ajouter un nouveau
    #And Je me redirige vers la page " Add a new customer "
    And Je saisie Email "bondka22.noura@gmail.com"
    And Je coche Genre
    And Je saisie Date d anniversaire "10/20/2000"
    #And Je selectionne Roles des clients
    And Je selectionne Responsable du vendeur
    When Je clique sur Sauvegarder client
    #Then Je me verifie le message " The new customer has been added successfully. "
    #Then Je verifie que le client est ajouté dans la liste avec l email "bondka19.noura@gmail.com"
    When Je clique sur modifier le client
    #Then Je me redirige vers la page modifier Clients "Edit customer details"
    Then Je cliquer sur supprimer client 
    
    
    
    