@wip
Feature: Attach Link
  Scenario: User should be able to attach a link by clicking on the link icon.
    Given User logs in with valid credentials
    Given Navigate to Appreciation module

    When User click on attach link icon
    And User inputs text "YouTube link"
    And User inputs link "https://www.youtube.com/watch?v=0xs-oaSZdqE&ab_channel=LittleSoul"
    Then the link should work

