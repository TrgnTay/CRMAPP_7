package com.CRM_7.stepDefinitions;

import com.CRM_7.pages.NewsPage;
import com.CRM_7.utilities.BrowserUtils;
import com.CRM_7.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SR03_stepDefinitions {
    Driver driver; //???
    com.CRM_7.pages.NewsPage NewsPage = new NewsPage();


    @When("user presses on type of information")
    public void user_presses_on_type_of_information() {
        NewsPage.infotype.click();

    }

    @When("selects one of the options")
    public void selects_one_of_the_options() {
        NewsPage.GeneralInfoOption.click();
        BrowserUtils.waitFor(1);
        NewsPage.infotype.click();
        NewsPage.AnnouncementOption.click();
        BrowserUtils.waitFor(1);
        NewsPage.infotype.click();
        NewsPage.NewsOption.click();
        BrowserUtils.waitFor(1);
        NewsPage.infotype.click();
        NewsPage.NoticeOption.click();
        BrowserUtils.waitFor(1);
        NewsPage.infotype.click();
        NewsPage.OrderOption.click();
        BrowserUtils.waitFor(1);
        NewsPage.infotype.click();
        NewsPage.GeneralInfoOption.click();
        BrowserUtils.waitFor(1);
        NewsPage.infotype.click();
        NewsPage.PressReleaseOption.click();
        BrowserUtils.waitFor(1);

    }

    @Then("that information is selected")
    public void that_information_is_selected() {

        NewsPage.infotype.click();
        NewsPage.OrderOption.click();
        NewsPage.OrderOption.isEnabled();
        System.out.println("Order is selected");
        Assert.assertTrue(NewsPage.VisualEdtrCheckbox.isDisplayed());

        NewsPage.infotype.click();
        NewsPage.PressReleaseOption.click();
        NewsPage.PressReleaseOption.isEnabled();
        System.out.println("Press Release is selected");
        Assert.assertTrue(NewsPage.VisualEdtrCheckbox.isDisplayed());

        NewsPage.infotype.click();
        NewsPage.GeneralInfoOption.click();
        NewsPage.GeneralInfoOption.isEnabled();
        System.out.println("General Info is selected");

        NewsPage.infotype.click();
        NewsPage.NoticeOption.click();
        NewsPage.NoticeOption.isEnabled();
        System.out.println("Notice is selected");
        Assert.assertTrue(NewsPage.VisualEdtrCheckbox.isDisplayed());

        NewsPage.infotype.click();
        NewsPage.AnnouncementOption.click();
        NewsPage.AnnouncementOption.isEnabled();
        System.out.println("Announcement is selected");
        Assert.assertTrue(NewsPage.VisualEdtrCheckbox.isDisplayed());

        NewsPage.infotype.click();
        NewsPage.PortalNews.click();
        NewsPage.PortalNews.isEnabled();
        System.out.println("Portal News is selected");
        Assert.assertTrue(NewsPage.VisualEdtrCheckbox.isDisplayed());

        NewsPage.infotype.click();
        NewsPage.NewsOption.click();
        NewsPage.NewsOption.isEnabled();
        System.out.println("News is selected");
        Assert.assertTrue(NewsPage.VisualEdtrCheckbox.isDisplayed());




    }

}
