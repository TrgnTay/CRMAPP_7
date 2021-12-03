$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/@ZULL-806.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User should be able to add a Department",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-806"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Portal Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Stepdef.the_user_is_on_the_Portal_Page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.CRM_7.stepDefinitions.Stepdef.the_user_is_on_the_Portal_Page(Stepdef.java:25)\r\n\tat ✽.the user is on the Portal Page(file:///C:/Users/msevi/IdeaProjects/CRM_7/src/test/resources/features/@ZULL-806.feature:18)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user clicks on the employees",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Stepdef.the_user_clicks_on_the_employees()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on the Add department button",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Stepdef.the_user_clicks_on_the_Add_department_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user should see add department pop-up",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Stepdef.theUserShouldSeeAddDepartmentPopUp()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user is able to add a department name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Stepdef.the_user_is_able_to_add_a_department()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the user clicks on add button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.Stepdef.theUserClicksOnAddButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});