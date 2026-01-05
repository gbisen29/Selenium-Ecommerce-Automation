package utilities;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowUtils {

    private WebDriver driver;

    public WindowUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToNewWindow() {
        String parentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
    }

    public void switchToWindowByTitle(String expectedTitle) {
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
            driver.switchTo().window(window);
            if (driver.getTitle().contains(expectedTitle)) {
                break;
            }
        }
    }

    public void switchToParentWindow(String parentWindow) {
        driver.switchTo().window(parentWindow);
    }
}
