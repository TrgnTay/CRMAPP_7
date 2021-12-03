package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.PortalPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import  org.junit.Assert;

public class StepDefs_804 {
    PortalPage portalPage=new PortalPage();

    @When("The user clicks on the star.")
    public void theUserClicksOnTheStar() {
        portalPage.starIcon.click();
    }
    @Then("The user is able to click the star icon.")
    public void theUserIsAbleToClickTheStarIcon() {
        Assert.assertTrue(portalPage.starIcon.isDisplayed());
    }
}





