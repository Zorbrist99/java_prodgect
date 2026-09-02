package HomeWork19.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SecureAreaPage {

    private final SelenideElement topOfPage = $("#flash"),
            logoutButton = $(".button");


    public SecureAreaPage searchTextForTopOfSecureAreaPage(String text) {
        topOfPage.shouldHave(text(text)).shouldBe(visible);
        return this;
    }

    public SecureAreaPage checkingForPresenceOfButton() {
        logoutButton.shouldHave(text("Logout")).shouldBe(visible);
        return this;
    }

    public SecureAreaPage clickLogoutButton() {
        logoutButton.$(byText("Logout")).click();
        return this;
    }
}
