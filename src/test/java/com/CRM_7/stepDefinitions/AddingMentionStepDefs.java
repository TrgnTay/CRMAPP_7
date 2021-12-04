package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.internal.runners.model.EachTestNotifier;

public class AddingMentionStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("User clicks mention icon")
    public void user_clicks_mention_icon() {
        activityStreamPage.mention.click();

    }

    @When("User selects an email")
    public void user_selects_an_email() {

        BrowserUtils.waitFor(2);
        //Driver.get().switchTo().alert(mentionTable);
        //activityStreamPage.contactMention.click();

        activityStreamPage.Users.click();
        BrowserUtils.waitFor(2);
    }


    @Then("Email is displayed in the message box")
    public void emailIsDisplayedInTheMessageBox() {
        Driver.get().switchTo().frame(activityStreamPage.messageBox);
        BrowserUtils.waitFor(2);
        String expectedMention = "hr77@cybertekschool.com ";
        String actualMention = activityStreamPage.textField.getText();
        Assert.assertEquals(expectedMention,actualMention);
        Driver.get().switchTo().defaultContent();
    }
}
