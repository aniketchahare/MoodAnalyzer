public class moodAnalyser {

    private String message;

    public moodAnalyser(String message) {
        this.message = message;
    }

    public moodAnalyser(){

    }

    public String analyze(String message) throws MoodAnalysisException {
        try {
            if(message.length() == 0) {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please enter valid message");
            }
            if (message.contains("sad") || message.contains("Sad")) {
                return "sad";
            }  else {
                return "happy";
            }
        }catch(NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,"Please enter valid message");
        }
    }
}
