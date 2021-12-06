$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/SR01.feature");
formatter.feature({
  "name": "SR01 Post news on Company",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SR01"
    }
  ]
});
formatter.scenario({
  "name": "Post news on Company",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SR01"
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
  "name": "the user navigates to company",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.SR01_stepDefinitions.the_user_navigates_to_company()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks add news",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.SR01_stepDefinitions.user_clicks_add_news()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to post news",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.SR01_stepDefinitions.user_is_able_to_post_news()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});