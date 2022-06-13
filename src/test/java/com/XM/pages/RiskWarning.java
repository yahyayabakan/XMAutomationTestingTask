package com.XM.pages;

import com.XM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

import static org.testng.AssertJUnit.assertTrue;

public class RiskWarning {
    public RiskWarning(){
        PageFactory.initElements(Driver.get(), this);
    }

    EconomicCalender economicCalender = new EconomicCalender();

    @FindBy(css = "a[href='/assets/pdf/new/docs/XM-Risk-Disclosures-for-Financial-Instruments.pdf?v5']")
    public WebElement hereRiskWarning;

    public void riskWarningLinkClick() throws InterruptedException {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(economicCalender.hereDisclaimer);
        WebDriverWait wait = new WebDriverWait(Driver.get(), 4);
        wait.until(ExpectedConditions.elementToBeClickable(hereRiskWarning));
        Thread.sleep(2000);
        hereRiskWarning.click();
    }

    public void openRiskDislosureDocumentandVerify(){
        String currentWindowHandle = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles(); //gives the handles of all opened windows
        for (String windowHandle : windowHandles) {
            if (!windowHandle.contains(currentWindowHandle)) {
                Driver.get().switchTo().window(windowHandle);
                assertTrue(Driver.get().getCurrentUrl().equals("https://www.xm.com/assets/pdf/new/docs/XM-Risk-Disclosures-for-Financial-Instruments.pdf?v5"));
            }
        }
    }
}