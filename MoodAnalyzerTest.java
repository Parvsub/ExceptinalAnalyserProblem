package exceptionalAssignment;


import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyzerTest {
    @Test
    public void givenMessgae_WhenSad_ShouldReturn_Sad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a Sad Message");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("SAD",mood);

    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is Happy Messgae");
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String mood = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
        class MoodAnalyzer {
        private String message;
        public MoodAnalyzer(String message) {
            this.message = message;
        }

        public String analyseMood() {
            try {
                if (message.contains("Sad"))
                    return "SAD";
                else
                    return "HAPPY";
            }catch (NullPointerException e){
                return "HAPPY";
            }
        }
    }
}

