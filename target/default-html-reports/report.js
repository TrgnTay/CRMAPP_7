$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MRT_TC04.feature");
formatter.feature({
  "name": "MRT_TC04 User selects events location",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MRT_TC04"
    }
  ]
});
formatter.scenario({
  "name": "MRT_TC04 User selects events location",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MRT_TC04"
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
  "name": "user clicks Event icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.MRT_TC01_StepDefinitions.user_clicks_Event_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to send a message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.MRT_TC04_StepDefinitions.user_should_be_able_to_send_a_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});