package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.PortalPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AnnouncementStef {
    @When("enters {string} in the Announcement input box")
    public void enters_in_the_Announcement_input_box(String string1) {
        Driver.get().switchTo().frame(Driver.get().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
        new PortalPage().announceBtn.sendKeys(string1);
        BrowserUtils.waitFor(3);
        Driver.get().switchTo().defaultContent();
    }

    @When("clicks Sendbutton")
    public void clicks_Sendbutton() {
        new PortalPage().Send.click();

    }
        @Then("the textt {string} should be displayed on the page")
        public void the_textt_should_be_displayed_on_the_page(String string1) {

            String actualresult= Driver.get().findElement(By.xpath("//div[@class='feed-post-text-block-inner-inner'][text()='"+string1+"']")).getText();
            System.out.println(actualresult);

            Assert.assertTrue(string1,actualresult.contains(string1));
            BrowserUtils.waitFor(4);
    }

}
