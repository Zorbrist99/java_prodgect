package HomeWork20.tests;

import HomeWork20.steps.CalculatorSteps;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

@Epic("Калькулятор")
@Feature("Математические функции")
public class MathFunctionsTest {
    CalculatorSteps calculatorSteps = new CalculatorSteps();

    @Test
    @Story("Возведение в степень")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Сергей")
    @Description("Возведение в степень")
    void exponentiationTest() {
        double result = calculatorSteps.power(3, 2);
        Allure.parameter("Результат возведения в степень", result);
        calculatorSteps.verifyResult(result, 10);
    }


    @Test
    @Story("Квадратный корень")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Сергей")
    @Link("https://mvnrepository.com/")
    @Description("Квадратный корень из отрицательного числа")
    void squareRootOfNegativeNumber() {
        try {
            calculatorSteps.sqrt(2);

            fail("Метод должен был выбросить исключение ArithmeticException, но операция успешно выполнилась");
        } catch (ArithmeticException _) {

        }
    }

    @Test
    @Story("Квадратный корень")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Сергей")
    @Description("Квадратный корень из положительного числа")
    void squareRootOfPositiveNumber() {

        double result = calculatorSteps.sqrt(9);
        calculatorSteps.verifyResult(result, 3);
    }

}
