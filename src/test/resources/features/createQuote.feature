@wip
Feature: create a quote

  Background: log in
    Given User logs in with valid credentials

  Scenario: create a quote by clicking on the quote text icon
    When User navigates to "More" "Announcement"
    And clicks quote test icon
  And enter "crm project"
  And clicks Send
  Then the text "crm project" should be displayed on the page





