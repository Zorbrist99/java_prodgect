package HomeWork19.pages;

import com.codeborne.selenide.SelenideElement;

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

    public LoginPage searchTextForMainPage(String text) {
        mainArea.shouldHave(text(text)).shouldBe(visible);
        return this;
    }

    public LoginPage searchTextForFooterPage(String text) {
        pageFooter.shouldHave(text(text)).shouldBe(visible);
        return this;
    }

    public LoginPage searchTextForTopOfPage(String text) {
        topOfPage.shouldHave(text(text)).shouldBe(visible);
        return this;
    }

    public LoginPage setUserName(String name) {
        inputUserName.setValue(name);
        return this;
    }

    public LoginPage setPassword(String password) {
        inputPassword.setValue(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

}
