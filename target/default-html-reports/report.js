$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addUsers.feature");
formatter.feature({
  "name": "",
  "description": "  add users",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.background({
  "name": "log in",
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
  "name": "add users by selecting multiple contacts from Employees and Departments contact lists",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "User navigates to \"More\" \"Announcement\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.PortpalStepDef.user_navigates_to(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Add Mention icon",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.PortpalStepDef.clicks_Add_Mention_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Employees and Departments",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.PortpalStepDef.clicks_Employees_and_Departments()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects \"Ginger Cat\" and \"Murat Kahveci\" from Employees and Departments contact lists",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.PortpalStepDef.user_selects_and_from_Employees_and_Departments_contact_lists(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The input box should show descriptions containing \"Ginger Cat\" and \"Murat Kahveci\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.PortpalStepDef.the_input_box_should_show_descriptions_containing_and(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});