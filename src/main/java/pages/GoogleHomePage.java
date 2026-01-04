package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.ActionUtils;
import utilities.WaitUtils;

public class GoogleHomePage {

    private WaitUtils wait;
    private ActionUtils actionUtils;

    // Locators
    private By searchBox = By.name("q");

    public GoogleHomePage(WebDriver driver) {
        this.wait = new WaitUtils(driver);
        this.actionUtils = new ActionUtils(driver);
    }

    public void searchUsingKeyboard(String text) {
        wait.waitForElementVisible(searchBox).sendKeys(text);
        actionUtils.sendKeys(searchBox, Keys.ENTER.toString());
    }

    public boolean isSearchResultPageLoaded(String expectedTitle) {
        return wait.waitForTitleContains(expectedTitle);
    }
}
