package HomeWork19.pages;

import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement mainArea = $("#content");

    @Дано("пользователь открывает главную страницу")
    public MainPage openPageByUrl() {
        open("https://the-internet.herokuapp.com/");
        return this;
    }

    public MainPage openPage() {
        open("");
        return this;
    }

    @И("пользователь выбирает пример {string}")
    public MainPage selectAccessibleExample(String availableExamples) {
        mainArea.$(byText(availableExamples)).click();
        return this;
    }

}
