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

public class AddDepartmentStepDefs {
    @Given("the user is on the Portal Page")
    public void the_user_is_on_the_Portal_Page() {

        PortalPage portalPage = new PortalPage();
        String expectedPageTitle = "Portal";
        String actualPagetitle = Driver.get().getTitle();

        System.out.println(Driver.get().getTitle());

        Assert.assertTrue(actualPagetitle.contains(expectedPageTitle));
        BrowserUtils.waitFor(5);

    }
    @Given("the user clicks on the employees")
    public void the_user_clicks_on_the_employees() {
        EmployeesPage employeesPage = new EmployeesPage();
        employeesPage.Employees.click();
    }
    @When("the user clicks on the Add department button")
    public void the_user_clicks_on_the_Add_department_button() {
        EmployeesPage employeesPage = new EmployeesPage();
        employeesPage.AddDepartmentButton.click();
        BrowserUtils.waitFor(3);

    }
    @Then("the user should see add department pop-up")
    public void theUserShouldSeeAddDepartmentPopUp() {
        EmployeesPage employeesPage = new EmployeesPage();
        Assert.assertTrue(employeesPage.addDepartmentPopup.isDisplayed());
    }

    @Then("the user is able to add a department name")
    public void the_user_is_able_to_add_a_department() {

        EmployeesPage employeesPage = new EmployeesPage();
        Driver.get().findElement(By.xpath("//input[@id='NAME']")).sendKeys("SalesDepartment");

    }

    @Then("the user clicks on add button")
    public void theUserClicksOnAddButton() {
        new EmployeesPage().AddButton.click();
        BrowserUtils.waitFor(3);

    }

}
