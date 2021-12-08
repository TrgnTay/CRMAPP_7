package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.PortalPage1;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class QuoteStef {
    @When("clicks quote test icon")
    public void clicks_quote_test_icon() {
       new PortalPage1().quotebtn.click();
        BrowserUtils.waitFor(2);
    }

    @When("enter {string}")
    public void enter(String string1) {
        WebElement fr= Driver.get().findElement(By.xpath("//iframe[@class='bx-editor-iframe']"));
        Driver.get().switchTo().frame(fr);
Driver.get().findElement(By.xpath("//blockquote[@class='bxhtmled-quote']")).clear();
        Driver.get().findElement(By.xpath("//blockquote[@class='bxhtmled-quote']")).sendKeys(string1);
        Driver.get().switchTo().defaultContent();

    }

    //@When("clicks send")
   // public void clicks_send() {
      //  new PortalPage().Send.click();
       // BrowserUtils.waitFor(2);
   // }


    @Then("the text {string} should be displayed on the page")
    public void the_text_should_be_displayed_on_the_page(String string2) {

        String actualresult= Driver.get().findElement(By.xpath("//*[@class='blog-post-quote']")).getText();
        System.out.println(actualresult);

        Assert.assertEquals(string2,actualresult);
        BrowserUtils.waitFor(4);
    }


}
