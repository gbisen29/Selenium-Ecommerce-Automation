package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {

    private Actions actions;
    private WaitUtils wait;

    public ActionUtils(WebDriver driver) {
        this.actions = new Actions(driver);
        this.wait = new WaitUtils(driver);
    }

    public void hoverOnElement(By locator) {
        WebElement element = wait.waitForElementVisible(locator);
        actions.moveToElement(element).perform();
    }

    public void rightClick(By locator) {
        WebElement element = wait.waitForElementVisible(locator);
        actions.contextClick(element).perform();
    }

    public void doubleClick(By locator) {
        WebElement element = wait.waitForElementClickable(locator);
        actions.doubleClick(element).perform();
    }

    public void sendKeys(By locator, String text) {
        WebElement element = wait.waitForElementVisible(locator);
        actions.sendKeys(element, text).perform();
    }
}
