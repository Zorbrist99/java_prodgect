package HomeWork10;

import java.text.MessageFormat;

public class Task {

    private String nameTask;
    private boolean completed;

    public Task(String nameTask, boolean completed) {
        this.nameTask = nameTask;
        this.completed = completed;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        if (completed) {
            return MessageFormat.format("[x] {0}", nameTask);
        } else {
            return MessageFormat.format("[] {0}", nameTask);
        }
    }
}
