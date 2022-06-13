$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/UserCase.feature");
formatter.feature({
  "name": "Automation testing task #1 (UI)",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Multiple tasks in one test",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user opens browser",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_opens_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to the homepage",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_navigates_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to the Research and Education link and must directed to the next page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_to_the_Research_and_Education_link_and_must_directed_to_the_next_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks Economic Calender link in the opened menu and must be directed to the that page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_Economic_Calender_link_in_the_opened_menu_and_must_be_directed_to_the_that_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the \"yesterday\" buttonYesterday and date must be correct",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_buttonYesterday_and_date_must_be_correct(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the \"today\" buttonToday and date must be correct",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_buttonToday_and_date_must_be_correct(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@title\u003d\u0027economicCalendar\u0027]\"}\n  (Session info: chrome\u003d102.0.5005.63)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027VIVOBOOK\u0027, ip: \u0027192.168.137.16\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002717.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.63, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\yahya\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:51787}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 03ed26a77207cabff9f3f49f942ada2d\n*** Element info: {Using\u003dxpath, value\u003d//*[@title\u003d\u0027economicCalendar\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:77)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:480)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy18.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:891)\r\n\tat com.XM.pages.EconomicCalender.clickDateButtonGetText(EconomicCalender.java:50)\r\n\tat stepdefs.UserCaseStepDefs.user_clicks_the_buttonToday_and_date_must_be_correct(UserCaseStepDefs.java:59)\r\n\tat ✽.user clicks the \"today\" buttonToday and date must be correct(file:///C:/XMAutomationTestingTask/src/test/resources/features/UserCase.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks the \"tomorrow\" buttonTomorrow and date must be correct",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_buttonTomorrow_and_date_must_be_correct(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the Week button and dates must be correct",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_Week_button_and_dates_must_be_correct()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the here link in the Disclaimer block at the bottom and must be directed to the risk warning page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_here_link_in_the_Disclaimer_block_at_the_bottom_and_must_be_directed_to_the_risk_warning_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks the here link in the Risk Warning block",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_here_link_in_the_Risk_Warning_block()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Risk Disclosure document must be opened in a new tab",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.risk_Disclosure_document_must_be_opened_in_a_new_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});