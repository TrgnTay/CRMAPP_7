@MRT_TC02
Feature: MRT_TC02 User selects events location
  Scenario: MRT_TC02 User selects events location
    Given  User logs in with valid credentials
    When user clicks Event icon
    Then User should be able to click on More to see the event details
    And User should be able to see event details parameters as follows
      | Availability |
      | Repeat       |
      | Calendar     |
      | Importance   |