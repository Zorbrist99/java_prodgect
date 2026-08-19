package HomeWork16;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.text.MessageFormat;

public class Hooks {

    @Before
    public void printScenarioName(Scenario scenario) {
        System.out.println(MessageFormat.format("Название сценария: {0}", scenario.getName()));
    }

    @After
    public void printStatusCompleted(Scenario scenario) {
        System.out.println(MessageFormat.format("Статус прохождения сценария: {0}", scenario.getStatus()));
    }
}
