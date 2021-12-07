@SR03
Feature: SR03 Select type of information
  Scenario: Select type of information
    Given User logs in with valid credentials
    And the user navigates to company
    And the user clicks on Add News
    When user presses on type of information
    And selects one of the options
    Then that information is selected