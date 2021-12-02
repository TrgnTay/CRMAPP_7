$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-803_enda.feature");
formatter.feature({
  "name": "User should be able to click on reviewers\u0027 names and visit their profiles.",
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
  "name": "User should be able to click on reviewers\u0027 names and visit their profiles.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-803"
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
  "name": "The user is able to click on reviewers\u0027 names.",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_803.the_user_is_able_to_click_on_reviewers_names()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user is able to visit the reviewers\u0027 profiles.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_803.the_user_is_able_to_visit_the_reviewers_profiles()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});