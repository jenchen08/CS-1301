// Lab: Multiply.java
// Program generates single digit multiplication problems
import java.util.*;

public class Multiply
{
   Random randomNumbers = new Random();
   
   int answer; // the correct answer
   
   // ask the user to answer multiplication problems
   public void quiz()
   {
      Scanner input = new Scanner( System.in );
      
      int guess; // the user's guess
      
      /* 1. write code to call method createQuestion to display the question */
      createQuestion();
      
      System.out.println( "Enter your answer (-1 to exit):" );
      guess = input.nextInt();
      
      while ( guess != -1 )
      {
         /*2.   write code to call the method to check the user’s answer */
         checkResponse(guess);
         System.out.println( "Enter your answer (-1 to exit):" );
         guess = input.nextInt();
      } // end while
   } // end method
      
      // prints a new question and stores the corresponding answer
      /*3.   write method header for the createQuestion method */
      public void createQuestion()
      {
         //3.1 get two random numbers between 0 and 9
         /* Write code to get two random numbers and store them in variables
         digit1 and digit2. */
         int digit1 = randomNumbers.nextInt(10);
         int digit2 = randomNumbers.nextInt(10);

         
         /*3.2  Write code to multiply the two variables and store the result
         in variable answer */
         answer = digit1 * digit2;
         System.out.printf( "How much is %d times %d?\n", digit1, digit2 );
      } // end method createQuestion
      
      //4.   checks if the user answered correctly
      
      /*5.   Write method header for checkResponse */
      public String createResponse(boolean correct) 
      {
         String respond;
         int rdm = randomNumbers.nextInt(4);
         /*5.1  Write code to test whether the answer is incorrect */
         if (correct){
         switch (rdm) {
            case 0: respond = "Keep up the good work!";
                    break;    
            case 1: respond = "Awesome!";
                    break;
            case 2: respond = "Good Job!"; 
                    break;            
            case 3: respond = "Excellent!";     
                    break;
            return respond;
         /*5.2  Write code to tell the user to try again, if the answer is incorrect */
         
            default:respond = "No. Please try again.";
                    break;
        }
        }
 
      } // end method checkResponse
      
      public void checkResponse (int guess)
      {
         if (guess != answer)
            System.out.println (createResponse(false));
         else {
            System.out.println (createResponse(true));
            createQuestion();
         }//end else
      }
            
} // end class Multiply
