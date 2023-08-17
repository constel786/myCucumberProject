@medunna_room
Feature: Medunna Room Creation

  Background: Sign In As Admin
    Given user navigates to "https://medunna.com"
    When click on user icon
    And click on sign in link
    And enter username
    And enter password
    And click on sign in submit button

  Scenario Outline: Create Room
    When click on itemsAndTitles link
    And click on room option
    And click on create a new room link
    And enter room number "<room number>"
    And select room type "<room type>"
    And click on status checkbox
    And enter price "<price>"
    And enter description "<description>"
    And click on save button
    Then assert alert message contains A new Room is created
    And close the application

    Examples:
      | room number | room type | price | description |
      | 5792 number | DAYCARE   | 140   | This room was created for cucumber practice |
