package HomeWork13;

import java.util.LinkedList;

public class AssaultQueue {

    private LinkedList<String> queue = new LinkedList<>();

    public AssaultQueue() {
    }

    @Override
    public String toString() {
        return "AssaultQueue{" +
                "queue=" + queue +
                '}';
    }

    public void addRecruit(String name) {
        queue.add(name);
    }

    public String retreatCoward() {
        String removeValue = queue.getFirst();
        queue.remove(removeValue);
        return removeValue;
    }

    public void printQueue() {
        System.out.println(queue);
    }

}
