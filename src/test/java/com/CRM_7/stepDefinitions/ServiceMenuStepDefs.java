package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ServicePage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import java.util.Random;

public class ServiceMenuStepDefs {

    ServicePage servicepage = new ServicePage();
    Random random = new Random();
    int randomInt = random.nextInt(1000000000);


    //Background
    @And("The user clicks on the Services button on the left side of the screen")
    public void UserClicksServiceButton(){

        servicepage.ServicesButton.click();
    }


    @Then("The user clicks on the Ideas button on the top dashboard")
    public void UserClicksIdeaButton() {

        servicepage.IdeasButton.click();
    }


    //#1
    @When("The user clicks the New Idea button")
    public void UserClicksTheNewIdeaButton() {

        servicepage.NewIdeaButton.click();
    }

    @And("The user enters the information required")
    public void UserEntersInfo() {
        //Title
        servicepage.TitleBox.sendKeys("Office Party");
        BrowserUtils.waitFor(2);
        //Description
        Driver.get().switchTo().frame(servicepage.IdeaDescriptionFrame);
        servicepage.TextField.sendKeys("We should have a Christmas Party");
        Driver.get().switchTo().defaultContent();
        //Tags
        servicepage.TagsButton.sendKeys("Advice");
        //Category
        Select DropDownElement = new Select(servicepage.CategoryDropdown);
        DropDownElement.selectByValue("OUR_EVENTS");
    }

    @And("The user clicks the Suggest New Idea button")
    public void theUserClicksTheSuggestNewIdeaButton() {

        servicepage.SendIdeaButton.click();
    }

    @Then("The idea should be created successfully")
    public void theIdeaShouldBeCreatedSuccessfully() {
        String ExpectedTitle= "Office Party";
        String ActualTitle= servicepage.PostName.getText();
        Assert.assertEquals(ExpectedTitle,ActualTitle);
    }


    //#2
    @When("The user clicks the dislike button")
    public void theUserClicksTheDislikeButton() {

        servicepage.DislikePost.click();
    }

    @Then("The post should have a red number -1")
    public void thePostShouldHaveARedNumber() {
        BrowserUtils.waitFor(2);
        String ActualRating=servicepage.RatingVoteResultMinus.getText();
        String ExpectedRating="-1";
        servicepage.RatingMinusActive.click();
        Assert.assertEquals(ExpectedRating,ActualRating);
    }


    //#3
    @When("The user clicks the like button")
    public void UserClicksTheLikeButton() {

        servicepage.LikePost.click();
    }

    @Then("The post should have a green number 1")
    public void thePostShouldHaveLike() {
        BrowserUtils.waitFor(2);
        String ActualRating=servicepage.RatingVoteResultPlus.getText();
        String ExpectedRating="1";
        servicepage.RatingPlusActive.click();
        Assert.assertEquals(ExpectedRating,ActualRating);
    }


    //#6
    @When("The user clicks the New Category button")
    public void theUserClicksTheNewCategoryButton() {

        servicepage.NewCategory.click();
    }

    @And("The user enters the information")
    public void theUserEntersTheInformation() {
        BrowserUtils.waitFor(2);
        servicepage.CategoryName.sendKeys("Safe"+randomInt);
    }

    @And("The user clicks the Save and Add button")
    public void theUserClicksTheSaveAndAddButton() {
        BrowserUtils.waitFor(2);
        servicepage.SaveAndAddButton.click();
    }

    @Then("The category should be added")
    public void theCategoryShouldBeAdded() {

        BrowserUtils.waitFor(5);
        servicepage.CategoryName.sendKeys("Safe"+randomInt);
        BrowserUtils.waitFor(2);
        servicepage.SaveAndAddButton.click();
        String ExpectedMessage= "A section with this symbolic code already exists.";
        String ActualMessage= servicepage.ErrorMessage.getText();
        Assert.assertEquals(ExpectedMessage,ActualMessage);
    }
}
