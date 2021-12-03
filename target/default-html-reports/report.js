$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/link.feature");
formatter.feature({
  "name": "Attach Link",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to attach a link by clicking on the link icon.",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
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
  "name": "Navigate to Appreciation module",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AddMention.navigateToAppreciationModule()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on attach link icon",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AttachLink.user_click_on_attach_link_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs text \"YouTube link\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AttachLink.user_inputs_text(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs link \"https://www.youtube.com/watch?v\u003d0xs-oaSZdqE\u0026ab_channel\u003dLittleSoul\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AttachLink.user_inputs_link(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the link should work",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AttachLink.theLinkShouldWork()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[youtube]\u003e but was:\u003c[ChromeDriver: chrome on MAC (033474dcbef4b9fbec551cdfa704a1db)]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:117)\n\tat org.junit.Assert.assertEquals(Assert.java:146)\n\tat com.CRM_7.stepDefinitions.AttachLink.theLinkShouldWork(AttachLink.java:34)\n\tat ✽.the link should work(file:///Users/aidanaboronbaeva/IdeaProjects/CRM_7/src/test/resources/features/link.feature:10)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});