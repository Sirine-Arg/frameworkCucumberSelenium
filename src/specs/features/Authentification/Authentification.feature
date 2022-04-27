@connexion
Feature: Authentification - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

@cnx
  Scenario: Authentification - OrangeHRM
    Given Je me connecte à l'application Orange
    When Je saisi Username
    And Je saisi Passeword
    And Je clique sur le bouton Login
    Then Redirection vers le compte admin
