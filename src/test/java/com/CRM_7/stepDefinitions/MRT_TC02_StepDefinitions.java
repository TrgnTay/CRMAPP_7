package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.MrtEventsPage;
import com.CRM_7.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MRT_TC02_StepDefinitions {

    MrtEventsPage MrtEvent = new MrtEventsPage();

    @Then("User should be able to see event details parameters as follows")
    public void user_should_be_able_to_see_event_details_parameters_as_follows(List<String> expectedEventDetails) {

        int i = 0;
        List<String> actualEventDetailsVisible = new ArrayList<>();
        for (WebElement EventDetailsVisible : MrtEvent.EventDetails) {
            if(EventDetailsVisible.isDisplayed()){
                i++;
                if(i<5){
                    actualEventDetailsVisible.add(EventDetailsVisible.getText());}
            }
        }

        Assert.assertEquals(expectedEventDetails,actualEventDetailsVisible);

    }

}
