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
  "name": "user clicks the Yesterday button and date must be correct",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_Yesterday_button_and_date_must_be_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the Today button and date must be correct",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_Today_button_and_date_must_be_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the Tomorrow button and date must be correct",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_Tomorrow_button_and_date_must_be_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the Week button and dates must be correct",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_Week_button_and_dates_must_be_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the here link in the Disclaimer block at the bottom and must be directed to the risk warning page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_here_link_in_the_Disclaimer_block_at_the_bottom_and_must_be_directed_to_the_risk_warning_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the here link in the Risk Warning block",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.user_clicks_the_here_link_in_the_Risk_Warning_block()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Risk Disclosure document must be opened in a new tab",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.UserCaseStepDefs.risk_Disclosure_document_must_be_opened_in_a_new_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});