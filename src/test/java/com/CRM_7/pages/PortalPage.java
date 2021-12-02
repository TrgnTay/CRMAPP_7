package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortalPage extends BasePage{
    public PortalPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//a[.='Comment'])[1]")
    public WebElement commentTab;


    @FindBy(xpath = "//a[@id='blog-post-addc-add-235']")
    public WebElement commentInput;

    @FindBy(xpath = "(//div[@class='feed-com-text-inner-inner'])[1]")
    public WebElement commentGreat;

    @FindBy(xpath ="//button[starts-with(@id, 'lhe_button_submit_blogCommentForm')]")
    public WebElement sendButton;

    @FindBy(xpath = "(//a[.='Like'])[1]")
    public WebElement likeButton;

    @FindBy(xpath = " (//div[@title='Like'])[1]")
    public WebElement likeIcon;

    @FindBy(xpath = "(//a[.='Like'])[8]")
    public WebElement likeOthersComment;

    @FindBy(xpath = "(//a[.='Comment'])[8]")
    public WebElement ReplyOtherComment;






    @FindBy(xpath= "(//a[.='Unfollow'])[1]")
    public WebElement unfollowButton;

@FindBy(xpath = "//li[@data-id='menu_external_mail']")
public WebElement calendar;

    //task802

    @FindBy(css= "#record-BLOG_235-31-actions-reply]")
    public WebElement replyReviewerButton;


    @FindBy(css= ".bx-editor-iframe")
    public WebElement replyIframe;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement contentInput;

    @FindBy(xpath = "//button[starts-with(@id, 'lhe_button_submit_blogCommentForm')]")
    public WebElement sendButtonginger;

    @FindBy(xpath = "(//div[.='good'])[1]")
    public WebElement commentGood;

    @FindBy(xpath = "(//a[.='Ginger Cat'])[1]")
    public WebElement gingerProfile;

    @FindBy(xpath = "//span[.='Ginger Cat']")
    public WebElement gingerProfileName;













}
