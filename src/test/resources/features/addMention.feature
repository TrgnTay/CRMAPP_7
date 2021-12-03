
Feature:Add mention
  Scenario: User should be able to add mention by clicking on the Add mention icon
    Given User logs in with valid credentials
    Given Navigate to Appreciation module

    When User click on add mention icon
    And User clicks on Employees and Departments
    And User adds "hr76@cybertekschool.com" from contact list
    Then "hr76@cybertekschool.com" is visible as mentioned
