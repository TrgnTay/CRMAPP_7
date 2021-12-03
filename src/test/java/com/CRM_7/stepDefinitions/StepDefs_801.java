package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.LoginPage;
import com.CRM_7.pages.PortalPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefs_801 {
    Driver driver;
    PortalPage portalPage = new PortalPage();


    @Given("The user is on the Portal page.")
    public void the_user_is_on_the_Portal_page() {


        String expectedPageTitle = "Portal";
        String actualPagetitle = Driver.get().getTitle();

        System.out.println(Driver.get().getTitle());

        Assert.assertTrue(actualPagetitle.contains(expectedPageTitle));
    }

   @When("The user clicks on the comment, the user is able to make a comment on the employees' posts.")
    public void the_user_clicks_on_the_comment_the_user_is_able_to_make_a_comment_on_the_employee_s_posts() {


        portalPage.commentTab.click();
        BrowserUtils.waitFor(2);

        Driver.get().switchTo().frame(portalPage.replyIframe);
        portalPage.contentInput.sendKeys("Great");
        BrowserUtils.waitFor(2);
        Driver.get().switchTo().defaultContent();
        portalPage.sendButton.click();
        Assert.assertTrue(portalPage.commentGreat.isDisplayed());
    }

        @When("The user clicks on the like, the user is able to like the posts.")
        public void the_user_clicks_on_the_like_the_user_is_able_to_like_the_posts() {
        portalPage.likeButton.click();
        Assert.assertTrue(portalPage.likeIcon.isDisplayed());
    }

       @Then("The user clicks on the unfollow, the user is able to unfollow the user's posts.")
       public void the_user_clicks_on_the_unfollow_the_user_is_able_to_unfollow_the_user_s_posts() {
       portalPage.unfollowButton.click();
       Assert.assertTrue(portalPage.unfollowButton.isDisplayed());

    }



}
