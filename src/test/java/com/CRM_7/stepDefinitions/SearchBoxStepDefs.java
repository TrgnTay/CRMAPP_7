package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.BasePage;
import com.CRM_7.pages.EmployeesPage;
import com.CRM_7.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SearchBoxStepDefs {
    EmployeesPage employeesPage=new EmployeesPage();
     BasePage basepage = new BasePage();

    @Given("the user clicks on the Find Employee button")
    public void the_user_clicks_on_the_Find_Employee_button() {
        employeesPage.findEmployee.click();

    }

    @When("the user sees the search box")
    public void the_user_sees_the_search_box() {

        EmployeesPage employeesPage = new EmployeesPage();
        Assert.assertTrue(employeesPage.SearchBox.isDisplayed());
    }

    @Then("the user is able to search employees by search box")
    public void the_user_is_able_to_search_employees_by_email() {
        employeesPage.SearchBox.sendKeys("m.sevinc12@gmail.com");
      BrowserUtils.waitFor(3);
    }



}
