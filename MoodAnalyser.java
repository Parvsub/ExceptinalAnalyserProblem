package exceptionalAssignment;


import org.junit.Assert;
import org.junit.Test;

 class MoodAnalyzerTest {
     @Test
     public void givenMessgae_WhenSad_ShouldReturn_Sad() {
         MoodAnalyser moodAnalyzer = new MoodAnalyser("This is a Sad Message");
         String mood = moodAnalyzer.analyseMood();
         Assert.assertEquals("SAD", mood);

     }

     @Test
     public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
         MoodAnalyser moodAnalyzer = new MoodAnalyser(" Happy ");
         String mood = moodAnalyzer.analyseMood();
         Assert.assertEquals("HAPPY", mood);
     }


     public static class MoodAnalyser {

         private String message;

         public MoodAnalyser(String message) {
             this.message = message;
         }

         public String analyseMood() {
             if (message.contains("Sad"))
                 return "SAD";
             else
                 return "HAPPY";
         }
     }

     public static void main(String[] args) {
     MoodAnalyser moodAnalyser = new MoodAnalyser("SAD");
     moodAnalyser.analyseMood();
     }
 }
