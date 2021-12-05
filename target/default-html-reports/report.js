$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TC01.feature");
formatter.feature({
  "name": "MRT-TC01 User sets reminder",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@TC01"
    }
  ]
});
formatter.scenario({
  "name": "MRT-TC01 User sets reminder",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@TC01"
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
  "name": "the user clicks Event",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TC01_StepDefinitions.the_user_clicks_Event()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks Event icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TC01_StepDefinitions.user_clicks_Event_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to set a reminder",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TC01_StepDefinitions.user_should_be_able_to_set_a_reminder()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});