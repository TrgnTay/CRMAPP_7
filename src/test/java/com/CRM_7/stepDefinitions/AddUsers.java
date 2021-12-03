package com.CRM_7.stepDefinitions;
import com.CRM_7.pages.AppreciationPage;
import com.CRM_7.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddUsers {

    AppreciationPage appreciationPage = new AppreciationPage();

    @When("User click on Add more button")
    public void user_click_on_Add_more_button() {
        appreciationPage.addMore.click();
        BrowserUtils.waitFor(2);
    }
    @Then("{string} is visible as recipient")
    public void isVisibleAsRecipient(String arg0) {
    }
}


