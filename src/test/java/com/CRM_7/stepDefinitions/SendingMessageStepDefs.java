package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;

public class SendingMessageStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("User writes sample text in the message box")
    public void user_writes_sample_text_in_the_message_box() {
        BrowserUtils.waitFor(2);
        Driver.get().switchTo().frame(activityStreamPage.messageBox);
        activityStreamPage.messageBox.sendKeys("sample text");
    }

    @When("Clicks Send Button")
    public void clicks_Send_Button() {
        BrowserUtils.waitFor(2);
       activityStreamPage.sendBtn.click();

    }

    @Then("User can See his sample text in the activity stream history")
    public void user_can_See_his_sample_text_in_the_activity_stream_history() {
     String expectedText = "sample text";
     String actualText = activityStreamPage.activityHistory.getText();

        Assert.assertEquals("no match", expectedText,actualText);
    }


}
