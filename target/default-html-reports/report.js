$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-808.feature");
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
  "name": "User should be able to display the Company Structure",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-808"
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
  "name": "the user is able to display the Company Structure",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.CompanyStructureStepDefs.the_user_is_able_to_display_the_Company_Structure()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});