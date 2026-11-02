package DesignProblems.TaskScheduler;

import java.time.Instant;

public class Task implements Comparable<Task> {
    int id;
    String name;

    Runnable action;

    Instant scheduleTime;

    public Task(int id, String name, Runnable action, Instant scheduleTime) {
        this.id = id;
        this.name = name;
        this.action = action;
        this.scheduleTime = scheduleTime;
    }

    @Override
    public int compareTo(Task o) {
        return this.scheduleTime.compareTo(o.scheduleTime);
    }
}
