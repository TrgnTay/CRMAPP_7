$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TaskMenu.feature");
formatter.feature({
  "name": "As a user, I should be able to assign tasks under the Quick Navigate Menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ZULL-834"
    }
  ]
});
formatter.scenario({
  "name": "TC01-User should be able to click on the \"High Priority\" checkbox to set the current task to a top priority task.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-834"
    },
    {
      "name": "@ZULL-835"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Login_StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Task on the top",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheTaskOnTheTop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the High Priority checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksOnTheHighPriorityCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that the user clicks successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatTheUserClicksSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02-User should be able to click on Visual Editor and see the editor text bar displays on top of the message box.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-834"
    },
    {
      "name": "@ZULL-836"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Login_StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Task on the top",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheTaskOnTheTop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the message on the editor text bar \"Hallo, My Lovely Team ;)) \"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userEnterTheMessageOnTheEditorTextBar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that the user sends message successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatTheUserSendsMessageSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC03-User can add a checklist item by clicking on the add button.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-834"
    },
    {
      "name": "@ZULL-837"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Login_StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Task on the top",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheTaskOnTheTop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the checklist",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksOnTheChecklist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the item \"LEPTOP\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userEnterTheItem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the add item button",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheAddItemButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that  user add the item successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatUserAddTheItemSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC04-User should be able to send tasks.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-834"
    },
    {
      "name": "@ZULL-838"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Login_StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Task on the top",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheTaskOnTheTop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the message on the editor text bar \"Chapter1 \"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userEnterTheMessageOnTheEditorTextBar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the responsible person \"hr66@cybertekschool.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userSelectTheResponsiblePerson(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the send button",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheSendButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that user send task successfully and display \"Task has been created\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatUserSendTaskSuccessfullyAndDisplay(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});