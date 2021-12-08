package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


    public class NewsPage extends BasePage {

        public NewsPage(){
            PageFactory.initElements(Driver.get(),this);

        }
//task SR01

        @FindBy(xpath = "//span[@class=\"webform-small-button-text\"][1]")
        public WebElement AddNews;

        @FindBy (xpath = "//input[@name=\"NAME\"]")
        public WebElement AddTitle;

        @FindBy (xpath = "//a[@title=\"Company\"]")
        public WebElement Companybtn;

        @FindBy (xpath = "//a[contains(text(),'MOW MOW')]")
        public WebElement AssertionProof;

        @FindBy (id = "edit_in_panel")
        public WebElement ControlPanel;

        @FindBy(id ="save")
        public WebElement SavePanel;

//task SR02

        @FindBy(id="tab_cont_cedit2")
        public WebElement Details;

        @FindBy(xpath = "//input[@name='TAGS']")
        public WebElement TagsField;

        @FindBy(css ="label[title='Sort by name']")
        public WebElement Checkbox;

        @FindBy(xpath = "//a[@title='News']")
        public WebElement Newsbtn;

        @FindBy(css = "a.ui-btn.ui-btn-primary")
        public WebElement AddNewsPanel;

        // @FindBy(id="tab_cont_cedit1")
        // public WebElement PreviewText;

       // @FindBy(xpath = "//input[@name='FIND']")
      //  public WebElement FilterSearch;

       // @FindBy(css = "span.main-ui-filter-field-add-item")
      //  public WebElement AddFieldFilter;

        //@FindBy(xpath = "//div[contains(text(),'Tags')]")
        //public  WebElement TagsBox;

        //@FindBy(css = "button.ui-btn.ui-btn-primary")
        //public WebElement SearchTag;

        @FindBy (xpath = "//*[text()='Test Steff']")
        public WebElement TestSteff;


        //task with calendar
        @FindBy(xpath = "//span[@class='adm-calendar-icon']")
        public WebElement Calendaricon;

        @FindBy(xpath = "//a[@class=\"bx-calendar-cell bx-calendar-active\"]")
//a[@class="bx-calendar-cell bx-calendar-active"]
        public WebElement SixDecember21;

        @FindBy(xpath = "//a[@class=\"bx-calendar-set-time\"]")
        public WebElement SetHourBtn;

        @FindBy(xpath = "//input[@class=\"bx-calendar-form-input\"][1]")
        public WebElement HourBtn;

        @FindBy(xpath = "//input[@class=\"bx-calendar-form-input\"][2]")
        public WebElement MinuteBtn;

        @FindBy(xpath = "//span[text()='Select']")
        public WebElement SelectTimeBtn;


//task SRO3

        @FindBy (xpath ="//select[@name='PROP[3][]']" )
        public WebElement infotype;

        @FindBy (xpath = "//option[contains(text(),'Announcement')]")
        public WebElement AnnouncementOption;

        @FindBy (xpath = "//option[contains(text(),'General info')]")
        public WebElement GeneralInfoOption;

        @FindBy (xpath = "//option[contains(text(),'News')][1]")
        public WebElement NewsOption;

        @FindBy (xpath = "//option[contains(text(),'Notice')]")
        public WebElement NoticeOption;

        @FindBy (xpath = "//option[contains(text(),'Order')]")
        public WebElement OrderOption;

        @FindBy (xpath = "//option[contains(text(),'Portal News')]")
        public WebElement PortalNews;

        @FindBy (xpath = "//option[contains(text(),'Press Release')]")
        public WebElement PressReleaseOption;



//task SR04

        @FindBy(xpath = "//a[@title='Add News']")
        public WebElement Addnews4;

        @FindBy(xpath = "//input[@id=\"bxed_PREVIEW_TEXT_text\"]")
        public WebElement TextCheckbox;

        @FindBy(xpath = "//input[@id=\"bxed_PREVIEW_TEXT_html\"]")
        public WebElement HTMLCheckbox;

        @FindBy(xpath = "//input[@id=\"bxed_PREVIEW_TEXT_editor\"]")
        public WebElement VisualEdtrCheckbox;






    }
