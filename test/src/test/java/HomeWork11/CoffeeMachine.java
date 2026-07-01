package HomeWork11;

public class CoffeeMachine {

    public void makeCoffee(int ml) {
        if (ml > 200) {
            System.out.println("Coffee - done!");
        } else {
            throw new NotEnoughWaterException("Not enough water to make coffee");
        }
    }

    public int calculateCups(int ml, int obCup) {
        return ml / obCup;
    }

    public void printCoffeeName(String nameCoffee) {
        if (nameCoffee.isEmpty()) {
            throw new NullPointerException();
        } else {
            System.out.println(nameCoffee.toUpperCase());
        }
    }
}
