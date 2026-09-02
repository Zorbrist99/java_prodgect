package HomeWork19.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private final SelenideElement mainArea = $("#content"),
            inputUserName = $("#username"),
            inputPassword = $("#password"),
            loginButton = $(".radius"),
            pageFooter = $("#page-footer"),
            topOfPage = $("#flash");

    @Тогда("открывается страница с текстом {string}")
    public LoginPage searchTextForMainPage(String text) {
        mainArea.shouldHave(text(text)).shouldBe(visible);
        return this;
    }

    @Тогда("открывается страница в нижней части которой присутствует текст {string}")
    public LoginPage searchTextForFooterPage(String text) {
        pageFooter.shouldHave(text(text)).shouldBe(visible);
        return this;
    }

    @Тогда("в верхней части страницы отображается сообщение об ошибке {string}")
    public LoginPage searchTextForTopOfPage(String text) {
        topOfPage.shouldHave(text(text)).shouldBe(visible);
        return this;
    }

    @Когда("пользователь вводит имя пользователя {string}")
    public LoginPage setUserName(String name) {
        inputUserName.setValue(name);
        return this;
    }

    @И("пользователь вводит пароль {string}")
    public LoginPage setPassword(String password) {
        inputPassword.setValue(password);
        return this;
    }

    @И("пользователь нажимает кнопку входа")
    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

}
