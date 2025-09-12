Feature: Remove item from cart

  Scenario Outline: Add an item to cart and remove it.
    Given Navigate to the URL
    When click on log in link
    And fill email "<email>"
    And fill password "<password>"
    And click on login button
    When verify mail id link in the home after login.
    And click on any item from Featured products
    And fill Recepients name and email
    And click on add to cart button
    Then Validate notification message bar
    When click on shopping cart link from navigation bar
    Then Validate product name in cart page
    When remove item in the cart page
    Then validate empty cart message


    Examples:
      |email                | password |
      | kjhfdhhrg@gmail.com |testuser  |
