Feature: Test User Logout
  Scenario: Successful Logout
    Given the user is logged in
    When the user clicks on the My Account button
    And clicks on the Logout button
    Then the user should be logged out successfully
