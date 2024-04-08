package page.objects;

import PageService.Wait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    WebDriver driver;
    Wait wait;

    private Logger logger = LogManager.getLogger(this.getClass().getName());
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        wait = new Wait(this.driver);
    }

    protected Logger log() {
        return logger;
    }
}
