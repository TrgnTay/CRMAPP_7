@SR03
Feature: SR03 Select type of information
  Background:
    Given User logs in with valid credentials
  Scenario: Select type of information

    And the user navigates to company
    And the user clicks on Add News
    When user presses on type of information
    And selects one of the options
    Then that information is selected