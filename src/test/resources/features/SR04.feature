@SR04
  Feature: User should be able to select Text, HTLM and Visual Editor
    Background:
      Given User logs in with valid credentials

    Scenario: Text/HTLM/Visual Editor
      And the user navigates to company
      And the user clicks on Add News
      When user clicks one of Text HTML Visual Editor
      Then the clicked option is selected

