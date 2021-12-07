package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.NewsPage;
import com.CRM_7.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SR01_stepDefinitions {

    NewsPage NewsPage = new NewsPage();

    @Given("the user navigates to company")
    public void the_user_navigates_to_company() {
        NewsPage.Companybtn.click();
    }

    @When("user clicks add news")
    public void user_clicks_add_news() {
       NewsPage.AddNews.click();
       BrowserUtils.waitFor(1);
       NewsPage.ControlPanel.click();
       NewsPage.AddTitle.sendKeys("MOW MOW");
       BrowserUtils.waitFor(1);
    }
    @Then("user is able to post news")
    public void user_is_able_to_post_news() {
        NewsPage.SavePanel.click();
        BrowserUtils.waitFor(1);


        BrowserUtils.waitFor(1);
        String expectedText = "MOW MOW";
        String actualText = NewsPage.AssertionProof.getText();
        Assert.assertEquals("NOT matched",expectedText,actualText);

    }

}
