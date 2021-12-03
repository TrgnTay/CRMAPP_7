package com.CRM_7.stepDefinitions;
import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.pages.AppreciationPage;
import com.CRM_7.pages.BasePage;
import com.CRM_7.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddMention {
    AppreciationPage appreciationPage = new AppreciationPage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

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

    @When("User adds {string} from contact list")
    public void user_adds_from_contact_list(String employee) {
        appreciationPage.hr76.click();
        BrowserUtils.waitFor(2);
    }

    @Then("{string} is visible as mentioned")
    public void isVisibleAsMentioned(String arg0) {

    }
}


