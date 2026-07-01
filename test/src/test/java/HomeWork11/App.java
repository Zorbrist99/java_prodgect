package HomeWork11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        // Проверка метода makeCoffee
        System.out.println("Enter the amount of water: ");
        try {
            int a = scanner.nextInt();
            coffeeMachine.makeCoffee(a);

        } catch (InputMismatchException e) {
            System.out.println("Error: it was necessary to enter a number!");
        } catch (NotEnoughWaterException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Coffee machine inspection completed)");
        }

        // Проверка метода calculateCups
        try {
            coffeeMachine.calculateCups(1000, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: the size of a coffee cup cannot be 0!");
        }

        // Проверка метода printCoffeeName
        String cap = null;
        try {
            coffeeMachine.printCoffeeName(cap);
        } catch (NullPointerException e) {
            System.out.println("Error: the coffee name is missing!");
        }
    }
}
