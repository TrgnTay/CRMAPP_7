package com.CRM_7.stepDefinitions;

import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC01_StepDefinitions {

    @Given("the user clicks Event")
    public void the_user_clicks_Event() {
    }

    @When("user clicks Event icon")
    public void user_clicks_Event_icon() {
        WebElement Event = Driver.get().findElement(By.xpath("//span[@id=\"feed-add-post-form-tab-calendar\"]"));
        Event.click();
    }
    @Then("user should be able to set a reminder")
    public void user_should_be_able_to_set_a_reminder() {
        WebElement ReminderCount = Driver.get().findElement(By.xpath("//input[@name=\"EVENT_REMIND\"]"));

        String expectedText="";
        String actualText= ReminderCount.getText();
        Assert.assertEquals("NOT matched",expectedText,actualText);
    }


}
