@All
Feature: Uber Car Booking

  @Smoke
  Scenario: Booking a mini car
    Given User wants to select a car type "mini" from uber app
    When User selects car "mini" and pick up point is "Delhi" and drop off point is "Noida"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 2000 inr

  @Sanity
  Scenario: Booking a sedan car
    Given User wants to select a car type "sedan" from uber app
    When User selects car "sedan" and pick up point is "Delhi" and drop off point is "Gurgaon"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 2000 inr

  @Regression
  Scenario: Booking a suv car
    Given User wants to select a car type "suv" from uber app
    When User selects car "suv" and pick up point is "Delhi" and drop off point is "Lucknow"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 2000 inr