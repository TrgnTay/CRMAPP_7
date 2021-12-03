$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddingNewUsers.feature");
formatter.feature({
  "name": "Adding New users",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip4"
    }
  ]
});
formatter.scenario({
  "name": "Adding New Users Feature",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip4"
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
  "name": "User clicks Message button on the top dashboard",
  "keyword": "Given "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.ClickingMessageButtonStepDefs.user_clicks_Message_button_on_the_top_dashboard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks Add more",
  "keyword": "When "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AddingNewUsersStepDefs.user_clicks_Add_more()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks an email from the pop-up window",
  "keyword": "And "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AddingNewUsersStepDefs.user_clicks_an_email_from_the_pop_up_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Email is displayed in the To: box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.CRM_7.stepDefinitions.AddingNewUsersStepDefs.email_is_displayed_in_the_To_box()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression ((//span[.\u003d \u0027helpdesk99@cybertekschool.com\u0027])[2] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027((//span[.\u003d \u0027helpdesk99@cybertekschool.com\u0027])[2]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d96.0.4664.55)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Natalias-MacBook-Pro.local\u0027, ip: \u0027192.168.1.32\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.16\u0027, java.version: \u00271.8.0_231\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: true, browserName: chrome, browserVersion: 96.0.4664.55, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: /var/folders/67/qs3hys_x62z...}, goog:chromeOptions: {debuggerAddress: localhost:56083}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 4a89e5dee59419c36a68a3a19ff37e18\n*** Element info: {Using\u003dxpath, value\u003d((//span[.\u003d \u0027helpdesk99@cybertekschool.com\u0027])[2]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\n\tat com.CRM_7.stepDefinitions.AddingNewUsersStepDefs.email_is_displayed_in_the_To_box(AddingNewUsersStepDefs.java:33)\n\tat ✽.Email is displayed in the To: box(file:///Users/nataliatornea/IdeaProjects/CRM_7/src/test/resources/features/AddingNewUsers.feature:8)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});