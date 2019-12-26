//import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class moodanalyzertest {
    @Test
    public void whenGivensad_ShouldReturnSad() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String message = moodAnalyser.analyze("i'm sad right now");
        Assert.assertEquals("sad",message);
    }

    @Test
    public void whenGivenHappy_ShouldReturnHappy() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String message = moodAnalyser.analyze("i'm happy right now");
        Assert.assertEquals("happy",message);
    }

    @Test
    public void whenGivenSad_ShouldReturnSad() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String message = moodAnalyser.analyze("i'm Sad right now");
        Assert.assertEquals("sad",message);
    }

    @Test
    public void whenGivenNull_ShouldReturnHappy() {
        moodAnalyser moodAnalyser = new moodAnalyser();
        String mood;
        try {
//            when extends class with exception this rules will applied
//            ExpectedException exceptionRule = ExpectedException.none();
//            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyze(null);
            Assert.assertEquals("happy",mood);
        } catch (MoodAnalysisException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals("Please enter valid message",e.getMessage());
        }
    }
}
