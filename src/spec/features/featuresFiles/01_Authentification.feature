@authentification
Feature: je souhaite vérifier la page d authentification
  En tant que utilisateur je souhaite vérifier la page de connexion

  Background: 
    Given Je me connecte sur l application nopcommerce

  @authentification_valide
  Scenario: Je souhaite vérifier la page d authentification
    When Je saisie l E-mail "admin@yourstore.com"
    And Je saisie le Mot de passe "admin"
    And Je clique sur le bouton se connecter
    Then Je me redirige vers la page Home "Dashboard"

  @authentification_invalide
  Scenario: Je souhaite vérifier la page d authentification
    When Je saisie l E-mail "exemple@yourstore.com"
    And Je saisie le Mot de passe "xxxxxx"
    And Je clique sur le bouton se connecter
    Then Je verifie le message d erreur "No customer account found"

  @logout
  Scenario: je souhaite me déconnecter
    When Je saisie l E-mail "admin@yourstore.com"
    And Je saisie le Mot de passe "admin"
    And Je clique sur le bouton se connecter
    When Je clique sur le bouton deconnecter
