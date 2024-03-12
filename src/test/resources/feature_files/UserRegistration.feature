#Parameter passing or data driven using data table. Applies only to specific step under which data table is provided.
Feature: User Registration
  Scenario: User registration with different data
    Given User is on registration page
    When User enters following user details
      | saad   | khan  | sk@gmail.com | 99999 | lucknow |
      | tom    | hardy | tm@gmail.com | 88888 | london  |
      | walter | white | ww@gmail.com | 77777 | dallas  |
    Then User registration should be successful

  Scenario: User registration with different data with columns
    Given User is on registration page
    When User enters following user details with columns
      | firstname | lastname | email        | phone | city    |
      | saad      | khan     | sk@gmail.com | 99999 | lucknow |
      | tom       | hardy    | tm@gmail.com | 88888 | london  |
      | walter    | white    | ww@gmail.com | 77777 | dallas  |
    Then User registration should be successful