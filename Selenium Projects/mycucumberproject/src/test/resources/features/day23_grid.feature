@grid
Feature: grid_feature

  Scenario: TC01_chrome_test_case
    Given user is on the url "https://www.github.com" using "chrome" browser
    Then verify the page title contains "GitHub" on grid
    Then close the remote driver

  Scenario: TC02_firefox_test_case
    Given user is on the url "https://www.github.com" using "firefox" browser
    Then verify the page title contains "GitHub" on grid
    Then close the remote driver

  Scenario: TC03_safari_test_case
    Given user is on the url "https://www.github.com" using "safari" browser
    Then verify the page title contains "GitHub" on grid
    Then close the remote driver

