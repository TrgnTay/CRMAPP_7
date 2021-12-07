package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MrtEventsPage extends BasePage {
    public MrtEventsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[@id=\"blog-submit-button-save\"]")
    public WebElement SendBtn;

    @FindBy(xpath = "//input[@id=\"feed-cal-event-namecal_3Jcl\"]")
    public WebElement EventName;

    @FindBy(xpath = "//label[@for=\"event-accessibilitycal_3Jcl\"]")
    public WebElement MoreAvailability;

    @FindBy(xpath = "//span[@class=\"feed-event-more-link-text\"][1]")
    public WebElement MoreLink;

    @FindBy(xpath = "//input[@id=\"event-locationcal_3Jcl\"]")
    public WebElement EventLocation;

    @FindBy(xpath = "//span[@id=\"feed-add-post-form-tab-calendar\"]")
    public WebElement EventBtn;

    @FindBy(xpath = "//input[@name=\"EVENT_REMIND\"]")
    public WebElement ReminderCount;

}
