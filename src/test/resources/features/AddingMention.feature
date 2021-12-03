@wip
Feature: Sending Mention
  Scenario: Sending Mention functionality
    Given User logs in with valid credentials
    Given User clicks Message button on the top dashboard

    When  User clicks mention icon
    When  User selects an email
    Then  Email is displayed in the message box
