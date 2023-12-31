package ca.dal.cs.csci3130.designpatterns.chainOfResponsibility;

public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            writeMessage(message);
        } else {
            if (nextLogger != null) {
                nextLogger.logMessage(level, message);
            }
        }
    }

    public abstract void writeMessage(String message);


}
