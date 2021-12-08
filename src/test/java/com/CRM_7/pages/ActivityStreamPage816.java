package com.CRM_7.pages;

import com.CRM_7.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivityStreamPage816 {

    public ActivityStreamPage816(){
    PageFactory.initElements(Driver.get(), this);
}

    @FindBy(id = "LIVEFEED_search")
    public WebElement FilterAndSearchBox;

    @FindBy(xpath = "//div[@data-id='work']")
    public WebElement WorkFilter;

    @FindBy(css = ".main-ui-filter-sidebar-item")
    public List<WebElement> FilterOptions;

    @FindBy(css = ".main-ui-filter-field-add-item")
    public WebElement AddField;

   @FindBy(xpath = "//div[@data-id='field_FAVORITES_USER_ID']")
    public WebElement FavoritesFieldCheckBox;

    @FindBy(xpath = "//span[@title='Favorites']")
    public WebElement FavoritesTitle;

    @FindBy(xpath = "//span[@title='To']/..")
    public WebElement ToField;

    @FindBy(xpath = "//span[@title='Type']/..")
    public WebElement TypeField;

    @FindBy(xpath = "//span[@title='Date']/..")
    public WebElement DateField;

    @FindBy(xpath = "//span[@title='Extranet']/..")
    public WebElement ExtranetField;

    @FindBy(xpath = "//span[@title='Favorites']/..")
    public WebElement FavoritesField;

    @FindBy(xpath = "//span[@title='Tag']/..")
    public WebElement TagField;

    @FindBy(xpath = "//span[@title='Author']/..")
    public WebElement AuthorField;

    @FindBy(className = "ui-btn ui-btn-primary ui-btn-icon-search main-ui-filter-field-button main-ui-filter-find")
    public WebElement searchButton;

    @FindBy(xpath = "//div[starts-with(@title,'Date: ')]")
    public WebElement searchFilter;

    @FindBy(css = ".main-ui-filter-add-item")
    public WebElement saveFilterButton;

    @FindBy(css = ".ui-btn.ui-btn-success.main-ui-filter-field-button.main-ui-filter-save")
    public WebElement saveFilterNameButton;

    @FindBy(xpath = "//input[@class='main-ui-filter-sidebar-edit-control']")
    public WebElement filterNameBox;

    @FindBy(css = ".main-ui-filter-field-restore-items")
    public WebElement restoreDefaultFields;

    @FindBy(css = ".main-ui-control-field-label")
    public List<WebElement> defaultFieldElements;

}
