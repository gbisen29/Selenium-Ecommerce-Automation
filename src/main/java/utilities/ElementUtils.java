package utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {

    private WaitUtils wait;

    public ElementUtils(WebDriver driver) {
        this.wait = new WaitUtils(driver);
    }

    public WebElement getElementByText(By locator, String expectedText) {
        List<WebElement> elements = wait.waitForElementVisible(locator)
                                         .findElements(By.xpath("./*"));

        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(expectedText)) {
                return element;
            }
        }
        return null;
    }
}
