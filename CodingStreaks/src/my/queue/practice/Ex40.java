package my.queue.practice;

import java.util.LinkedList;
import java.util.Queue;

public class Ex40 {

    class Task {
        int id;
        String name;

        Task(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    private Queue<Task> queue;

    public Ex40() {
        queue = new LinkedList<>();
    }

    // Add task to scheduler
    public void addTask(int id, String name) {

        Task task = new Task(id, name);
        queue.offer(task);

        System.out.println("Task added: " + name);
    }

    // Execute task
    public void executeTask() {

        if (queue.isEmpty()) {
            System.out.println("No tasks available");
            return;
        }

        Task task = queue.poll();

        System.out.println("Executing Task ID: " 
                + task.id + ", Name: " + task.name);
    }

    // View next task
    public void peekTask() {

        if (queue.isEmpty()) {
            System.out.println("No tasks available");
            return;
        }

        Task task = queue.peek();

        System.out.println("Next Task: " + task.name);
    }

    // Display pending tasks
    public void displayTasks() {

        if (queue.isEmpty()) {
            System.out.println("Scheduler is empty");
            return;
        }

        System.out.println("Pending Tasks:");

        for (Task task : queue) {
            System.out.println(task.id + " - " + task.name);
        }
    }


    public static void main(String[] args) {

        Ex40 scheduler = new Ex40();

        scheduler.addTask(1, "Download File");
        scheduler.addTask(2, "Send Email");
        scheduler.addTask(3, "Generate Report");

        System.out.println();

        scheduler.displayTasks();

        System.out.println();

        scheduler.peekTask();

        System.out.println();

        scheduler.executeTask();
        scheduler.executeTask();

        System.out.println();

        scheduler.displayTasks();

        scheduler.addTask(4, "Backup Data");

        System.out.println();

        scheduler.displayTasks();
    }
}