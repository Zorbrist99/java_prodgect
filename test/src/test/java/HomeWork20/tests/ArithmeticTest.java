package HomeWork20.tests;

import HomeWork20.steps.CalculatorSteps;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

@Epic("Калькулятор")
@Feature("Арифметические операции")
public class ArithmeticTest {

    CalculatorSteps calculatorSteps = new CalculatorSteps();

    @Test
    @Story("Сложение")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Сергей")
    @Description("Сложение двух натуральных положительных чисел")
    void additionTwoNumberFormsTest() {
        double result = calculatorSteps.add(3, 2);
        calculatorSteps.verifyResult(result, 5);
    }

    @Test
    @Story("Сложение")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Сергей")
    @Description("Сложение двух натуральных чисел, положительное и отрицательного")
    void addingNegativeNumberTest() {
        double result = calculatorSteps.add(-5, 3);
        calculatorSteps.verifyResult(result, -2);
    }

    @Test
    @Story("Вычитание")
    @Severity(SeverityLevel.NORMAL)
    @Owner("Сергей")
    @Description("Вычитание двух натуральных положительных чисел")
    void subtractionTest() {
        double result = calculatorSteps.subtract(10, 4);
        calculatorSteps.verifyResult(result, 6);
    }

    @Test
    @Story("Умножение")
    @Severity(SeverityLevel.NORMAL)
    @Description("Умножение двух натуральных положительных чисел")
    void multiplicationTest() {
        double result = calculatorSteps.multiply(7, 8);
        calculatorSteps.verifyResult(result, 56);
    }

    @Test
    @Story("Деление")
    @Severity(SeverityLevel.NORMAL)
    void divisionTest() {
        double result = calculatorSteps.divide(15, 3);
        calculatorSteps.verifyResult(result, 5);
    }

    @Test
    @Story("Деление")
    @Severity(SeverityLevel.CRITICAL)
    void divisionByZeroTest() {
        try {
            calculatorSteps.divide(15, 0);

            fail("Метод должен был выбросить исключение ArithmeticException, но операция успешно выполнилась");
        } catch (ArithmeticException _) {
        }
    }
}
