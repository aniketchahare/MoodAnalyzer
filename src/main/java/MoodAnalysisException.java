public class MoodAnalysisException extends RuntimeException {
    public enum ExceptionType
    {
        ENTERED_NULL,ENTERED_EMPTY
    }
    ExceptionType type;

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type=type;
    }
}
