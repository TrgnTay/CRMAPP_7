package com.CRM_7.pages;
import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ActivityStreamPage extends BasePage {
    public ActivityStreamPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id= "feed-add-post-form-link-text")
    public WebElement more;

    @FindBy(xpath= "//*[text()='Appreciation']")
    public WebElement appreciation;

}


