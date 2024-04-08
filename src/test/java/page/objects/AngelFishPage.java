package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AngelFishPage extends BasePage {
    @FindBy(xpath="//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a[contains(text(),\"Add to Cart\")]")
    private WebElement smallAngelFishAddToCartButton;
    public AngelFishPage(WebDriver driver) {
        super(driver);
    }

    public ShoppingCartPage clickOnSmallAngelFishAddToCartButton() {

        smallAngelFishAddToCartButton.click();
        log().info("Clicked on add to cart button");
        return new ShoppingCartPage(driver);
    }
}
