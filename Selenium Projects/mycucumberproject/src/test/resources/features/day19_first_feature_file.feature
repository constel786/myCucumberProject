@google
Feature: google search feature

  Background: navigating_google_homepage
    Given user is on the google home page

  @iphone
  Scenario: TC01_iphone_search

    And user searches for iPhone
    Then verify the page title contains iPhone
    Then close the application

    @teapot
  Scenario: TC02_porcelain_tea_pot_search

    And user search for porcelain tea pot
    Then verify the page title contains porcelain tea pot
    Then close the application

# Feature files are created using Gherkin language
# Feature files are used to write test scenarios/test cases
# All feature files must begin with a Feature keyword
# Scenario: is used to create test cases
# Each step must begin with a Gherkin keyword, such as Given, And, When, But (not recommended), Then, or * (not recommended)

# CUCUMBER AUTOMATION:
# 1. Create a feature file (GHERKIN)
# 2. Create step definitions (JAVA)


#  Note: Cucumber test cases execute top to bottom from the feature files
#  Note: dryRun = true is used to generate missing step definitions.
#        dryRun = false is used to execute test cases normally.
#  Note: In a feature file, there can be multiple scenarios
#  Note: @tags are used to run specific test scenarios
#  Note: Background (Gherkin keyword) is used for repeated pre-conditions. It will execute before each Scenario.


