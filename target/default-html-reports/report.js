$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-802_enda.feature");
formatter.feature({
  "name": "User should be able to like or make comments on all other reviewers\u0027 comments",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "User should be able to like or make comments on all other reviewers\u0027 comments",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-802"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "The user is on the Portal page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_801.the_user_is_on_the_Portal_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the like, the user is able to like other reviewers\u0027 comments.",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_802.the_user_clicks_on_the_like_the_user_is_able_to_like_other_reviewer_s_comments()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the reply, the user is able to make a comment on the reviewers\u0027comments.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_802.the_user_clicks_on_the_reply_the_user_is_able_to_make_a_comment_on_the_reviewers_s_comments()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/AddingMention.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
formatter.scenario({
  "name": "TC -02 NAT - Adding Mention Feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-798"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User clicks Message button on the top dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.ClickingMessageButtonStepDefs.user_clicks_Message_button_on_the_top_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks mention icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AddingMentionStepDefs.user_clicks_mention_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects an email",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AddingMentionStepDefs.user_selects_an_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Email is displayed in the message box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AddingMentionStepDefs.emailIsDisplayedInTheMessageBox()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/FilterAndSearch.feature");
formatter.feature({
  "name": "Filter and search functionality on Active Stream",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@FilterAndSearch"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to remove field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FilterAndSearch"
    },
    {
      "name": "@ZULL-813"
    },
    {
      "name": "@smoke"
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
  "name": "User click on Filter and search box",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_Filter_and_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add field button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_add_field_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User deselect \"Date\" field",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_deselect_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/TaskMenu.feature");
formatter.feature({
  "name": "As a user, I should be able to assign tasks under the Quick Navigate Menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to send tasks",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
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