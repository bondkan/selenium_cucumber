#Language: fr
@authentification
Feature: je souhaite vérifier la page d authentification 
  En tant que utilisateur je souhaite vérifier la page de connexion 

  @authentification_valide
  Scenario: je souhaite vérifier la page d authentification 
    Given Je me connecte sur l application nopcommerce
    When je saisie l E-mail "admin@yourstore.com"
    And je saisie le Mot de passe "admin"
    And je clique sur le bouton se connecter
    Then je  me redirige vers la page Home

    
    
#Fonctionnalité:
#Scénario:
#Etant donnée
#Quand
#Alors
#Et

  