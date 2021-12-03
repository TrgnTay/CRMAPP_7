package com.CRM_7.stepDefinitions;
import com.CRM_7.pages.AppreciationPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class CreateQuote {
    AppreciationPage appreciationPage = new AppreciationPage();
    @When("User click on comma icon")
    public void user_click_on_comma_icon() {
        appreciationPage.quote.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User writes {string}")
    public void user_writes(String string) {
        Driver.get().switchTo().frame(appreciationPage.blockQuote);
        appreciationPage.blockQuote.sendKeys(string);
        BrowserUtils.waitFor(1);
        Driver.get().switchTo().defaultContent();
    }
}
