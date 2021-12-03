package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AttachingNewLinkStepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    @When("User clicks link icon")
    public void user_clicks_link_icon() {
        activityStreamPage.linkIcon.click();

    }

    @When("User inserts Link Text and Link URL")
    public void user_inserts_Link_Text_and_Link_URL() {
       activityStreamPage.linkText.sendKeys("sample link Text");
       activityStreamPage.linkURL.sendKeys("https://www.youtube.com/watch?v=Xjv1sY630Uc&t=2s");
    }

    @Then("Link is displayed in the message box")
    public void link_is_displayed_in_the_message_box() {
        activityStreamPage.saveLink.click();

        Driver.get().switchTo().frame(activityStreamPage.messageBox);
        String expectedLink ="sample link Text";
        String actualLink = activityStreamPage.textField.getText();

        Assert.assertEquals("not equal", expectedLink,actualLink);
        Driver.get().switchTo().defaultContent();

    }
}
