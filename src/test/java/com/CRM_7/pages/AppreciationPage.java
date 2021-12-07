package com.CRM_7.pages;
import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class AppreciationPage {
    public AppreciationPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement mention;

    @FindBy(xpath = "//a[text()='Add more']")
    public WebElement addMore;

    @FindBy(xpath = "//a[starts-with(@id,'destDepartmentTab_')]")
    public WebElement employeesAndDepartments;

    @FindBy(xpath = "//div[text() = 'hr78@cybertekschool.com']")
    public WebElement hr78;

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
    @FindBy(css = "a[title^=\"Link\"]")
    public WebElement link1;

    @FindBy(css = "a[href='hvhv']")
    public WebElement insertedLink;

    @FindBy(css = "span[title='Quote text']")
    public WebElement quote;

    @FindBy(xpath = "//blockquote[@class='bxhtmled-quote']")
    public WebElement blockQuote;

    @FindBy(xpath = "//div[@class='bx-finder-company-department-employee-name']")
    public List<WebElement> ContactsList;

    @FindBy ( xpath = "//body[@style='min-height: 184px;']")
    public WebElement messageBox;

    @FindBy(id = "blog-submit-button-save")
    public WebElement send;

    @FindBy(id= "feed-add-post-destination-container")
    public WebElement container;

    public void swapToIframe(){
        Driver.get().switchTo().frame(0);
    }

}