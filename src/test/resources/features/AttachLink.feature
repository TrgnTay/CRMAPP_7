
Feature: Attach a link

  Background: log in
    Given User logs in with valid credentials


  Scenario: attach a link by clicking on the link icon
    When User navigates to "More" "Announcement"
   And clicks Link icon
  And enters "cydeo" in the text input box
  And copy paste "www.cydeo.com" in the link input box
  And clicks Save
  And clicks Send
  Then clicks cydeo on the page and the title contains "Cydeo"









