package HomeWork19;

import HomeWork19.pages.LoginPage;
import HomeWork19.pages.MainPage;
import HomeWork19.pages.SecureAreaPage;
import org.junit.jupiter.api.Test;

public class UiTests extends TestBase {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    SecureAreaPage secureAreaPage = new SecureAreaPage();

    @Test
    void successfulAuthorizationTest() {
        mainPage.openPage()
                .selectAccessibleExample("Form Authentication");
        loginPage.searchTextForMainPage("Login Page")
                .setUserName("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLoginButton();
        secureAreaPage.searchTextForTopOfSecureAreaPage("You logged into a secure area!")
                .checkingForPresenceOfButton()
                .clickLogoutButton();
        loginPage.searchTextForMainPage("Login Page");
    }

    @Test
    void unsuccessfulAuthorizationTest() {
        mainPage.openPage()
                .selectAccessibleExample("Form Authentication");
        loginPage.searchTextForFooterPage("Elemental Selenium")
                .setUserName("admin")
                .setPassword("1234!")
                .clickLoginButton()
                .searchTextForTopOfPage("Your username is invalid!");
    }
}
