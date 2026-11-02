package DesignProblems.TaskScheduler;

import java.time.Instant;

public class main {

    public static void main(String[] args) {

        Task task1 = new Task(1, "Task 1", () -> System.out.println("Executing Task 1"), Instant.now().plusSeconds(5));

        Task task2 = new Task(2, "Task 2", () -> System.out.println("Executing Task 2"), Instant.now().plusSeconds(3));

        TaskSchedulerManager taskSchedulerManager = new TaskSchedulerManager();

        Thread t1 = new Thread(() -> taskSchedulerManager.addTask(task1));
        Thread t2 = new Thread(() -> taskSchedulerManager.addTask(task2));

        t1.start();
        t2.start();

        Thread schedulerThread =
                new Thread(taskSchedulerManager::scheduleTasks);

        schedulerThread.start();
    }
}
