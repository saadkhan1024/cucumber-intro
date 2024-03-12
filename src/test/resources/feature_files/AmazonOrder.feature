Feature: Amazon Order Page
  Background:
    Given A registered user exists
    Given User is on Amazon login page
    When User enters username
    And User enters password
    And User clicks on login button
    Then User navigates to order page

  Scenario: Check order details
    When User clicks on orders link
    Then User checks order details

  Scenario: Check open order details
    When User clicks on open orders link
    Then User checks open order details

  Scenario: Check cancelled order details
    When User clicks on cancelled orders link
    Then User checks cancelled order details