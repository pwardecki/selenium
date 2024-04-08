package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.AssertJUnit.assertEquals;

public class MustSignOnBeforeCheckout extends TestBase {
    @Test
    public void mustSignOnBeforeCheckoutTest() {
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();

        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnFishButton();

        FishListPage fishListPage = new FishListPage(driver);
        fishListPage.clickOnAngelFishButton();

        AngelFishPage angelFishPage = new AngelFishPage(driver);
        angelFishPage.clickOnSmallAngelFishAddToCartButton();

        ShoppingCartPage shoppingCartPage = new ShoppingCartPage(driver);
        shoppingCartPage.clickOnProceedToCheckoutButton();
        assertEquals(shoppingCartPage.getMessage(),"You must sign on before attempting to check out. Please sign on and try checking out again.");
    }
}
