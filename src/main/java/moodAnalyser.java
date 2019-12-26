public class moodAnalyser {

    public String analyze(String message) throws MoodAnalysisException {
        try {
            if (message.contains("sad") || message.contains("Sad"))
                return "sad";
            else
                return "happy";
        }catch(NullPointerException e){
            throw new MoodAnalysisException("Please enter valid message");
        }
    }
}
