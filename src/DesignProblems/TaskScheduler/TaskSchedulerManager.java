package DesignProblems.TaskScheduler;

import java.util.concurrent.PriorityBlockingQueue;

public class TaskSchedulerManager {

    PriorityBlockingQueue<Task> priorityQueue;


    TaskSchedulerManager() {
        priorityQueue = new PriorityBlockingQueue<>();
    }

    void addTask(Task task) {
        priorityQueue.add(task);
    }

    void scheduleTasks() {
        while(!priorityQueue.isEmpty()) {
            scheduleTask();
        }
    }
    synchronized void scheduleTask() {
        Task task = null;
        try {
            task = priorityQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assert task != null;
        long delay = task.scheduleTime.toEpochMilli() - System.currentTimeMillis();

        if(delay > 0) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        task.action.run();
    }
}

