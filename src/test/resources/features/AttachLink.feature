@wip
Feature: Attach a link

  Background: log in
    Given User logs in with valid credentials


  Scenario: attach a link by clicking on the link icon
    When User navigates to "More" "Announcement"
   And clicks Link icon
  And enters "zerobankApp" in the text input box
  And copy paste "http://zero.webappsecurity.com" in the link input box
  And clicks Save
  And clicks Send
    And clicks zerobankApp
  Then the page and the title contains "Zero - Personal Banking - Loans - Credit Cards"









