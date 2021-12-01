$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-804_enda.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
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
  "name": "The user hovers on the star icon of the helpdesk9@cybertekschool.com and add to favorites message appears.",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user clicks on the star, the is able to click the star icon.",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "The user sees romove from the favorites message, after clicking the star icon.",
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