package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.MainPage;

import static org.testng.AssertJUnit.assertEquals;

public class InvalidUsernameAndPassword extends TestBase {
    @Parameters({"login","password"})
    @Test public void invalidUsernameAndPasswordTest(@Optional("Sel")String login, @Optional("Haslo")String password) {

        driver.navigate().to("http://przyklady.javastart.pl/jpetstore/");
        LandingPage landingPage = new LandingPage(driver);
        landingPage.clickOnEnterStoreLink();
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOnSignInLink();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.typeIntoUsernameField(login);
        loginPage.typeIntoPasswordField(password);
        loginPage.clickOnLoginButton();
        assertEquals(loginPage.getMessage(),"Invalid username or password. Signon failed.");



    }


}
