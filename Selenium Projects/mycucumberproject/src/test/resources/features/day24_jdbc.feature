@jdbc
Feature: jdbc_feature
  Background: connect_db
    Given user connects to the application database
  @user_login
  Scenario: TC01_read_customer_login_information
    And user gets the column "*" from the table "jhi_user"
    And user reads all the column "login" data
  @user_email
  Scenario: TC02_read_customer_email_information
    And user gets the column "*" from the table "jhi_user"
    And user reads all the column "email" data
  @user_account
  Scenario: TC03_read_customer_account_information
    And user gets the column "*" from the table "tp_account"
    And user reads all the column "account_type" data

#      Verify if account table account types contains at least one
#      CHECKING, CREDIT_CARD, SAVING, INVESTING options

  Scenario Outline: TC04_verify account types
    And user gets the column "*" from the table "tp_account"
    Then verify table "<table_name>" and column "<column_name>" contains following data "<data_name>"
    Examples: data
      | table_name | column_name  | data_name   |
      | tp_account | account_type | CHECKING    |
      | tp_account | account_type | CREDIT_CARD |
      | tp_account | account_type | SAVING      |
      | tp_account | account_type | INVESTING   |
    And user reads all the column "account_type" data