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
    @FindBy (xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageBox;

    @FindBy (id = "blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy (id = "blog_post_outer_234")
    public WebElement activityHistory;

    @FindBy (xpath = "//body[@contenteditable = 'true']")
    public WebElement textField;

    @FindBy (id = "bx-b-mention-blogPostForm")
    public WebElement mention;

    @FindBy (css = "BXSocNetLogDestinationContainer")
    public WebElement mentionField;

    @FindBy (css = ".bx-finder-groupbox-content")
    public WebElement mentionTable;

    @FindBy (css = "bx-finder-search-block-cell")
    public WebElement mentionIcon;

    @FindBy (id = "mention52305705_last_U644")
    public WebElement contactMention;

    @FindBy (css= ".feed-add-destination-link")
    public WebElement addMORE;

    @FindBy (xpath = "(//div[@class = 'bx-finder-box-item-t7-info']//div)[2]")
    public WebElement Useremail;

    @FindBy (xpath = "//div[text()='hr77@cybertekschool.com']")
    public WebElement Users;

    @FindBy (xpath = "//input[@value='Save']")
    public WebElement saveLink;

    @FindBy (xpath = "//*[@id='bx-b-link-blogPostForm']/span")
    public WebElement linkIcon;

    @FindBy (css = "#linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy (css = "#linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURL;


}
