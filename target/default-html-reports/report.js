$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-803_enda.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
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
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "The user is on the Portal page.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_801.the_user_is_on_the_Portal_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The user is able to click on reviewers\u0027 names.",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user is able to visit the reviewers\u0027 profiles.",
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