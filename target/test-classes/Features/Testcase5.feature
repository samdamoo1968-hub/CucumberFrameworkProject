Feature: Checkout

  Scenario Outline:Add to cart and perform Checkout
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
    And click on terms and condition checkbox
    Then click on checkout button
    And Validate checkout page header
    And Validate billing address header
    Then Validate billing address dropdown
    And click on continue button after validating billing address
    And Validate Payment method header
    Then click on Cash on delivery option
    Then click on continue button after choosing COD
    And Validate Payment information header
    Then validate payment option selected message
    And click on continue button after validating payment option message
    Then Validate Confirm order header
    And Validate product name in confirm order section
    Then click on confirm button
    Then Validate order successful message
    Then print order number in console
    Then click on continue button after printing order number
    And  validate page title in homepage



    Examples:
      |email                | password |
      | kjhfdhhrg@gmail.com |testuser  |