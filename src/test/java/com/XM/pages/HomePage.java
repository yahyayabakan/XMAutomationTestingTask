package com.XM.pages;

import com.XM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage(){ PageFactory.initElements(Driver.get(), this);}

    @FindBy(xpath = "//*[.='ACCEPT ALL']")
    private WebElement acceptAll;

    @FindBy(xpath = "//*[@class='main_nav_research']")
    private WebElement researchAndEducation;

    @FindBy(xpath = "//*[@class='menu-research'][6]")
    private WebElement economicCalender;

    public void goToHomePage(){
        Driver.get().get("https://www.xm.com/");
    }

    public void acceptAll(){
        acceptAll.click();
    }

    public void clickResearchAndEducation(){
        researchAndEducation.click();
    }

    public void clickEconomicCalender(){
        economicCalender.click();
    }
}

