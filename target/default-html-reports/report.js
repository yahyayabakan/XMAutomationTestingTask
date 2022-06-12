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
formatter.step({
  "name": "user opens browser",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user navigates to the homepage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks to the Research and Education link and must directed to the next page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks Economic Calender link in the opened menu and must be directed to the that page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks the Yesterday button and date must be correct",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks the Today button and date must be correct",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks the Tomorrow button and date must be correct",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks the here link in the Disclaimer block at the bottom and must be directed to the risk warning page",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks the here link in the Risk Warning block",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Risk Disclosure document must be opened in a new tab",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});