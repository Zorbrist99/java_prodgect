import java.util.Random;

public class HomeWork2 {

    static void main(String[] args) {
        Random random = new Random();

        //Профайл гостя
        int userAge = random.nextInt(10, 69);
        double balance = random.nextDouble(0, 10000000);
        boolean invitation = false;
        boolean blacklist = false;

        //По-умолчанию доступ на мероприятие запрещен
        boolean accessEvent = false;

        //Основной алгоритм
        if (userAge >= 18) {
            if (!blacklist) {
                if (invitation | balance > 50000) {
                    accessEvent = true;
                    System.out.println("Доступ разрешен: " + accessEvent);

                    //Расчет добровольного взноса
                    double contribution = balance * 0.075;
                    System.out.println("Добровольный взнос участника составил: " + contribution);
                }
            } else
                System.out.println("Доступ запрещен");
        }
    }
}