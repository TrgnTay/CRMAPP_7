@wip
Feature:
  add users

  Background: log in
    Given User logs in with valid credentials

  Scenario: add users by selecting multiple contacts from Employees and Departments contact lists

    When User navigates to "More" "Announcement"
    And  clicks Add Mention icon
    And clicks Employees and Departments
    And  User selects "Ginger Cat" and "Murat Kahveci" from Employees and Departments contact lists
   Then  The input box should show descriptions containing "Ginger Cat" and "Murat Kahveci"


#    User should be able to click on the upload files icon to upload files and pictures from local disks.
#User should be able to add users by selecting multiple contacts from Employees and Departments contact lists.
#User should be able to attach a link by clicking on the link icon.
#User should be able to insert videos by clicking on the video icon and entering the video URL.
#User should be able to create a quote by clicking on the quato text icon.
#User should be able to add mention by clicking on the Add mention icon.
#User should be able to send an announcement.



