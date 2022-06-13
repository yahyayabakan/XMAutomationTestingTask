package stepdefs;

import com.XM.pages.EconomicCalender;
import com.XM.pages.HomePage;
import com.XM.pages.RiskWarning;
import com.XM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.text.ParseException;
import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
public class UserCaseStepDefs {

    String currentWindowHandle = "";
    HomePage hp = new HomePage();
    EconomicCalender ec = new EconomicCalender();
    RiskWarning rw = new RiskWarning();

    @When("user opens browser")
    public void user_opens_browser() {
        hp.goToHomePage();
    }

    @When("user navigates to the homepage")
    public void user_navigates_to_the_homepage() {
        hp.acceptAll();
    }

    @When("user clicks to the Research and Education link and must directed to the next page")
    public void user_clicks_to_the_Research_and_Education_link_and_must_directed_to_the_next_page() {
        hp.clickResearchAndEducation();
    }

    @When("user clicks Economic Calender link in the opened menu and must be directed to the that page")
    public void user_clicks_Economic_Calender_link_in_the_opened_menu_and_must_be_directed_to_the_that_page() {
        hp.clickEconomicCalender();
    }

    @When("user clicks the {string} buttonYesterday and date must be correct")
    public void user_clicks_the_buttonYesterday_and_date_must_be_correct(String day) throws InterruptedException, ParseException {
        assertTrue(ec.turnStringIntoDate(ec.clickDateButtonGetText(day)).before(ec.turnStringIntoDate(ec.getTodayAsText())));
    }

    @When("user clicks the {string} buttonToday and date must be correct")
    public void user_clicks_the_buttonToday_and_date_must_be_correct(String day) throws InterruptedException {
        System.out.println(ec.clickDateButtonGetText(day));
        System.out.println(ec.getTodayAsText());

        assertTrue(ec.clickDateButtonGetText(day).equals(ec.getTodayAsText()));
    }

    @When("user clicks the {string} buttonTomorrow and date must be correct")
    public void user_clicks_the_buttonTomorrow_and_date_must_be_correct(String day) throws InterruptedException, ParseException {
        assertTrue(ec.turnStringIntoDate(ec.clickDateButtonGetText(day)).after(ec.turnStringIntoDate(ec.getTodayAsText())));
    }

    @When("user clicks the Week button and dates must be correct")
    public void user_clicks_the_Week_button_and_dates_must_be_correct() throws InterruptedException {
        assertFalse(ec.getFirstDayOfWeek().equals(ec.getLastDayOfWeek()));
    }


    @When("user clicks the here link in the Disclaimer block at the bottom and must be directed to the risk warning page")
    public void user_clicks_the_here_link_in_the_Disclaimer_block_at_the_bottom_and_must_be_directed_to_the_risk_warning_page() {
        ec.disclaimerBlockLinkClick();
        assertEquals(Driver.get().getCurrentUrl(), "https://www.xm.com/research/risk_warning");
    }


    @When("user clicks the here link in the Risk Warning block")
    public void user_clicks_the_here_link_in_the_Risk_Warning_block() throws InterruptedException {
        currentWindowHandle = Driver.get().getWindowHandle();
        rw.riskWarningLinkClick();
    }

    @Then("Risk Disclosure document must be opened in a new tab")
    public void risk_Disclosure_document_must_be_opened_in_a_new_tab() {
         rw.openRiskDislosureDocumentandVerify();
    }
}





