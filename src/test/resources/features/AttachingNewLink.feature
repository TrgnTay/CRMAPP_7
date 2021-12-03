@wip
Feature: Adding New Link
  Scenario: Adding New link Feature
    Given User logs in with valid credentials
    Given User clicks Message button on the top dashboard
    When  User clicks link icon
    And   User inserts Link Text and Link URL
    Then  Link is displayed in the message box