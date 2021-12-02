$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-802_enda.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to like or make comments on all other reviewers\u0027 comments",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-802"
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
  "name": "The user clicks on the like, the user is able to like other reviewer\u0027s comments.",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user clicks on the reply, the user is able to make a comment on the reviewers\u0027s comments.",
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