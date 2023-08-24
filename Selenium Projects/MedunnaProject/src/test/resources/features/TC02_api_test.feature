@e2e @api
Feature: Get the Room and Validate
  Scenario: Send get request to do assertion
    Given send get request to read room by id
    Then validate body
