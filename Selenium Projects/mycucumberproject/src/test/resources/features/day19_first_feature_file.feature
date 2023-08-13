Feature: google search feature

  Scenario: TC01_iPhone_search
    Given user is on the google home page
    And user searches for iPhone
    Then verify the page title contains iPhone

# Feature files are created using Gherkin language
# Feature files are used to write test scenarios/test cases
# All feature files must begin with a Feature keyword
# Scenario: is used to create test cases
# Each step must begin with a Gherkin keyword, such as Given, And, When, But (not recommended), Then, or * (not recommended)

# CUCUMBER AUTOMATION:
# 1. Create a feature file (GHERKIN)
# 2. Create step definitions (JAVA)



