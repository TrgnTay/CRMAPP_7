@wip
Feature:
  add users

  Background: log in
    Given User logs in with valid credentials

  Scenario: add users by selecting multiple contacts from Employees and Departments contact lists

    When User navigates to "More" "Announcement"
    And  clicks Add Mention icon
    And clicks Employees and Departments
    And  User selects "Ginger Cat" and "HR3 USER" from Employees and Departments contact lists
   Then  The input box should show descriptions containing "Ginger Cat" and "HR3 USER"




  # TEST



