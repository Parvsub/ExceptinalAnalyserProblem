package exceptionalAssignment;

public class MoodAnalyserException extends Exception {
    public exceptionType type;

    public MoodAnalyserException(String message) {
        super(message);
        this.type = type;
    }

    public MoodAnalyserException(exceptionType type, Throwable cause) {
        super(cause);
        this.type = type;
    }

    public MoodAnalyserException(exceptionType type, String message, Throwable cause) {
        super(message, cause);
        this.type = type;
    }

    public enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL, NO_SUCH_CLASS, NO_SUCH_METHOD, METHOD_INVOCATION_ISSUE
    }
}
