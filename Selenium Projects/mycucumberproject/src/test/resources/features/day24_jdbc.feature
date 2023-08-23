@jdbc
Feature: jdbc_feature
  Scenario: TC01_read_customer_login_information
    Given user connects to the application database
    And user gets the column "*" from the table "jhi_user"
    And user reads all the column "login" data