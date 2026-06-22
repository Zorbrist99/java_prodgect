package HomeWork10;

import java.util.ArrayList;

public class TaskTracker {
    private ArrayList<Task> listTasks;

    public TaskTracker() {
        this.listTasks = new ArrayList<>();
    }

    public ArrayList<Task> getListTasks() {
        return listTasks;
    }

    public void setListTasks(Task listTasks) {
        this.listTasks.add(listTasks);
    }

    public void getTaskByName(String nameTask) {

    }
}
