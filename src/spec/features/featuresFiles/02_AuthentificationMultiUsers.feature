@multiusers
Feature: Je souhaite verifier la connexion avec plusieurs utilisateurs
  ETQ utilisateur je souhaite verifier la connexion avec plusieurs utilisateurs

  Background: 
    Given Je me connecte sur l application nopcommerce

  @authentificationmultiusers
  Scenario Outline: Je souhaite verifier la connexion avec plusieurs utilisateurs
    When je saisie l E-mail "<name>"
    And je saisie le Mot de passe "<value>"
    And je clique sur le bouton se connecter
    


    Examples: 
      | name                | value |
      | admin@yourstore.com | admin |
      | Ramla@yourstore.com | Ramla |
      | Hajer@yourstore.com | Hajer |
      | Amir@yourstore.com  | Amir  |        
