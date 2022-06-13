Feature: Automation testing task #1 (UI)

  Scenario: Multiple tasks in one test
    When user opens browser
    And user navigates to the homepage
    And user clicks to the Research and Education link and must directed to the next page
    And user clicks Economic Calender link in the opened menu and must be directed to the that page
    And user clicks the "yesterday" buttonYesterday and date must be correct
    And user clicks the "today" buttonToday and date must be correct
    And user clicks the "tomorrow" buttonTomorrow and date must be correct
    And user clicks the Week button and dates must be correct
    And user clicks the here link in the Disclaimer block at the bottom and must be directed to the risk warning page
    And user clicks the here link in the Risk Warning block
    Then Risk Disclosure document must be opened in a new tab


