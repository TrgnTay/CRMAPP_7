@SR01
  Feature:SR01 Post news on Company
    Background:
      Given User logs in with valid credentials

    Scenario: Post news on Company
      And the user navigates to company
      When user clicks add news
      Then user is able to post news