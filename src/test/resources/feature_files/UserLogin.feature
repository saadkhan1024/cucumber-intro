#Parameter passing or data driven using scenario outline and examples keyword. Applies to all the scenario steps.
 Feature: User Login
   Scenario Outline: Login fail - possible combinations
     Given User is on application login page
     When User clicks on sign in button
     Then User is displayed login screen
     When User enters "<username>" in username field
     And User enters "<password>" in password field
     And User clicks on login button
     Then User gets login failed error message

     Examples:
       | username          | password          |
       | incorrectusername | 12345             |
       | saad              | incorrectpassword |
       | incorrectusername | incorrectpassword |