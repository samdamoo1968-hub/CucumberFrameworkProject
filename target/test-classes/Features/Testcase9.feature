Feature: Newsletter subscription

  Scenario Outline:Subscribe Newsletter by submitting the email id.
    Given Navigate to the URL
    When click on log in link
    And fill email "<email>"
    And fill password "<password>"
    And click on login button
    When verify mail id link in the home after login.
    Then user fill email "<email>" in newsletter field
    And Validate subscription message after filling email
    Examples:
      |email                | password |
      | kjhfdhhrg@gmail.com |testuser  |