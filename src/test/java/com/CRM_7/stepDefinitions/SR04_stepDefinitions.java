package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.NewsPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

import java.util.List;
import java.util.Set;

public class SR04_stepDefinitions {
    Driver driver; //???
    com.CRM_7.pages.NewsPage NewsPage = new NewsPage();

    @Given("the user clicks on Add News")
    public void the_user_clicks_on_Add_News() {
        NewsPage.Addnews4.click();
        BrowserUtils.waitFor(2);
    }


    @When("user clicks one of Text HTML Visual Editor")
    public void user_clicks_one_of_Text_HTML_Visual_Editor() {
        NewsPage.TextCheckbox.click();
        BrowserUtils.waitFor(1);

        NewsPage.HTMLCheckbox.click();
        BrowserUtils.waitFor(1);

        NewsPage.VisualEdtrCheckbox.click();
       BrowserUtils.waitFor(1);



    }

    @Then("the clicked option is selected")
    public void the_clicked_option_is_selected() {
        NewsPage.TextCheckbox.click();
        NewsPage.TextCheckbox.isEnabled();
        System.out.println("Text Button is Selected");
        Assert.assertTrue(NewsPage.TextCheckbox.isDisplayed());

        NewsPage.HTMLCheckbox.click();
        NewsPage.HTMLCheckbox.isEnabled();
        System.out.println("HTML is Selected");
        Assert.assertTrue(NewsPage.HTMLCheckbox.isDisplayed());

        NewsPage.VisualEdtrCheckbox.click();
        NewsPage.VisualEdtrCheckbox.isEnabled();
        System.out.println("Visual Editor is selected");
        Assert.assertTrue(NewsPage.VisualEdtrCheckbox.isDisplayed());
    }


}
