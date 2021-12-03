package com.CRM_7.pages;
import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AppreciationPage {
    public AppreciationPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mention;

    @FindBy(id = "feed-add-post-destination-input")
    public WebElement addMore;

    @FindBy(css = "a[class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//div[text() = 'hr76@cybertekschool.com']")
    public WebElement hr76;

    @FindBy(css = "span[title='Link']")
    public WebElement link;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linktext;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkURL;

    @FindBy(xpath = "//input[@value='Save']")
    public WebElement linkSave;

    @FindBy(xpath = "(//iframe)[1]")
    public WebElement linkIframe;

    @FindBy(css = "span[title='Quote text']")
    public WebElement quote;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement blockQuote;

    @FindBy(id = "blog-submit-button-save")
    public WebElement send;


}