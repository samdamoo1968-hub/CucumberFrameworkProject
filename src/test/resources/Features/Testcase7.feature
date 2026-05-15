@Smoke
Feature:Search product

  Scenario Outline:Search product in Home Page
    Given Navigate to the URL
    When user search a product "<search_product>"
    Then user Validates the result product contains the search productname in it
    Examples:
      |search_product  |
      |comp            |