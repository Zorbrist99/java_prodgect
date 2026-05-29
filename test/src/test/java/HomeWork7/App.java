package HomeWork7;

public class App {
    static void main(String[] args) {
        Hero[] heroes = {
                new Knight("Петя", 3, 90, 77)
                , new Archer("Гриша", 32, 89, 3)
                , new Mage("Федор", 90, 99, "Летает")
        };

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].printInfo();
            System.out.println(" ");
            heroes[i].attack();
            System.out.println("----");
        }

        final Knight knight = new Knight("Вадим", 33, 33, 40);
        System.out.println(knight);
        knight.setArmor(44);
        System.out.println(knight);
    }
}
