package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage{
    @FindBy(xpath="//*[@id=\"Cart\"]/a[contains(text(),\"Proceed to Checkout\")]")
    private WebElement proceedToCheckoutButton;
    @FindBy(xpath="//*[@class=\"messages\"]/li")
    private WebElement message;
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage clickOnProceedToCheckoutButton() {

        proceedToCheckoutButton.click();
        log().info("Clicked on proceed to checkout button");
        return new ShoppingCartPage(driver);
    }

    public String getMessage() {
        return message.getText();
    }
}
