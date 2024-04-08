package PageService;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait {
    WebDriverWait waitDriver;

    public Wait(WebDriver webDriver) {
        this.waitDriver = new WebDriverWait(webDriver, Duration.ofSeconds(10));
    }

    public void waitUntilElementIsVisible(WebElement webElement) {
        waitDriver.until(ExpectedConditions.visibilityOf(webElement));
    }

    public void waitUntilElementIsClickable(WebElement webElement) {
        waitDriver.until((ExpectedConditions.elementToBeClickable(webElement)));
    }
}
