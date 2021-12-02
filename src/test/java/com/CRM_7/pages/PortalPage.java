package com.CRM_7.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PortalPage extends BasePage{

    @FindBy(css = "#blog-post-addc-add-235")
    public WebElement commentTab;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement commentInput;

    @FindBy(xpath = "//*[@id='blg-post-235'] //a[@class='feed-com-add-link']")
    public WebElement commentInput2;

    @FindBy(css="#lhe_button_submit_blogCommentFormWYct")
    public WebElement sendButton;

    @FindBy(xpath = "//*[@id='bx-ilike-button-BLOG_COMMENT_29-1638409039']/span/a")
    public WebElement likeButton;


    @FindBy(xpath = "(//div[@class='feed-post-informers-cont'])/span[3]/a")
    public WebElement unfollowButton;







}
