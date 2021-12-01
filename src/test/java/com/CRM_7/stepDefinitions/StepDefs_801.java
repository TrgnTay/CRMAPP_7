package com.CRM_7.stepDefinitions;

import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefs_801 {
    Driver driver;
    @Given("The user is on the Portal page.")
    public void the_user_is_on_the_Portal_page() {
        String expectedPageTitle = "Portal";
        String actualPagetitle = driver.get().getTitle();

        System.out.println(Driver.get().getTitle());

        Assert.assertTrue(actualPagetitle.contains(expectedPageTitle));
    }

    @When("The user clicks on the comment, he/she is able to make a comment on the employee's posts.")
    public void the_user_clicks_on_the_comment_he_she_is_able_to_make_a_comment_on_the_employee_s_posts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user clicks on the like, he\\/she is able to like the posts.")
    public void the_user_clicks_on_the_like_he_she_is_able_to_like_the_posts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user clicks on the unfollow, he\\/she is able to unfollow the user's posts.")
    public void the_user_clicks_on_the_unfollow_he_she_is_able_to_unfollow_the_user_s_posts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
