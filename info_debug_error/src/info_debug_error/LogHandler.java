package info_debug_error;

public abstract class LogHandler {
    protected LogHandler nextHandler;

    public void setNextHandler(LogHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleMessage(LogLevel level, String message) {
        if (canHandle(level)) {
            logMessage(message);
        } else if (nextHandler != null) {
            nextHandler.handleMessage(level, message);
        }
    }

    protected abstract boolean canHandle(LogLevel level);

    protected abstract void logMessage(String message);
}
