Feature: Test User Login and Logout
@Login
  Scenario: Successful Login
    Given the user is on the login page
    When the user enters valid username and password 
    And clicks the login button
    Then the user should be logged in successfully


