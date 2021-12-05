@company
  Feature:SR-T01-Post news on Company
    Scenario: Post news on Company
      Given User logs in with valid credentials
      And the user navigates to company
      When user clicks add news
      Then user is able to post news