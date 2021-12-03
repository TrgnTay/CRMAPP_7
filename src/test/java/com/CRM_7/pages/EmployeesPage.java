package com.CRM_7.pages;


import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmployeesPage extends BasePage{
    public EmployeesPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "//span[text() = 'Company Structure'] ")
    public WebElement CompanyStructure;

    @FindBy (className = "webform-small-button-text")
    public WebElement AddDepartmentButton;

    @FindBy (xpath = "//input[@id='NAME']")
    public WebElement DepNameBox;

    @FindBy (xpath = "//div[@class='popup-window-buttons']/span[1]")
    public WebElement AddButton;

    @FindBy(id = "popup-window-titlebar-BXStructure")
    public WebElement addDepartmentPopup;


    @FindBy(xpath = "//span[text()='Find Employee']")
    public WebElement FindEmp;

    @FindBy(xpath = "//input[@id='user-fio']")
    public static WebElement SearchBox;
}
