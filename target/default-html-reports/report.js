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
  "name": "The user clicks on the like, the user is able to like other reviewer\u0027s comments.",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_802.the_user_clicks_on_the_like_the_user_is_able_to_like_other_reviewer_s_comments()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the reply, the user is able to make a comment on the reviewers\u0027s comments.",
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
});