Feature: Add item to wishlist

  Scenario Outline:Add item to wishlist
    Given Navigate to the URL
    When click on log in link
    And fill email "<email>"
    And fill password "<password>"
    And click on login button
    When verify mail id link in the home after login.
    And click on any item from Featured products
    And fill Recepients name and email
    And add the product to wishlist
    Then Verify message and click on click on close button.
    Then Click on wishlist link from navigation menu at the top of homepage
  Then verify product name in wishlistpage
    Examples:
      |email                | password |
      | kjhfdhhrg@gmail.com |testuser  |