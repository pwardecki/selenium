package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name="username")
    private WebElement usernameField;
    @FindBy(name="password")
    private WebElement passwordField;

    @FindBy(name="signon")
    private WebElement loginButton;

    @FindBy(xpath="//div[@id=\"Content\"]/ul/li[contains(text(),\"Invalid username\")]")
    private WebElement warningMessage;

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public void typeIntoUsernameField(String username) {
        usernameField.clear();
        usernameField.sendKeys(username);
        log().info("Typed into username field: {}", username);
    }

    public void typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        log().info("Typed into password field: {}", password);
    }

    public FooterPage clickOnLoginButton() {

        loginButton.click();
        log().info("Clicked on login button");
        return new FooterPage(driver);
    }

    public String getMessage() {
        String message = warningMessage.getText();
        return message;
    }
}
