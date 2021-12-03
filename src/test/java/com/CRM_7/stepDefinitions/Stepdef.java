package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.BasePage;
import com.CRM_7.pages.EmployeesPage;
import com.CRM_7.pages.PortalPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Stepdef {

    @Given("the user is on the Portal Page")
    public void the_user_is_on_the_Portal_Page() {

        PortalPage portalPage = new PortalPage();
        String expectedPageTitle = "Portal";
        String actualPagetitle = Driver.get().getTitle();

        System.out.println(Driver.get().getTitle());

        Assert.assertTrue(actualPagetitle.contains(expectedPageTitle));
        BrowserUtils.waitFor(5);

    }



    @Given("the user clicks on the Find Employee button")
    public void the_user_clicks_on_the_Find_Employee_button() {
       EmployeesPage employeesPage = new EmployeesPage();
        employeesPage.FindEmp.click();

    }
    @When("the user sees the search box")
    public void the_user_sees_the_search_box() {
        Assert.assertTrue(EmployeesPage.SearchBox.isDisplayed());

    }
    @Then("the user is able to search employees by email")
    public void the_user_is_able_to_search_employees_by_email() {
        Driver.get().findElement(By.xpath("//input[@id='user-fio']")).sendKeys("m.sevinc2012@gmail.com");
        EmployeesPage.SearchBox.click();

    }



}
