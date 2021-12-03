@login
Feature: As a user, I should be able to assign tasks under the Quick Navigate Menu

  Scenario: User should be able to click on the "High Priority" checkbox
    Given User logs in with valid credentials
    When User clicks the Task on the top
    And User clicks on the High Priority checkbox
    Then Verify that the user clicks successfully

  Scenario: User should be able to click on Visual Editor and see the editor text bar display the message
    Given User logs in with valid credentials
    When User clicks the Task on the top
    And User enter the message on the editor text bar "Hallo, My Lovely Team ;)) "
    Then Verify that the user sends message successfully


  Scenario: User can add a checklist item by clicking on the add button or checkmark
    Given User logs in with valid credentials
    When User clicks the Task on the top
    And User clicks on the checklist
    And User enter the item "LEPTOP"
    And User clicks the add item button
    Then Verify that  user add the item successfully


  Scenario: User should be able to send tasks
    Given User logs in with valid credentials
    When User clicks the Task on the top
    And User enter the message on the editor text bar "Chapter1 "
    And User select the responsible person "hr66@cybertekschool.com"
    And User clicks the send button
    Then Verify that user send task successfully and display "Task has been created"




