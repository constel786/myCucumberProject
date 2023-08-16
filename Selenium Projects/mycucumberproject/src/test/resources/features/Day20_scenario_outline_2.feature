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
    When user searches for the first name "<first_name>"
    Then verify the name field contains the first name "<first_name>"
    Then close the application

    Examples:
      | first_name | last_name | position     | office | extension | start_date | salary   |
      | john       | lennon    | musician     | LA     | 1356      |2023-08-27  | 1000000  |
      | Sam        | Walton    | businessman  | AR     | 5236      |2023-08-28  | 10808800 |
      | Nancy      | Fast      | PO           | NY     | 6316      |2023-08-29  | 65000    |
      | Sue        | Candy     | QA           | TX     | 1056      |2023-08-30  | 90000    |
      | Suresh     | Kumar     | Dev          | AR     | 9800      |2023-08-27  | 120000   |


