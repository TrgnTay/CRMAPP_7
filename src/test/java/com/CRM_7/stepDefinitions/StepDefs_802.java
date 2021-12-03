package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.PortalPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefs_802 {
    PortalPage portalPage= new PortalPage();
    Driver driver;
    @When("The user clicks on the like, the user is able to like other reviewers' comments.")
    public void the_user_clicks_on_the_like_the_user_is_able_to_like_other_reviewer_s_comments() {
        portalPage.likeOthersComment.click();
        Assert.assertTrue(portalPage.likeOthersComment.isDisplayed());
    }

    @Then("The user clicks on the reply, the user is able to make a comment on the reviewers's comments.")
    public void the_user_clicks_on_the_reply_the_user_is_able_to_make_a_comment_on_the_reviewers_s_comments() {
        portalPage.ReplyOtherComment.click();
        Driver.get().switchTo().frame(portalPage.replyIframe);
        portalPage.contentInput.sendKeys("good");
        BrowserUtils.waitFor(2);
        Driver.get().switchTo().defaultContent();
        portalPage.sendButton.click();
        Assert.assertTrue(portalPage.commentGood.isDisplayed());



    }
}
