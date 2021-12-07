package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicePage extends BasePage {
    public ServicePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id='bx_left_menu_menu_services_sect']/a/span")
    public WebElement ServicesButton;

    @FindBy(xpath="//*[@id='top_menu_id_services_311090337']/a")
    public WebElement IdeasButton;

    @FindBy (className= "bx-context-button-text")
    public  WebElement NewIdeaButton;

    @FindBy(xpath="//*[@id='POST_TITLE']")
    public WebElement TitleBox;

    @FindBy (xpath= "//*[@id='bx-html-editor-iframe-cnt-LHEIdeaId']/iframe")
    public WebElement IdeaDescriptionFrame;

    @FindBy (xpath= "//body[@contenteditable = 'true']")
    public WebElement TextField;

    @FindBy(xpath="//*[@id='TAGS67abSn']")
    public  WebElement TagsButton;

    @FindBy (xpath="//*[@id='REPLIERhD356G']/div/div[7]/div[1]/div/select")
    public WebElement CategoryDropdown;

    @FindBy (xpath="//*[@id='REPLIERhD356G']/div/div[8]/a/span[2]")
    public  WebElement SendIdeaButton;

    @FindBy (className ="rating-vote-plus")
    public  WebElement LikePost;

    @FindBy (className="rating-vote-minus")
    public  WebElement DislikePost;

    @FindBy (xpath="//*[starts-with(@id,'blog-post')]/div[2]/div/div/div[2]/h2/a" )
    public WebElement PostName;

    @FindBy (xpath= "//*[@id='NAME']")
    public WebElement CategoryName;

    @FindBy (xpath= "//*[@id='workarea-content']/div/div/div[1]/table/tbody/tr[2]/td[2]/table/tbody/tr/td[3]/a/span[2]")
    public  WebElement NewCategory;

    @FindBy (xpath= "//*[@id='save_and_add']")
    public  WebElement SaveAndAddButton;

    @FindBy (xpath = "//*[@class='rating-vote-result rating-vote-result-plus']")
    public WebElement RatingVoteResultPlus;

    @FindBy (xpath = "//*[@class='rating-vote-result rating-vote-result-minus']")
    public WebElement RatingVoteResultMinus;

    @FindBy (xpath="//*[starts-with(@id,'rating-vote-BLOG_POST')]/a")
    public  WebElement RatingPlusActive;

    @FindBy (xpath= "//*[starts-with(@id,'rating-vote-BLOG_POST')]/a[2]")
    public  WebElement RatingMinusActive;

    @FindBy (className ="adm-warning-text")
    public  WebElement ErrorMessage;

}
