package stepdefs;

import com.XM.pages.EconomicCalender;
import com.XM.pages.HomePage;
import com.XM.pages.RiskWarning;
import com.XM.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.text.SimpleDateFormat;

import java.time.Duration;
import java.util.Date;
import java.util.Set;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class UserCaseStepDefs {

    HomePage hp = new HomePage();
    EconomicCalender ec = new EconomicCalender();
    RiskWarning rw = new RiskWarning();



    @When("user opens browser")
    public void user_opens_browser() {
        Driver.get().get("https://www.xm.com/");
    }

    @When("user navigates to the homepage")
    public void user_navigates_to_the_homepage() {
        hp.acceptAll.click();
    }

    @When("user clicks to the Research and Education link and must directed to the next page")
    public void user_clicks_to_the_Research_and_Education_link_and_must_directed_to_the_next_page() {
        hp.researchAndEducation.click();
    }

    @When("user clicks Economic Calender link in the opened menu and must be directed to the that page")
    public void user_clicks_Economic_Calender_link_in_the_opened_menu_and_must_be_directed_to_the_that_page() {
        hp.economicCalender.click();
    }

    @When("user clicks the Yesterday button and date must be correct")
    public void user_clicks_the_Yesterday_button_and_date_must_be_correct() {
        Driver.get().switchTo().frame(ec.iframe);
        ec.yesterday.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);
        wait.until(ExpectedConditions.invisibilityOf(ec.yesterday));
        String yesterday = ec.widgetDay.getText().substring(0,10);
        String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        assertTrue(yesterday.compareTo(dateToday)<0);
    }

    @When("user clicks the Today button and date must be correct")
    public void user_clicks_the_Today_button_and_date_must_be_correct() throws InterruptedException {
        String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        ec.today.click();
        Thread.sleep(1000);
        String today = ec.widgetDay.getText().substring(0,10);
        System.out.println(today);
        System.out.println(dateToday);
        assertEquals(today, dateToday);
    }

    @When("user clicks the Tomorrow button and date must be correct")
    public void user_clicks_the_Tomorrow_button_and_date_must_be_correct() throws InterruptedException {
        String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        ec.tomorrow.click();
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);
        wait.until(ExpectedConditions.visibilityOf(ec.theDay));
        //String tomorrow = ec.theDay.getText();
        String tomorrow = ec.widgetDay.getText().substring(0,10);
        System.out.println(tomorrow);
        assertTrue(tomorrow.compareTo(dateToday) > 0);
    }

    @When("user clicks the Week button and dates must be correct")
    public void user_clicks_the_Week_button_and_dates_must_be_correct() throws InterruptedException {
        ec.thisWeek.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);
        wait.until(ExpectedConditions.visibilityOf(ec.widgetDay));
        Thread.sleep(2000);
        String firstDay = ec.widgetDay.getText().substring(0,10);
        String secondDay = ec.widgetDay.getText().substring(13,23);
        assertFalse(firstDay.equals(secondDay));
    }


    @When("user clicks the here link in the Disclaimer block at the bottom and must be directed to the risk warning page")
    public void user_clicks_the_here_link_in_the_Disclaimer_block_at_the_bottom_and_must_be_directed_to_the_risk_warning_page() {
        Driver.get().switchTo().defaultContent();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(ec.hereDisclaimer);
        ec.hereDisclaimer.click();
        assertEquals(Driver.get().getCurrentUrl(), "https://www.xm.com/research/risk_warning");
    }

    @When("user clicks the here link in the Risk Warning block")
    public void user_clicks_the_here_link_in_the_Risk_Warning_block() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(ec.hereDisclaimer);
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);
        wait.until(ExpectedConditions.elementToBeClickable(rw.hereRiskWarning));
        Thread.sleep(2000);
        String currentWindowHandle = Driver.get().getWindowHandle();
        rw.hereRiskWarning.click();
    }

    @Then("Risk Disclosure document must be opened in a new tab")
    public void risk_Disclosure_document_must_be_opened_in_a_new_tab() {
        String currentWindowHandle = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles(); //gives the handles of all opened windows
        for (String windowHandle : windowHandles) {
            if (!windowHandle.contains(currentWindowHandle)) {
                Driver.get().switchTo().window(windowHandle); //Switching to the new tab
                assertTrue(Driver.get().getCurrentUrl().equals("https://www.xm.com/assets/pdf/new/docs/XM-Risk-Disclosures-for-Financial-Instruments.pdf?v5"));
                Driver.get().switchTo().window(currentWindowHandle); //Returning to the previous page
            }
        }
    }


}

