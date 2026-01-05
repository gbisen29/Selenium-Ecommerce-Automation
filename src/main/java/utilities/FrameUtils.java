package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameUtils {

    private WebDriver driver;
    private WaitUtils wait;

    public FrameUtils(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }

    public void switchToFrameByIndex(int index) {
        driver.switchTo().frame(index);
    }

    public void switchToFrameByNameOrId(String nameOrId) {
        driver.switchTo().frame(nameOrId);
    }

    public void switchToFrameByElement(By frameLocator) {
        WebElement frameElement = wait.waitForElementVisible(frameLocator);
        driver.switchTo().frame(frameElement);
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
}
