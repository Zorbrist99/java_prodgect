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
        boolean isTask = false;

        for (Task listTask : this.listTasks) {
            if (listTask.getNameTask().equals(nameTask)) {
                isTask = true;
                System.out.println(listTask);
                break;
            }
        }

        if (!isTask) {
            System.out.println("Задача не найдена");
        }
    }

    public void completeTask(String nameTask) {
        for (Task listTask : this.listTasks) {
            if (listTask.getNameTask().equals(nameTask)) {
                listTask.setCompleted(true);
                System.out.printf("Задачи: %s выполнена!", nameTask);
            }
        }
    }

    public void statisticsTasks() {
        int complete = 0;
        for (Task listTask : this.listTasks) {
            if (listTask.isCompleted()) {
                complete += 1;
            }
        }

        System.out.printf("Всего задач: %d \n" +
                "Выполнено: %d \n" +
                "Открыто: %d", this.listTasks.size(), complete, (this.listTasks.size() - complete));
    }
}