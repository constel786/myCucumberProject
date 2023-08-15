@so1
  Feature: search_feature

  Background: user_goes_to_google_home_page
    Given user navigates to "https://www.google.com"

  Scenario Outline: TC01_iphone_search
    And user search for "<data>"
    Then verify the page title contains "<data>"
    Then close the application

  Examples: test_data
    | data   |
    | iPhone |
    | tesla  |
    | bmw    |
    | flower |
    | bread  |
    | mercedes |

#Scenario: -> Scenario Outline:
#Example: must be added
#"" -> "<>"
#"<column_names>"
# Add data under the column in Examples: