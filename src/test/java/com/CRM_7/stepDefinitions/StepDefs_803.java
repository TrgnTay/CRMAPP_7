package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.PortalPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefs_803 {
    Driver driver;
    PortalPage portalPage= new PortalPage();

    @When("The user is able to click on reviewers' names.")
    public void the_user_is_able_to_click_on_reviewers_names() {
    portalPage.gingerProfile.click();
        BrowserUtils.waitFor(3);
    }

    @Then("The user is able to visit the reviewers' profiles.")
    public void the_user_is_able_to_visit_the_reviewers_profiles() {
        System.out.println(Driver.get().getTitle());
        BrowserUtils.waitFor(2);
        Assert.assertTrue(portalPage.gingerProfileName.isDisplayed());
    }
}
