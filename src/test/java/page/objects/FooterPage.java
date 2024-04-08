package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FooterPage extends BasePage {

    @FindBy(css="#Banner img[src*=\"dog\"]")
    private WebElement dogBanner;
    public FooterPage(WebDriver driver) {super(driver);
    }

    public boolean bannerLogoIsDisplayed() {
        wait.waitUntilElementIsVisible(dogBanner);
        boolean isDisplayed = dogBanner.isDisplayed();
        log().info("Returning status of banner: {}",isDisplayed);
        return isDisplayed;
    }


}
