package DesignProblems.Logging;

import java.time.LocalTime;

public class LogMessage {
    private String message;
    private LogLevel level;
    private LocalTime timestamp;

    private LogMessage() {
        // Private constructor to prevent instantiation without parameters
    }

    public LogMessage(String message, LogLevel level, LocalTime timestamp) {
        this.message = message;
        this.level = level;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public LogLevel getLevel() {
        return level;
    }

    public LocalTime getTimestamp() {
        return timestamp;
    }
}