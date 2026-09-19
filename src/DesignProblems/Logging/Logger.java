package DesignProblems.Logging;

public interface Logger {
    void log(String message, LogLevel level);
    public void trace(String message);

    public void debug(String message);

    public void info(String message);

    public void warn(String message);

    public void error(String message);

    public void fatal(String message);
}
