package exceptionalAssignment;

public class MoodAnalyserExceptional extends Exception {
    public exceptionType type;

    public MoodAnalyserExceptional(exceptionType type, String message){
        super(message);
        this.type = type;
    }

    public MoodAnalyserExceptional(exceptionType type, Throwable cause) {
        super(cause);
        this.type = type;
    }

    public MoodAnalyserExceptional(exceptionType type,String message, Throwable cause){
        super(message);
        new MoodAnalyserExceptional(type,cause);
    }

    public enum exceptionType {
        ENTERED_EMPTY, ENTERED_NULL, NO_SUCH_CLASS, NO_SUCH_METHOD, METHOD_INVOCATION_ISSUE,
        NO_SUCH_FIELD, ILLEGAL_ACCESS
    }
}

