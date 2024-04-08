package tests;

import org.testng.annotations.Test;
import page.objects.FooterPage;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.MainPage;

import static org.testng.AssertJUnit.assertTrue;

public class CorrectUsernameAndPasswordLogin extends TestBase{
    @Test
    public void checkCorrectUsernameAndPasswordLogin()  {
        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnSignInLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUsernameField("j2ee");
        loginPage.typeIntoPasswordField("j2ee");
        loginPage.clickOnLoginButton();
        FooterPage footerPage = new FooterPage(driver);
        assertTrue(footerPage.bannerLogoIsDisplayed());
    }
}
