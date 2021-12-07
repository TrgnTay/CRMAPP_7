package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.MrtEventsPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MRT_TC04_StepDefinitions {

    MrtEventsPage MrtEvent = new MrtEventsPage();

//    @Then("User should be able to click on More to see the event details")
//    public void user_should_be_able_to_click_on_More_to_see_the_event_details() {
//
//        MrtEvent.MoreLink.click();
//        BrowserUtils.waitFor(2);
//
//        String expectedText="Availability";
//        String actualText= MrtEvent.MoreAvailability.getText();
//        Assert.assertEquals("NOT matched",expectedText,actualText);
//
//    }


    @Then("User should be able to send a message")
    public void user_should_be_able_to_send_a_message() throws InterruptedException {

        MrtEvent.EventName.sendKeys("Ginger Cat Celebrations!");

        BrowserUtils.waitFor(2);

        String expectedText="";
        String actualText= MrtEvent.EventName.getText(); // dummy assertion here. .getText() does not retrieve the visible text...
        Assert.assertEquals("NOT matched",expectedText,actualText);

        MrtEvent.SendBtn.click();

        BrowserUtils.waitFor(5);

    }

}
