$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MRT_TC03.feature");
formatter.feature({
  "name": "MRT_TC03 User selects events location",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@MRT_TC03"
    }
  ]
});
formatter.scenario({
  "name": "MRT_TC03 User selects events location",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@MRT_TC03"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User logs in with valid credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Login_StepDefinitions.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks Event icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.MRT_TC01_StepDefinitions.user_clicks_Event_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should be able to click on More to see the event details",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});