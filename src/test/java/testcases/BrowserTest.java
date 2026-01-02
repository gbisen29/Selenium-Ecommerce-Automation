package testcases;

import org.testng.annotations.Test;
import base.BaseTest;

public class BrowserTest extends BaseTest {

    @Test
    public void verifyBrowserLaunch() {
        System.out.println("Page title is: " + driver.getTitle());
    }
}
