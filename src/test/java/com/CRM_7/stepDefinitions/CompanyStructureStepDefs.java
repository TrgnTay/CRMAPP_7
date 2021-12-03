package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.EmployeesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CompanyStructureStepDefs {
    @Then("the user is able to display the Company Structure")
    public void the_user_is_able_to_display_the_Company_Structure() {
        EmployeesPage employeesPage = new EmployeesPage();

        Assert.assertTrue(employeesPage.CompanyStructure.isDisplayed());
    }

}

