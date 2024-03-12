Feature: Amazon Search

  @Smoke
  Scenario: Search for product 1
    Given I have a search field on Amazon home page
    When I search for a product with name "Bag" and price 1000
    Then Products with name "Bag" and price 1000 should be displayed

  @Regression
  Scenario: Search for product 2
    Given I have a search field on Amazon home page
    When I search for a product with name "Watch" and price 500
    Then Products with name "Watch" and price 500 should be displayed