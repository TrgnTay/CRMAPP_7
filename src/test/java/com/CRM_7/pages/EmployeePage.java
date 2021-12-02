package com.CRM_7.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EmployeePage extends BasePage{

    @FindBy(xpath = "//span[text()='Find Employee']")
    public WebElement FindEmp;

    @FindBy(xpath = "//input[@id='user-fio']")
    public static WebElement SearchBox;
}
