package com.CRM_7.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class TaskMenuPage extends BasePage {

    @FindBy(css = "#tasks-task-priority-cb")
    public WebElement highPriorityBox;


    @FindBy(css = ".task-info-panel-title>input")
    public WebElement editorTextBar;

    @FindBy(css = ".tasks-task-mpf-link")
    public  WebElement checklistButton;

    @FindBy (css = ".js-id-checklist-is-form-title.task-checklist-field-add")
    public WebElement itemWritingBox;

    @FindBy (css = ".block-off.task-dashed-link>span")
    public WebElement addItemButton;

    @FindBy(css = ".js-id-checklist-is-i-title ")
    public WebElement addedItemLocation;

    @FindBy(xpath = "(//span[@title=\"Cancel selection\"])[1]")
    public  WebElement deletePerson;

    @FindBy(css = "[id*=\"destDepartmentTab\"]")
    public WebElement departmentTab;

    @FindBy(css = ".bx-finder-company-department-employee-name")
    public List<WebElement> listOfPersons;

    @FindBy(css = "#blog-submit-button-save")
    public  WebElement sendButton;

    @FindBy(css = ".feed-create-task-popup-title")
    public WebElement sendTaskConfirmation;
}
