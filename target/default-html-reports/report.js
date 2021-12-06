$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SR02.feature");
formatter.feature({
  "name": "SR02 Add tags for News",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SR02"
    }
  ]
});
formatter.scenario({
  "name": "Add tags under news details",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SR02"
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
  "name": "the user navigates to company page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks add news",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.SR01_stepDefinitions.user_clicks_add_news()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks Details",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is able to add tags in the tag line and check the box",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user is able to post news with tags",
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