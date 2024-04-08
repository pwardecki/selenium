package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{

    @FindBy(xpath="//*[@id=\"MainImageContent\"]/map/area[@alt=\"Fish\"]")
    private WebElement fishButton;
    @FindBy(xpath="//*[@id=\"MenuContent\"]/a[contains(text(),\"Sign In\")]")
    private WebElement signInLink;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public FishListPage clickOnFishButton() {
        wait.waitUntilElementIsClickable(fishButton);
        fishButton.click();
        log().info("Clicked on fish button");
        return new FishListPage(driver);
    }

    public LoginPage clickOnSignInLink() {
        wait.waitUntilElementIsClickable(signInLink);
        signInLink.click();
        log().info("Clicked on signIn link");
        return new LoginPage(driver);
    }
}
