package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.MrtEventsPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MRT_TC01_StepDefinitions {

    MrtEventsPage MrtEvent = new MrtEventsPage();

    @When("user clicks Event icon")
    public void user_clicks_Event_icon() {
        MrtEvent.EventBtn.click();
        BrowserUtils.waitFor(2);
    }
    @Then("user should be able to set a reminder")
    public void user_should_be_able_to_set_a_reminder() {
        String expectedText="";
        String actualText= MrtEvent.ReminderCount.getText();
        Assert.assertEquals("NOT matched",expectedText,actualText);
    }


}
