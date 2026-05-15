@Smoke
Feature: Perform Login

  Scenario Outline:Login user
    Given Navigate to the URL
    When click on log in link
    And fill email "<email>"
    And fill password "<password>"
    And click on login button
    When verify mail id link in the home after login.

    Examples:
      |email                | password |
      | kjhfdhhrg@gmail.com |testuser  |