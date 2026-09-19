package DesignProblems.Logging;

import java.util.List;

public class DefaultLogger implements Logger {

    private final LogLevel minimumLogLevel; // can be configured to log from application.properties file in future
    private final List<Appender> appender;

    public DefaultLogger(LogLevel logLevel, List<Appender> appender) {
        this.minimumLogLevel = logLevel;
        this.appender = appender;
    }

    @Override
    public void log(String message, LogLevel level) {
        if (level.getPriority() >= minimumLogLevel.getPriority()) {
            for (Appender appender : this.appender) {
                appender.append(new LogMessage(message, level, java.time.LocalTime.now()));
            }
        }
    }

    @Override
    public void trace(String message) {
        log(message, LogLevel.TRACE);
    }

    @Override
    public void debug(String message) {
        log(message, LogLevel.DEBUG);
    }

    @Override
    public void info(String message) {
        log(message, LogLevel.INFO);
    }

    @Override
    public void warn(String message) {
        log(message, LogLevel.WARN);
    }

    @Override
    public void error(String message) {
        log(message, LogLevel.ERROR);
    }

    @Override
    public void fatal(String message) {
        log(message, LogLevel.FATAL);
    }

}
