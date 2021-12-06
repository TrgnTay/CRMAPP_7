package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MrtEventsPage extends BasePage {
    public MrtEventsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@id=\"feed-add-post-form-tab-calendar\"]")
    public WebElement EventBtn;

    @FindBy(xpath = "//input[@name=\"EVENT_REMIND\"]")
    public WebElement ReminderCount;

}
