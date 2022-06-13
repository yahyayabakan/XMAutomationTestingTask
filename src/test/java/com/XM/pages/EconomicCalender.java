package com.XM.pages;

import com.XM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;



public class EconomicCalender {
    public EconomicCalender(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//*[.='here']")
    public WebElement hereDisclaimer;

    @FindBy(xpath = "//*[@id='timeFrame_yesterday']")
    public WebElement yesterday;

    @FindBy(xpath = "//*[@id='timeFrame_today']")
    public WebElement today;

    @FindBy(xpath = "//*[@id='timeFrame_tomorrow']")
    public WebElement tomorrow;

    @FindBy(className = "theDay")
    public WebElement theDay;

    @FindBy(xpath = "//*[@id='widgetFieldDateRange']")
    public WebElement widgetDay;

    @FindBy(xpath = "//*[@id='timeFrame_thisWeek']")
    public WebElement thisWeek;

    @FindBy(xpath = "//*[@title='economicCalendar']")
    public WebElement iframe;

    public String clickDateButtonGetText(String day) throws InterruptedException {
        Driver.get().switchTo().frame(iframe);
        Driver.get().findElement(By.id("timeFrame_" + day)).click();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);
        //wait.until(ExpectedConditions.visibilityOf(Driver.get().findElement(By.id("timeFrame_" + day))));
        Thread.sleep(2000);
        System.out.println(widgetDay.getText().substring(0,10));
        Instant now = Instant.now();
        Instant yesterday = now.minus(1, ChronoUnit.DAYS);
        System.out.println(yesterday);
        return widgetDay.getText().substring(0,10);
    }

    public String getTodayAsText(){
        return new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    }

    public String getFirstDayOfWeek() throws InterruptedException {
        thisWeek.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);
        wait.until(ExpectedConditions.visibilityOf(widgetDay));
        Thread.sleep(2000);
        return widgetDay.getText().substring(0,10);
    }

    public String getLastDayOfWeek() throws InterruptedException {
        thisWeek.click();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);
        wait.until(ExpectedConditions.visibilityOf(widgetDay));
        Thread.sleep(2000);
        return widgetDay.getText().substring(13,23);
    }

    public void disclaimerBlockLinkClick(){
        Driver.get().switchTo().defaultContent();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(hereDisclaimer);
        hereDisclaimer.click();
    }

    public Date turnStringIntoDate(String day) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(day);
        return date;
    }
}
