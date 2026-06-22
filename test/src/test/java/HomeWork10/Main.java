package HomeWork10;

public class Main {
    static void main(String[] args) {
        //Создание объектов класса Task и TaskTracker
        Task task = new Task("Grand", false);
        Task task1 = new Task("Grand1", false);
        Task task2 = new Task("Grand2", true);
        TaskTracker taskTracker = new TaskTracker();

        //Получение название и статуса первой задачи
        System.out.println(task.getNameTask());
        System.out.println(task.isCompleted());

        //Изменение названия и статуса первой задачи
        task.setNameTask("Hprot");
        task.setCompleted(true);

        //Получение названия и статуса обновленной первой задачи
        System.out.println(task.getNameTask());
        System.out.println(task.isCompleted());

        //Получение информации о первой задаче
        System.out.println(task);

        //Наполнение трекера задачами
        taskTracker.setListTasks(task);
        taskTracker.setListTasks(task1);

        //Получение списка задач из трекера
        System.out.println(taskTracker.getListTasks());

        //Получение задачи по названию
        taskTracker.getTaskByName("Grand");
        //Изменения статуса задачи по ее названию в трекере
        taskTracker.completeTask("Hprot");
        System.out.println(" ");
        //Получение статистики трекера
        taskTracker.statisticsTasks();

        //Добавление в трекер еще одной задачи
        taskTracker.setListTasks(task2);
        System.out.println(" ");
        //Получение статистики трекера после изменения
        taskTracker.statisticsTasks();
    }
}
