package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.WaitUtils;

public class GoogleHomePage {

    private WaitUtils wait;

    // Locators
    private By searchBox = By.name("q");

    public GoogleHomePage(WebDriver driver) {
        this.wait = new WaitUtils(driver);
    }

    public void enterSearchText(String text) {
        wait.waitForElementVisible(searchBox).sendKeys(text);
    }

    public boolean isSearchBoxDisplayed() {
        return wait.waitForElementVisible(searchBox).isDisplayed();
    }
}
