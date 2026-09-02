package HomeWork19.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement mainArea = $("#content");

    public MainPage openPage() {
        open("");
        return this;
    }

    public MainPage selectAccessibleExample(String availableExamples) {
        mainArea.$(byText(availableExamples)).click();
        return this;
    }

}
