package NullObjectPattern;

public class Client {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(false); // NullLogger
        logger.log("This will not be logged"); // Does nothing

        logger = LoggerFactory.getLogger(true); // ConsoleLogger
        logger.log("This will be logged"); // Logs to the console
    }
}
