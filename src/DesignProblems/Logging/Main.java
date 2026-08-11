package DesignProblems.Logging;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // this make sense but user don't want to create a logger like this
        // we can define minimum log level for this class can be in application.properties
        // we can use factory design pattern to decouple the creation logic
        // we can do like logs.file = false , logs.console = true
        // DefaultLogger can be singleton for whole application or if you need different for different package
        // still can achieve
        DefaultLogger defalutLogger = new DefaultLogger(
                LogLevel.DEBUG,
                List.of(new ConsoleAppender())
        );

        defalutLogger.debug("user created");
    }
}


// here is the sample code

/*

public class LoggerFactory {

    private static DefaultLogger defaultLogger;

    public static Logger getLogger() {
        if (defaultLogger == null) {
            // Load configuration (e.g., from application.properties)
            Properties properties = new Properties();
            try {
                properties.load(LoggerFactory.class.getClassLoader().getResourceAsStream("application.properties"));
            } catch (Exception e) {
                throw new RuntimeException("Failed to load logger configuration", e);
            }

            // Read log level and appenders from properties
            LogLevel logLevel = LogLevel.valueOf(properties.getProperty("logs.level", "DEBUG").toUpperCase());
            boolean logToConsole = Boolean.parseBoolean(properties.getProperty("logs.console", "true"));
            boolean logToFile = Boolean.parseBoolean(properties.getProperty("logs.file", "false"));

            List<Appender> appenders = new ArrayList<>();
            if (logToConsole) {
                appenders.add(new ConsoleAppender());
            }
            if (logToFile) {
                appenders.add(new FileAppender(properties.getProperty("logs.file.path", "application.log")));
            }

            // Create the DefaultLogger instance
            defaultLogger = new DefaultLogger(logLevel, appenders);
        }
        return defaultLogger;
    }
}
*/
