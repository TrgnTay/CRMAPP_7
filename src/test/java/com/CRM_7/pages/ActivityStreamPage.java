package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActivityStreamPage extends BasePage {
    public ActivityStreamPage(){PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement Message;
    @FindBy (xpath = "(//iframe)[1]")
    public WebElement messageBox;
    @FindBy (id = "blog-submit-button-save")
    public WebElement sendBtn;
    @FindBy (id = "blg-post-img-231")
    public WebElement activityHistory;
}
