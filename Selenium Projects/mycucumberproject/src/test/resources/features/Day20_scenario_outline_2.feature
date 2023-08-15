@so2
Feature: data_table_creation

  Scenario Outline: Create user and verify user creating

    Given user navigates to "https://editor.datatables.net/"
    And user clicks on new button
    And user enters first name as "<first_name>"
    And user enters last name as "<last_name>"
    And user enters position as "<position>"
    And user enters office as "<office>"
    And user enters extension as "<extension>"
    And user enters start date as "<start_date>"
    And user enters salary as "<salary>"
    And user clicks create button

    Examples:
      | first_name | last_name | position | office | extension | start_date | salary |
      | john       | lennon    | musician |LA      |1356       |2023-08-27  |1000000 |
