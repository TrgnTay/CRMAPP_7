package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.PortalPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PortpalStepDef {
    @When("User navigates to {string} {string}")
    public void user_navigates_to(String tab, String module) {
        new PortalPage().navigateToModule(tab, module);
        BrowserUtils.waitFor(3);
    }

    @When("clicks Add Mention icon")
    public void clicks_Add_Mention_icon() {
new PortalPage().AdMtion();
    }
    @When("clicks Employees and Departments")
    public void clicks_Employees_and_Departments() {
        new PortalPage().setdropdownElement();
    }
    @When("User selects {string} and {string} from Employees and Departments contact lists")
    public void user_selects_and_from_Employees_and_Departments_contact_lists(String expectedUser1, String expectedUser2) throws InterruptedException {
        Driver.get().findElement(By.xpath("//div[.='Ginger Cat'][@class='bx-finder-company-department-employee-name']")).click();

        Driver.get().findElement(By.id("bx-destination-tag")).click();

        new PortalPage().setdropdownElement();

        Driver.get().findElement(By.xpath("//div[.='Murat Kahveci'][@class='bx-finder-company-department-employee-name']")).click();
    }

    @Then("The input box should show descriptions containing {string} and {string}")
    public void the_input_box_should_show_descriptions_containing_and(String expectedUser1, String expectedUser2) {

        String actualUser2= Driver.get().findElement(By.xpath("//span[.='Murat Kahveci'][@class='feed-add-post-destination-text']")).getText();
        String actualUser1= Driver.get().findElement(By.xpath("//span[.='Ginger Cat'][@class='feed-add-post-destination-text']")).getText();
        Assert.assertEquals(expectedUser1,actualUser1);
        Assert.assertEquals(expectedUser2,actualUser2);
    }




}
