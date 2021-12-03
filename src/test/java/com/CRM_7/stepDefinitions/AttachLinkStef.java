package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.PortalPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AttachLinkStef {
    @When("clicks Link icon")
    public void clicks_Link_icon() {
        new PortalPage().linkIcon.click();
    }

    @When("enters {string} in the text input box")
    public void enters_in_the_text_input_box(String string1) {

Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-text")).sendKeys(string1);
    }

    @When("copy paste {string} in the link input box")
    public void copy_paste_in_the_link_input_box(String string2) {
     new PortalPage().linkUrl.sendKeys(string2);
    }

    @When("clicks Save")
    public void clicks_Save() {
       new PortalPage().Save.click();
    }

    @When("clicks Send")
    public void clicks_Send() {
        new PortalPage().Send.click();
        BrowserUtils.waitFor(2);
        new PortalPage().Cydeolink.click();
        BrowserUtils.waitFor(8);

        WebElement element = Driver.get().findElement(By.xpath("//i[@class='eicon-close']"));
        if (element.isDisplayed() && element.isEnabled()) {
            element.click();
        }


        //Driver.get().findElement(By.xpath("gg")).click();
        BrowserUtils.waitFor(2);
    }

    @Then("clicks cydeo on the page and the title contains {string}")
    public void clicks_cydeo_on_the_page_and_the_title_contains(String string3) {

        //Driver.get().findElement(By.xpath("//*[text()='Get Started Now']")).click();
        System.out.println(Driver.get().getTitle());
Assert.assertTrue(Driver.get().getTitle().contains(string3));


    }

}
