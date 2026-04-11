
public class HomeWork1 {

    static void main(String[] args) {
        String nameEmployee = "Сергей";
        String position = "Боженька Шаурмы";
        int priceOneShift = 500;
        int numberOfShifts = 10;
        int bonus = 100;
        int penaltyBurntPitaBread = 10;
        int priceOneShawarma = 200;
        int numberShawarmaSold = 25;

        System.out.println("Сотрудник: " + nameEmployee);
        System.out.println("Должность: " + position);
        System.out.println("Оплата за смены: " + priceOneShift * numberOfShifts);
        System.out.println("Премия: " + bonus);
        System.out.println("Штраф: " + penaltyBurntPitaBread);
        System.out.println("Итоговая зарплата: " + ((priceOneShift * numberOfShifts) + bonus - penaltyBurntPitaBread));
        System.out.println("Шаур-выручка: " + priceOneShawarma * numberShawarmaSold);
    }
}

