$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-804_enda.feature");
formatter.feature({
  "name": "User should be able to add others\u0027 posts to favorite by clicking on the Star icon.",
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
  "name": "User should be able to add others\u0027 posts to favorite by clicking on the Star icon.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-804"
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
  "name": "The user clicks on the star, the user is able to click the star icon.",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_804.the_user_clicks_on_the_star_the_user_is_able_to_click_the_star_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user sees romove from the favorites message, after clicking the star icon.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.StepDefs_804.the_user_sees_romove_from_the_favorites_message_after_clicking_the_star_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});