package DesignProblems.Logging;

public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(3),
    WARN(4),
    ERROR(5),
    FATAL(6);


    private int priority;
    LogLevel(int priority) {
        this.priority = priority;
    }
    int getPriority() {
        return this.priority;
    }
}
