package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
    public CompanyPage() {
        PageFactory.initElements(Driver.get(), this);
    }

        @FindBy (xpath = "//span[text() = 'Company Structure'] ")
        public WebElement CompanyStructure;

         @FindBy (xpath ="//*[@id='pagetitle-menu']/a")
          public WebElement AddDepartment;

         @FindBy (xpath = "//input[@id='NAME']")
         public WebElement DepName;

         @FindBy (xpath = "//*[@id='BXStructure']/div[3]/span[1]")
         public WebElement AddedDepartment;


    }
