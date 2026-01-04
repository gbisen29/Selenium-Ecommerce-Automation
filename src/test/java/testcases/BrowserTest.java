package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.GoogleHomePage;

public class BrowserTest extends BaseTest {

    @Test
    public void verifyGoogleSearchUsingKeyboard() {

        GoogleHomePage googleHomePage = new GoogleHomePage(driver);

        googleHomePage.searchUsingKeyboard("Selenium WebDriver");

        boolean resultLoaded = googleHomePage.isSearchResultPageLoaded("Selenium");

        Assert.assertTrue(resultLoaded, "Search result page did not load properly");
    }
}
