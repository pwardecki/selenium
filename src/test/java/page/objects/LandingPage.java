package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage{

    @FindBy(xpath="//a")
    private WebElement enterStoreLink;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnEnterStoreLink() {
        wait.waitUntilElementIsClickable(enterStoreLink);
        enterStoreLink.click();
        log().info("Clicked on enter store link");
    }
}
