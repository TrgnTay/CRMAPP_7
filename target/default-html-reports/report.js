$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TaskMenu.feature");
formatter.feature({
  "name": "As a user, I should be able to assign tasks under the Quick Navigate Menu",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "User should be able to click on the \"High Priority\" checkbox",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
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
  "name": "User clicks the Task on the top",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheTaskOnTheTop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the High Priority checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksOnTheHighPriorityCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that the user clicks successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatTheUserClicksSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to click on Visual Editor and see the editor text bar display the message",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
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
  "name": "User clicks the Task on the top",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheTaskOnTheTop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the message on the editor text bar \"Hallo, My Lovely Team ;)) \"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userEnterTheMessageOnTheEditorTextBar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that the user sends message successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatTheUserSendsMessageSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User can add a checklist item by clicking on the add button or checkmark",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
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
  "name": "User clicks the Task on the top",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheTaskOnTheTop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the checklist",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksOnTheChecklist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the item \"LEPTOP\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userEnterTheItem(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the add item button",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheAddItemButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that  user add the item successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatUserAddTheItemSuccessfully()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to send tasks",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
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
  "name": "User clicks the Task on the top",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheTaskOnTheTop()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the message on the editor text bar \"Chapter1 \"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userEnterTheMessageOnTheEditorTextBar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User select the responsible person \"hr66@cybertekschool.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userSelectTheResponsiblePerson(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the send button",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.userClicksTheSendButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that user send task successfully and display \"Task has been created\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatUserSendTaskSuccessfullyAndDisplay(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".feed-create-task-popup-title\"}\n  (Session info: chrome\u003d96.0.4664.55)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027wumaerjiangdeMacBook-Pro.local\u0027, ip: \u00272a02:3035:402:1434:a545:cde6:77ac:a74b%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 96.0.4664.55, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /var/folders/5f/2g77vtys60j...}, goog:chromeOptions: {debuggerAddress: localhost:56001}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4639f3351d4bc5976d2fdff5aac7843d\n*** Element info: {Using\u003dcss selector, value\u003d.feed-create-task-popup-title}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByCssSelector(RemoteWebDriver.java:420)\n\tat org.openqa.selenium.By$ByCssSelector.findElement(By.java:431)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy18.getText(Unknown Source)\n\tat com.CRM_7.stepDefinitions.TaskMenuStepDefs.verifyThatUserSendTaskSuccessfullyAndDisplay(TaskMenuStepDefs.java:109)\n\tat ✽.Verify that user send task successfully and display \"Task has been created\"(file:///Users/wumaerjiangzulihumaer/IdeaProjects/CRM_7/src/test/resources/features/TaskMenu.feature:32)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});