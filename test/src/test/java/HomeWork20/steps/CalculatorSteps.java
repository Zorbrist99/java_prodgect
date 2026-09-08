package HomeWork20.steps;

import HomeWork20.Calculator;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

import java.text.MessageFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSteps {

    private final Calculator calculator = new Calculator();

    private void attachCalculator(double a, String separator, double b, double result) {
        Allure.addAttachment("Результат операции: ", "text/plain",
                String.format("%f %s %f = %f", a, separator, b, result));
    }

    public void verifyResult(double result, double expected_result) {
        assertEquals(expected_result, result,
                String.format("Ожидалось, что метод вернет значение %f", expected_result));
    }

    @Step("Сложить {a} + {b}")
    public double add(double a, double b) {
        double result = calculator.add(a, b);
        attachCalculator(a, "+", b, result);
        return result;
    }

    @Step("Вычесть {a} - {b}")
    public double subtract(double a, double b) {
        double result = calculator.subtract(a, b);
        attachCalculator(a, "-", b, result);
        return result;
    }

    @Step("Умножить {a} * {b}")
    public double multiply(double a, double b) {
        double result = calculator.multiply(a, b);
        attachCalculator(a, "*", b, result);
        return result;
    }

    @Step("Разделить {a} / {b}")
    public double divide(double a, double b) {
        double result = calculator.divide(a, b);
        attachCalculator(a, "/", b, result);
        return result;
    }

    @Step("Число {a} возвести в степень {b}")
    public double power(double a, double b) {
        double result = calculator.power(a, b);
        attachCalculator(a, "^", b, result);
        return result;
    }

    @Step("Квадратный корень из {a}")
    public double sqrt(double a) {
        double result = calculator.sqrt(a);
        attachCalculator(a, "^", 2, result);
        return result;
    }
}
