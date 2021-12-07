@smoke
Feature:

    Background:
      Given User logs in with valid credentials
      And Navigate to Appreciation module

  Scenario: Add mention function
    When User click on add mention icon
    And User clicks on Employees and Departments
    Then contacts should be listed
    And User adds "hr78@cybertekschool.com" from contact list
    Then "hr78@cybertekschool.com" is visible as mentioned


  Scenario: Adding users from contact list, employees and departments function

    When User click on Add more button
    And User clicks on Employees and Departments
    Then contacts should be listed
    And User adds "hr78@cybertekschool.com" from contact list
    Then "hr78@cybertekschool.com" is visible as recipient


  Scenario: Quote creation function

    When User clicks on Quote text icon
    And User writes "Good morning cydeo!"
    Then The quote should contain the message

@wip
  Scenario: Adding link function

    When User click on attach link icon
    And User inputs text "YouTube link"
    And User inputs link "https://www.youtube.com/watch?v=0xs-oaSZdqE&ab_channel=LittleSoul"
    And User clicks on save
    Then link should appear


