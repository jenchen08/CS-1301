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
      
      /* 1. write code to call method checkResponse to display the question */
      
      System.out.println( "Enter your answer (-1 to exit):" );
      guess = input.nextInt();
      
      while ( guess != -1 )
      {
         /*2.   write code to call the method to check the user�s answer */
         
         System.out.println( "Enter your answer (-1 to exit):" );
         guess = input.nextInt();
      } // end while
   } // end method
      
      // prints a new question and stores the corresponding answer
      /*3.   write method header for the createQuestion method */
      
      {
         //3.1 get two random numbers between 0 and 9
         /* Write code to get two random numbers and store them in variables
         digit1 and digit2. */
         
         
         /*3.2  Write code to multiply the two variables and store the result
         in variable answer */
         
         System.out.printf( "How much is %d times %d?\n", digit1, digit2 );
      } // end method createQuestion
      
      //4.   checks if the user answered correctly
      
      /*5.   Write method header for checkResponse */
      
      {
         /*5.1  Write code to test whether the answer is incorrect */
         
         /*5.2  Write code to tell the user to try again, if the answer is incorrect */
         else
         {
            System.out.println( "Very Good!" );
            /*5.3  Write code to call method createQuestion to display another question */
         } // end else
      } // end method checkResponse
} // end class Multiply
