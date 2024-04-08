package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FishListPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"Catalog\"]/table/tbody/tr[2]/td/a[contains(text(),\"FI-SW-01\")]")
    private WebElement angelFishButton;

    public FishListPage(WebDriver driver) {
        super(driver);
    }

    public AngelFishPage clickOnAngelFishButton() {

        angelFishButton.click();
        log().info("Clicked on Angel fish button");
        return new AngelFishPage(driver);
    }
}
