package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.BasePage;
import com.CRM_7.pages.CompanyPage;
import com.CRM_7.pages.PortalPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Stepdef {


    CompanyPage companyPage = new CompanyPage();
    @Given("the user is on the Portal Page")
    public void the_user_is_on_the_Portal_Page() {
        PortalPage portalPage = new PortalPage();
        String expectedPageTitle= "Portal";
        String actualPageTitle = Driver.get().getTitle();
        Assert.assertTrue(actualPageTitle.contains(expectedPageTitle));
    }

    @Given("the user clicks on the employees function")
    public void the_user_clicks_on_the_employees_function() {
        BasePage basepage = new BasePage();
        basepage.Employees.click();
    }
    @When("the user clicks on the Add department button")
    public void the_user_clicks_on_the_Add_department_button() {
        CompanyPage companyPage = new CompanyPage();
        companyPage.AddDepartment.click();
        BrowserUtils.waitFor(5);

    }
    @Then("the user is able to add a department")
    public void the_user_is_able_to_add_a_department() {
        Driver.get().findElement(By.xpath("//input[@id='NAME']")).sendKeys("SalesDepartment");
        companyPage.AddedDepartment.click();
        BrowserUtils.waitFor(3);
    }
    @Then("the user is able to display the Company Structure")
    public void the_user_is_able_to_display_the_Company_Structure() {

        String actualTitle = Driver.get().getTitle();
        String expectedName = "Company Structure";
        Assert.assertTrue(companyPage.CompanyStructure.isDisplayed());
    }

    @Given("the user clicks on the Find Employee button")
    public void the_user_clicks_on_the_Find_Employee_button() {

    }
    @When("the user sees the search box")
    public void the_user_sees_the_search_box() {

    }
    @Then("the user is able to search employees by email")
    public void the_user_is_able_to_search_employees_by_email() {

    }

}
