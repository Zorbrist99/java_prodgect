package HomeWork19;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class UiTests {

    @Test
    void successfulAuthorizationTest() {
        open("https://the-internet.herokuapp.com/");
        $("#content").$(byText("Form Authentication")).click();
        $("#content").shouldHave(text("Login Page")).shouldBe(visible);
        $("#username").setValue("tomsmith");
        $("#password").setValue("SuperSecretPassword!");
        $(".radius").click();
        $("#flash").shouldHave(text("You logged into a secure area!")).shouldBe(visible);
        $(".button").shouldHave(text("Logout")).shouldBe(visible);
        $(".button").$(byText("Logout")).click();
        $("#content").shouldHave(text("Login Page")).shouldBe(visible);
    }

    @Test
    void unsuccessfulAuthorizationTest() {
        open("https://the-internet.herokuapp.com/");
        $("#content").$(byText("Form Authentication")).click();
        $("#page-footer").shouldHave(text("Elemental Selenium")).shouldBe(visible);
        $("#username").setValue("admin");
        $("#password").setValue("1234!");
        $(".radius").click();
        $("#flash").shouldHave(text("Your username is invalid!")).shouldBe(visible);
    }
}
