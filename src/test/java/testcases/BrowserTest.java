package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GoogleHomePage;

public class BrowserTest extends BaseTest {

    @Test
    public void verifyGoogleSearchBoxIsDisplayed() {

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        boolean isDisplayed = googleHomePage.isSearchBoxDisplayed();

        Assert.assertTrue(isDisplayed, "Search box is not displayed on Google Home Page");
    }
}
