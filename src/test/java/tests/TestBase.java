package tests;

import listeners.DriverEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    public WebDriver driver;

    @BeforeClass
    public void beforeTest() {
        driver = new ChromeDriver();

        DriverEventListener driverEventListener = new DriverEventListener();
        EventFiringDecorator eventFiringDecorator = new EventFiringDecorator(driverEventListener);
        driver = eventFiringDecorator.decorate(driver);

    }

    @AfterClass
    public void afterTest() {
        driver.close();
        driver.quit();
    }
}
