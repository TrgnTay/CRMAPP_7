$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-801_enda.feature");
formatter.feature({
  "name": "User should be able to make a comment, like, or unfollow on other employees\u0027 posts.",
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
  "name": "User should be able to make a comment, like, or unfollow on other employees\u0027 posts.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-801"
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
  "name": "The user clicks on the comment, the user is able to make a comment on the employee\u0027s posts.",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_801.the_user_clicks_on_the_comment_the_user_is_able_to_make_a_comment_on_the_employee_s_posts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the like, the user is able to like the posts.",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_801.the_user_clicks_on_the_like_the_user_is_able_to_like_the_posts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user clicks on the unfollow, the user is able to unfollow the user\u0027s posts.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_801.the_user_clicks_on_the_unfollow_the_user_is_able_to_unfollow_the_user_s_posts()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});