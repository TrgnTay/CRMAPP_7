package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.ActivityStreamPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;



public class FilterAndSearchStepDefs {
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("User click on Filter and search box")
    public void user_click_on_Filter_and_search_box() {
       activityStreamPage.FilterAndSearchBox.click();
       BrowserUtils.waitFor(2);
    }
//Scenario: User should be able to see default filters

    @Then("User should see default filtres as following options")
    public void user_should_see_default_filtres_as_following_options(List<String> expectedFiltreOptions ) {
        int i = 0;
        List<String> actualFilterOptions = new ArrayList<>();
        for (WebElement filterOptionVisible : activityStreamPage.FilterOptions) {
            if(filterOptionVisible.isDisplayed()){
                i++;
                if(i<6){
                actualFilterOptions.add(filterOptionVisible.getText());}
            }
        }

        Assert.assertEquals(expectedFiltreOptions,actualFilterOptions);

    }


//Scenario: User should be able to see default filters
    @Then("User click on add field button")
    public void user_click_on_add_field_button() {
       activityStreamPage.AddField.click();
       BrowserUtils.waitFor(2);
    }

    @When("User select {string} field")
    public void user_select_field(String fieldName) {
       String locatorField = "//*[contains(@data-id,'"+fieldName.toUpperCase()+"')]";
       WebElement actualField = Driver.get().findElement(By.xpath(locatorField));
        actualField.click();

    }

    @Then("{string} field should be displayed in field area")
    public void field_should_be_displayed_in_field_area(String expectedFieldName) {
        String locatorFieldName = "//span[@title='"+expectedFieldName+"']";
       String actualFieldName = Driver.get().findElement(By.xpath(locatorFieldName)).getText();
        Assert.assertEquals(expectedFieldName,actualFieldName);
    }

    @When("User deselect {string} field")
    public void user_deselect_field(String fieldName) {
        String locatorField = "//*[contains(@data-id,'"+fieldName.toUpperCase()+"')]";
        WebElement actualField = Driver.get().findElement(By.xpath(locatorField));
        actualField.click();
    }



    //User should be able to save filter.

    @When("User click on save filter button")
    public void user_click_on_save_filter_button() {
       activityStreamPage.saveFilterButton.click();
    }

    @Then("User should be able to enter a filter name like {string} and save it")
    public void user_should_be_able_to_enter_a_filter_name_like_and_save_it(String string) {
        activityStreamPage.filterNameBox.sendKeys(string);
        activityStreamPage.saveFilterNameButton.click();
    }

    @Then("User should see saved filter {string} in the filter column.")
    public void user_should_see_saved_filter_in_the_filter_column(String expectedFilterName) {
        String costumeFilterLocator = "//span[text()='"+expectedFilterName+"']";
        String actualFilterName = Driver.get().findElement(By.xpath(costumeFilterLocator)).getText();
        Assert.assertEquals(expectedFilterName,actualFilterName);
    }



    //User should be able to reset filters to default.

    @When("User click on restore default fields button")
    public void user_click_on_restore_default_fields_button() {
        activityStreamPage.restoreDefaultFields.click();
    }

    @Then("User should see default fields as following options")
    public void user_should_see_default_fields_as_following_options(List<String> expectedDefaultListElements) {
      List<String> actualDefaultFieldNames = BrowserUtils.getElementsText(activityStreamPage.defaultFieldElements);
      Assert.assertEquals(expectedDefaultListElements,actualDefaultFieldNames);
    }


}
