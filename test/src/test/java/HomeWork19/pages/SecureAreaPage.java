package HomeWork19.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SecureAreaPage {

    private final SelenideElement topOfPage = $("#flash"),
            logoutButton = $(".button");

    @Тогда("открывается защищенная зона с текстом {string}")
    public SecureAreaPage searchTextForTopOfSecureAreaPage(String text) {
        topOfPage.shouldHave(text(text)).shouldBe(visible);
        return this;
    }

    @И("на странице присутствует кнопка выхода")
    public SecureAreaPage checkingForPresenceOfButton() {
        logoutButton.shouldHave(text("Logout")).shouldBe(visible);
        return this;
    }

    @Когда("пользователь нажимает кнопку выхода")
    public SecureAreaPage clickLogoutButton() {
        logoutButton.$(byText("Logout")).click();
        return this;
    }
}
