package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.PortalPage1;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class AttachLinkStef {
    @When("clicks Link icon")
    public void clicks_Link_icon() {

        new PortalPage1().linkIcon.click();
    }

    @When("enters {string} in the text input box")
    public void enters_in_the_text_input_box(String string1) {

        Driver.get().findElement(By.id("linkidPostFormLHE_blogPostForm-text")).sendKeys(string1);
    }

    @When("copy paste {string} in the link input box")
    public void copy_paste_in_the_link_input_box(String string2) {


        new PortalPage1().linkUrl.sendKeys(string2);
    }

    @When("clicks Save")
    public void clicks_Save() {

        new PortalPage1().Save.click();
        BrowserUtils.waitFor(3);
    }

    @When("clicks Send")
    public void clicks_Send() {
        new PortalPage1().Send.click();
        BrowserUtils.waitFor(5);

    }
    @When("clicks zerobankApp")
    public void clicks_zerobankApp() {
        new PortalPage1().zeroBankLink.click();
        BrowserUtils.waitFor(8);

        String currentWindowHandle = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles();
        for (String handle : windowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                Driver.get().switchTo().window(handle);
            }

        }
        System.out.println("Title after switch new window: " + Driver.get().getTitle());
    }

    @Then("the page and the title contains {string}")
    public void the_page_and_the_title_contains(String string3) {

//Driver.get().navigate().to("http://zero.webappsecurity.com");
        String actualTitle = Driver.get().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(string3, actualTitle);


    }

}
