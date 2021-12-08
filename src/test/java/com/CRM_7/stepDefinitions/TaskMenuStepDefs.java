package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.BasePage;
import com.CRM_7.pages.TaskMenuPage;
import com.CRM_7.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TaskMenuStepDefs {
    TaskMenuPage taskMenuPage = new TaskMenuPage();
    String expectedMessage;
    String expectedItem;

    @When("User clicks the Task on the top")
    public void userClicksTheTaskOnTheTop() {
        BasePage basePage = new BasePage();
        basePage.Task.click();
        BrowserUtils.waitFor(1);

    }

    @And("User clicks on the High Priority checkbox")
    public void userClicksOnTheHighPriorityCheckbox() {
        taskMenuPage.highPriorityBox.click();

    }

    @Then("Verify that the user clicks successfully")
    public void verifyThatTheUserClicksSuccessfully() {
        Assert.assertTrue(taskMenuPage.highPriorityBox.isSelected());// 这个很重要，需要先叫他 再get,需温习
    }

    @And("User enter the message on the editor text bar {string}")
    public void userEnterTheMessageOnTheEditorTextBar(String message) {
        expectedMessage = message;
        taskMenuPage.editorTextBar.sendKeys(message);

    }

    @Then("Verify that the user sends message successfully")
    public void verifyThatTheUserSendsMessageSuccessfully() {
        String actualMessage = taskMenuPage.editorTextBar.getAttribute("value");

        Assert.assertEquals(actualMessage,expectedMessage);
        BrowserUtils.waitFor(3);
    }


    @And("User clicks on the checklist")
    public void userClicksOnTheChecklist() {
        taskMenuPage.checklistButton.click();
    }

    @And("User enter the item {string}")
    public void userEnterTheItem(String item) {
        expectedItem=item;
        BrowserUtils.waitForVisibility(taskMenuPage.itemWritingBox,5);// burda waitfor yerine agsagidaki
        //kutu gorunene kadar  yani kullanilabilir olana dek bekle demektir bu .
        taskMenuPage.itemWritingBox.sendKeys(item);

    }

    @And("User clicks the add item button")
    public void userClicksTheAddItemButton() {
        taskMenuPage.addItemButton.click();

    }

    @Then("Verify that  user add the item successfully")
    public void verifyThatUserAddTheItemSuccessfully() {
        BrowserUtils.waitForVisibility(taskMenuPage.addedItemLocation,5);
        String actualItem = taskMenuPage.addedItemLocation.getText();
        actualItem=actualItem.trim();// sondaki ve bastaki bosluklari ignore yapmasi icin yaptim,yoksa hata veriyordu
        Assert.assertEquals(expectedItem,actualItem);
        BrowserUtils.waitFor(5);

    }

    @And("User select the responsible person {string}")
    public void userSelectTheResponsiblePerson(String person) {
        taskMenuPage.deletePerson.click();
        taskMenuPage.departmentTab.click();
        List<WebElement> listOfPersons = taskMenuPage.listOfPersons;

        for (WebElement value : listOfPersons) {

            if (value.getText().equals(person)) {

                value.click();
                break;
            }
        }
    }

    @And("User clicks the send button")
    public void userClicksTheSendButton() {
        taskMenuPage.sendButton.click();
    }

    @Then("Verify that user send task successfully and display {string}")
    public void verifyThatUserSendTaskSuccessfullyAndDisplay(String message) {
        BrowserUtils.waitFor(5);

        String actualMessage = taskMenuPage.sendTaskConfirmation.getText();
        Assert.assertEquals(message,actualMessage);
    }
}