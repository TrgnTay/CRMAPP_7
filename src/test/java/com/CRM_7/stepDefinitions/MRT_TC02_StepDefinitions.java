package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.MrtEventsPage;
import com.CRM_7.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MRT_TC02_StepDefinitions {

    MrtEventsPage MrtEvent = new MrtEventsPage();

    @Then("user should be able to set event location from the first index of dropdown")
    public void user_should_be_able_to_set_event_location_from_the_first_index_of_dropdown() {

        MrtEvent.EventLocation.click();
        BrowserUtils.waitFor(2);
    }
}
