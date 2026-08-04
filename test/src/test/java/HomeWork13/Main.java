package HomeWork13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main(String[] args) {

        System.out.println("Часть 1");
        List<Alien> aliens = new ArrayList<>();

        aliens.add(new Alien("Petr", "Doom", 5));
        aliens.add(new Alien("Vasa", "Doomik", 3));
        aliens.add(new Alien("Kost", "Fork", 1));
        aliens.add(new Alien("Mark", "Garag", 9));
        aliens.add(new Alien("Mark", "Garag", 10));

        Set<Alien> alienSet = new HashSet<>(aliens);
        Set<Alien> duplicatAlienSet = new HashSet<>();

        if (alienSet.size() != aliens.size()) {
            System.out.println("Список инопланетян содержит дубликаты!");
            for (Alien s : aliens) {
                if (!duplicatAlienSet.add(s)) {
                    System.out.printf("Дубликат: %s", s);
                }
            }
        } else {
            System.out.println("Дубликаты отсутствуют!");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Часть 2");
        SquadManager squadManager = new SquadManager();

        squadManager.demonstrateListCreations();


        System.out.println(" ");
        System.out.println("Часть 3");
        List<String> primer = new ArrayList<>();

        primer.add("Трус_Го");
        primer.add("Го");
        primer.add("Трус ghbvth");

        squadManager.filterOutCowards(primer);

        System.out.println(" ");
        System.out.println("Часть 4");
        AssaultQueue assaultQueue = new AssaultQueue();
        assaultQueue.printQueue();

        assaultQueue.addRecruit("Grok");
        assaultQueue.addRecruit("Tort");
        assaultQueue.addRecruit("Mrak");
        assaultQueue.addRecruit("Luk");
        assaultQueue.addRecruit("Cod");
        assaultQueue.printQueue();

        System.out.println(assaultQueue.retreatCoward());
        System.out.println(assaultQueue.retreatCoward());
        assaultQueue.printQueue();

        assaultQueue.addRecruit("Blad");
        assaultQueue.addRecruit("Crik");
        assaultQueue.addRecruit("Asc");
        assaultQueue.printQueue();

        System.out.println(" ");
        System.out.println("Часть 5");
        MissionReport missionReport = new MissionReport("Штурм Зоны 51", aliens, 50);

        System.out.println(missionReport);

        MissionReport missionReport1 = new MissionReport("Штурм Зоны 51", aliens, 50);
        System.out.println(missionReport1 == missionReport);
        System.out.println(missionReport1.equals(missionReport));



    }


}
