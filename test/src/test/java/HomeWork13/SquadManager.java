package HomeWork13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SquadManager {

    public void demonstrateListCreations() {

        List<String> mainSquad = new ArrayList<>();
        mainSquad.add("Vas");
        mainSquad.add("Petr");

        List<String> supportSquad = Arrays.asList("Lin", "Pak");
        List<String> eliteSquad = List.of("Kamaz", "Trak");

        try {
            mainSquad.add("Bus");
            System.out.println(mainSquad);
            mainSquad.remove("Bus");
            System.out.println(mainSquad);

            System.out.println("The operation was successful!");
        } catch (RuntimeException e) {
            System.out.println("Error when trying to add/remove an element");
        }

//        // Попытка добавления/удаления элемента Arrays.asList()
//        try {
//            supportSquad.add("Bus");
//            System.out.println(supportSquad);
//            supportSquad.remove("Lin");
//            System.out.println(supportSquad);
//        } catch (UnsupportedOperationException e) {
//            System.out.printf("Error when trying to add/remove an element: %s", e);
//        }

//        // Попытка добавления/удаления элемента List.of()
//        try {
//            eliteSquad.add("Bus");
//            System.out.println(supportSquad);
//            eliteSquad.remove("Kamaz");
//            System.out.println(supportSquad);
//        } catch (UnsupportedOperationException e) {
//            System.out.printf("Error when trying to add/remove an element: %s", e);
//        }
    }

    public void filterOutCowards(List<String> squad) {
        System.out.println(squad);

        //        Через итератор
//        Iterator<String> iterator = squad.iterator();
//        while (iterator.hasNext()){
//            if (iterator.next().startsWith("Трус")){
//                iterator.remove();
//            }
//        }

        // Через for
//        List<String> remove = new ArrayList<>();
//        for (String s : squad) {
//            if (s.startsWith("Трус")) {
//                remove.add(s);
//            }
//        }
//        squad.removeAll(remove);

        squad.removeIf(s -> s.startsWith("Трус"));
        System.out.println(squad);

    }
}
