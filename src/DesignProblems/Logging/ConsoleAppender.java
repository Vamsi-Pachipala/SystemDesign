package DesignProblems.Logging;

public class ConsoleAppender implements Appender {

    @Override
    public void append(LogMessage logMessage) {
        // do the business logic here
        System.out.println(logMessage.getMessage() + " " + logMessage.getLevel() + " " + logMessage.getTimestamp());
    }
}
