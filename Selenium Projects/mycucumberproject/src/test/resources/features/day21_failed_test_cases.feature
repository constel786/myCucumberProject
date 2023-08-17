@failed_tests
Feature: data_tables
  # Failing the test case on purpose
  Scenario: TC01_admin_login
    Given user navigates to "https://www.bluerentalcars.com/login"
    When user enters the admin email and password
      | admin_email        | admin_password |
      | wrong_id@gmail.com | 12345          |
    And user click on the login button
    Then verify the login is successful
    And close the application