$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TestExecution_ZULL816.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ZULL-816"
    }
  ]
});
formatter.scenario({
  "name": "TC01-User should be able to see default filters as \"my activity, work, favorite, announcements, and workflows\"",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-816"
    },
    {
      "name": "@ZULL-811"
    }
  ]
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
formatter.step({
  "name": "User click on Filter and search box",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_Filter_and_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see default filtres as following options",
  "rows": [
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_should_see_default_filtres_as_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC02-User should be able add field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-816"
    },
    {
      "name": "@ZULL-812"
    }
  ]
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
formatter.step({
  "name": "User click on Filter and search box",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_Filter_and_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add field button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_add_field_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select \"Favorites\" field",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_select_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Favorites\" field should be displayed in field area",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.field_should_be_displayed_in_field_area(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC03-User should be able to remove field",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-816"
    },
    {
      "name": "@ZULL-813"
    }
  ]
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
formatter.step({
  "name": "User click on Filter and search box",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_Filter_and_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add field button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_add_field_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User deselect \"Date\" field",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_deselect_field(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC04-User should be able to save filter",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-816"
    },
    {
      "name": "@ZULL-814"
    }
  ]
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
formatter.step({
  "name": "User click on Filter and search box",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_Filter_and_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on save filter button",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_save_filter_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to enter a filter name like \"TEST\" and save it",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_should_be_able_to_enter_a_filter_name_like_and_save_it(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see saved filter \"TEST\" in the filter column.",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_should_see_saved_filter_in_the_filter_column(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "TC05-User should be able to reset filters to default",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ZULL-816"
    },
    {
      "name": "@ZULL-815"
    }
  ]
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
formatter.step({
  "name": "User click on Filter and search box",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_Filter_and_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on restore default fields button",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_click_on_restore_default_fields_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see default fields as following options",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.FilterAndSearchStepDefs.user_should_see_default_fields_as_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});