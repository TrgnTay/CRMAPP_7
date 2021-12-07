@MRT_TC02
Feature: MRT_TC02 User selects events location
  Scenario: MRT_TC02 User selects events location
    Given  User logs in with valid credentials
    When user clicks Event icon
    Then user should be able to set event location from the first index of dropdown