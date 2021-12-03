Feature:Add Users
  Scenario: User should be able to add users by selecting multiple contacts from Employees and Departments contact lists
    Given User logs in with valid credentials
    Given Navigate to Appreciation module

    When User click on Add more button
    And User adds "hr76@cybertekschool.com" from contact list
    Then "hr76@cybertekschool.com" is visible as recipient

