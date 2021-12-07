@ZULL-834
Feature: As a user, I should be able to assign tasks under the Quick Navigate Menu


  @ZULL-835
  Scenario: TC01-User should be able to click on the "High Priority" checkbox to set the current task to a top priority task.
    Given User logs in with valid credentials
    When User clicks the Task on the top
    And User clicks on the High Priority checkbox
    Then Verify that the user clicks successfully

  @ZULL-836
  Scenario: TC02-User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.
    Given User logs in with valid credentials
    When User clicks the Task on the top
    And User enter the message on the editor text bar "Hallo, My Lovely Team ;)) "
    Then Verify that the user sends message successfully


  @ZULL-837
  Scenario: TC03-User can add a checklist item by clicking on the add button.
    Given User logs in with valid credentials
    When User clicks the Task on the top
    And User clicks on the checklist
    And User enter the item "LEPTOP"
    And User clicks the add item button
    Then Verify that  user add the item successfully


  @ZULL-838
  Scenario: TC04-User should be able to send tasks.
    Given User logs in with valid credentials
    When User clicks the Task on the top
    And User enter the message on the editor text bar "Chapter1 "
    And User select the responsible person "hr66@cybertekschool.com"
    And User clicks the send button
    Then Verify that user send task successfully and display "Task has been created"