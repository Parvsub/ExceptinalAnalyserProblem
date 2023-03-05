package exceptionalAssignment;

public class MoodAnalyserException extends Exception{
    public exceptionType type;
    public MoodAnalyserException(String message){
        super(message);
        this.type = type;
    }
    public enum exceptionType{
        ENTERED_EMPTY, ENTERED_NULL
    }
}
