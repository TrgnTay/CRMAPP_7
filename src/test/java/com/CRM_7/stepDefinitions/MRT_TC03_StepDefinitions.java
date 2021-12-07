package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.MrtEventsPage;
import com.CRM_7.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MRT_TC03_StepDefinitions {

    MrtEventsPage MrtEvent = new MrtEventsPage();

    @Then("User should be able to click on More to see the event details")
    public void user_should_be_able_to_click_on_More_to_see_the_event_details() {

        MrtEvent.MoreLink.click();
        BrowserUtils.waitFor(2);

        String expectedText="Availability";
        String actualText= MrtEvent.MoreAvailability.getText();
        Assert.assertEquals("NOT matched",expectedText,actualText);

    }
}
