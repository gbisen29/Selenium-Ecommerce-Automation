package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtils {

    private WaitUtils wait;

    public DropdownUtils(WebDriver driver) {
        this.wait = new WaitUtils(driver);
    }

    // -------- STATIC DROPDOWN (<select>) --------

    public void selectByVisibleText(By locator, String text) {
        WebElement element = wait.waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValue(By locator, String value) {
        WebElement element = wait.waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectByIndex(By locator, int index) {
        WebElement element = wait.waitForElementVisible(locator);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    // -------- DYNAMIC / CUSTOM DROPDOWN --------

    public void selectFromDynamicDropdown(By optionsLocator, String expectedText) {
        List<WebElement> options = wait.waitForElementVisible(optionsLocator)
                                        .findElements(By.xpath("./*"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(expectedText)) {
                option.click();
                break;
            }
        }
    }
}
