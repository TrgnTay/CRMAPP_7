
Feature:Create Quote
  Scenario: User should be able to create a quote by clicking on the Comma icon
    Given User logs in with valid credentials
    Given Navigate to Appreciation module

    When User click on comma icon
    Then User writes "Good morning cydeo!"
