package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage1;
import com.CRM_7.pages.AppreciationPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AppreciationPage_StepDefinitions {
    AppreciationPage appreciationPage = new AppreciationPage();
    ActivityStreamPage1 activityStreamPage = new ActivityStreamPage1();

    @Given("Navigate to Appreciation module")
    public void navigateToAppreciationModule() {
        activityStreamPage.more.click();
        activityStreamPage.appreciation.click();
        BrowserUtils.waitFor(2);
    }



    @When("User click on add mention icon")
    public void user_click_on_add_mention_icon() {
        appreciationPage.mention.click();
        BrowserUtils.waitFor(2);
    }


    @And("User clicks on Employees and Departments")
    public void userClicksOnEmployeesAndDepartments() {
        appreciationPage.employeesAndDepartments.click();
        BrowserUtils.waitFor(2);
    }

    @Then("contacts should be listed")
    public void contactsShouldBeListed() {
        Assert.assertFalse(appreciationPage.ContactsList.isEmpty());
    }

    @When("User adds {string} from contact list")
    public void user_adds_from_contact_list(String employee) {
        appreciationPage.hr78.click();
        BrowserUtils.waitFor(2);
    }

    @Then("{string} is visible as mentioned")
    public void isVisibleAsMentioned(String arg0) {
        appreciationPage.swapToIframe();
        Assert.assertTrue(Driver.get().findElement(By.xpath("html[1]/body[1]/span[1]")).isDisplayed());
    }


    @When("User click on Add more button")
    public void user_click_on_Add_more_button() {
        appreciationPage.addMore.click();
        BrowserUtils.waitFor(2);
    }

    @Then("{string} is visible as recipient")
    public void isVisibleAsRecipient(String recipient) {
        String actual = appreciationPage.container.getText();
        Assert.assertTrue(actual.contains(recipient));
    }

    @When("User clicks on Quote text icon")
    public void userClicksOnQuoteTextIcon() {
        appreciationPage.quote.click();
        BrowserUtils.waitFor(1);
    }

    @Then("User writes {string}")
    public void user_writes(String string) {
        appreciationPage.swapToIframe();
        appreciationPage.blockQuote.sendKeys(string);
        BrowserUtils.waitFor(1);
    }

    @Then("The quote should contain the message")
    public void theQuoteShouldContainTheMessage() {
        String actual = appreciationPage.blockQuote.getText();
        Assert.assertTrue(actual.contains("Good morning cydeo!"));
    }

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
        BrowserUtils.waitFor(2);
    }

    @And("User clicks on save")
    public void userClicksOnSave() {
        appreciationPage.linkSave.click();
        BrowserUtils.waitFor(2);
    }
    @Then("link should appear")
    public void linkShouldAppear() {
        appreciationPage.swapToIframe();
        String box = Driver.get().findElement(By.xpath("html[1]/body[1]")).getText();
        Assert.assertTrue(box.contains("youtube"));
    }

//    @Then("link text which is {string} should be displayed")
//    public void linkTextWhichIsShouldBeDisplayed(String linktext) {
//        appreciationPage.swapToIframe();
//        String box = Driver.get().findElement(By.xpath("html[1]/body[1]")).getText();
//        Assert.assertTrue(box.equals(linktext));
//    }
}
