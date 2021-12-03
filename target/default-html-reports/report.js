$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-807.feature");
formatter.feature({
  "name": "",
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
  "name": "User should be able to find employees by search box.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-807"
    }
  ]
});
formatter.step({
  "name": "the user clicks on the employees",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AddDepartmentStepDefs.the_user_clicks_on_the_employees()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Find Employee button",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.SearchBoxStepDefs.the_user_clicks_on_the_Find_Employee_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user sees the search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.SearchBoxStepDefs.the_user_sees_the_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is able to search employees by search box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.SearchBoxStepDefs.the_user_is_able_to_search_employees_by_email()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});