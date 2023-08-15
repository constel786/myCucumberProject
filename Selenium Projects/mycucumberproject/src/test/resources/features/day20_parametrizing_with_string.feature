@param_feature
Feature: search_feature

  Background: user_goes_to_google_home_page
    Given user navigates to "https://www.google.com"

  Scenario: TC01_iphone_search
    And user search for "iPhone"
    Then verify the page title contains "iPhone"
    Then close the application

  Scenario: TC02_tesla_search
    And user search for "tesla"
    Then verify the page title contains "tesla"
    Then close the application

  Scenario: TC03_bmw_search
    And user search for "bmw"
    Then verify the page title contains "bmw"
    Then close the application

  Scenario: TC04_flower_search
    And user search for "flower"
    Then verify the page title contains "flower"
    Then close the application

  Scenario: TC05_bread_search
    And user search for "bread"
    Then verify the page title contains "bread"
    Then close the application