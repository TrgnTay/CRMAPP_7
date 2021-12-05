package com.CRM_7.pages;

import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalPage extends BasePage{



    @FindBy(id = "bx-b-mention-blogPostForm")
    public WebElement AddMention;
    @FindBy(xpath = "//a[@class='bx-finder-box-tab bx-lm-tab-department']")
public WebElement dropdownElement;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-link']")
    public WebElement linkIcon;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkText;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrl;

    @FindBy(id = "undefined")
    public WebElement Save;

    @FindBy(id = "blog-submit-button-save")
    public WebElement Send;

    @FindBy(xpath = "//a[@href='http://zero.webappsecurity.com']")
    public WebElement zeroBankLink;

    @FindBy(xpath = "//span[@data-bx-action='quote']")
    public WebElement quotebtn;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement announceBtn;



   // public void AdMtion(){
     // AddMention.click();


   // }


public void setdropdownElement(){

    dropdownElement.click();

}
   // public WebElement getusers(String Users){
       // String xpath = "//div[.='+Users+'][@class='bx-finder-company-department-employee-name']";
       // return Driver.get().findElement(By.xpath(xpath));
   // }

    }


