package info_debug_error;

public class Client {
    public static void main(String[] args) {
        // Create handlers
        LogHandler infoHandler = new InfoHandler();
        LogHandler debugHandler = new DebugHandler();
        LogHandler errorHandler = new ErrorHandler();

        // Set up chain of responsibility
        infoHandler.setNextHandler(debugHandler);
        debugHandler.setNextHandler(errorHandler);

        // Create commands
        Command infoCommand = new LogCommand(infoHandler, LogLevel.INFO);
        Command debugCommand = new LogCommand(infoHandler, LogLevel.DEBUG); // Start from the first handler in the chain
        Command errorCommand = new LogCommand(infoHandler, LogLevel.ERROR); // Start from the first handler in the chain

        // Create logger
        Logger logger = new Logger();
        logger.addCommand(infoCommand);
        logger.addCommand(debugCommand);
        logger.addCommand(errorCommand);

        // Process commands
        logger.processCommands();
    }
}
