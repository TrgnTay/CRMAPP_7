package com.CRM_7.stepDefinitions;
import com.CRM_7.pages.AppreciationPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AttachLink {
    AppreciationPage appreciationPage = new AppreciationPage();

    @When("User click on attach link icon")
    public void user_click_on_attach_link_icon() {
        appreciationPage.link.click();
        BrowserUtils.waitFor(2);
    }

    @When("User inputs text {string}")
    public void user_inputs_text(String string) {
      appreciationPage.linktext.sendKeys("youtube");
        BrowserUtils.waitFor(2);
    }

    @When("User inputs link {string}")
    public void user_inputs_link(String string) {
        appreciationPage.linkURL.sendKeys("https://www.youtube.com/watch?v=1Jv3IBTO19w&ab_channel=RelaxingJazzBGM");
        appreciationPage.linkSave.click();
        BrowserUtils.waitFor(2);
    }

    @Then("the link should work")
    public void theLinkShouldWork() {
        Driver.get().switchTo().frame(appreciationPage.linkIframe);


    }
}


