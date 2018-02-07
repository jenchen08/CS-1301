import java.util.Scanner;
public class Loop_Questions_2_15_2017
{
   //default constructor
   public Loop_Questions_2_15_2017(){
   
   }
   
   public void q1 ()
   {

      //1.  Write a while loop to display all integer values from 1 to 5, inclusive.
      //    a. on a single line
      System.out.println ("\n\tq1 method implemented");
      int i = 1;
      while (i <= 5){
         System.out.print(i + "\t");
         i++;
      } // end of while   
   
   }//end of q1
   
   public void q2()
   {
      //2.  Write a while loop to display all integer values from 5 to 1, inclusive.
      System.out.println ("\n\tq2 method implemented");  
      int i = 5;
      while (i >= 1){
         System.out.print(i + "\t");
         i--;
      } // end of while   

   
   }//end of q2
   
   public void q3()
   {
   
      //3.  Write a while loop to compute the sum of all integer values from to 1 to 5, inclusive.
      //    Display the sum
       System.out.println ("\n\tq3 method implemented");  
       int sum = 0;
       int i = 1;
       while (i <= 5) {
         System.out.print (i+ "\t");
         sum += i;
         i++;
       } // end of while 
       System.out.println("\n\tThe sum is:\t" + sum);
   
   }//end of q3
   
   public void q4_1()
   {
      //4.  Use a for loop to implement q1
       System.out.println ("\n\tq4_1 method implemented"); 
       for (int i = 1; i <= 5; i++){
         System.out.print(i + "\t");
       } // end of for  
   }//end of q4_1
   
   public void q4_2()
   {
      //4.  Use a for loop to implement q2
       System.out.println ("\n\tq4_2 method implemented");  
       for (int i = 5; i >= 1; i--){
         System.out.print(i + "\t");
       }

   }//end of q4_2

   public void q4_3()
   {
      //4.  Use a for loop to implement q3
       System.out.println ("\n\tq4_3 method implemented");
       int sum = 0;
       for (int i = 1; i <= 5; i++){
         System.out.print (i + "\t");
         sum += i;
       } // end of loop
       System.out.println("\n\tThe sum is:\t" + sum);  
       
   }//end of q4_3

   public void q5()
   {
   
      //5.  Use a loop to print all the even integers between 0 and 13, inclusive.
       System.out.println ("\n\tq5 method implemented");  
       for (int i = 0; i <= 13; i++){
         if (i % 2 == 0)
            System.out.print (i + "\t");
       } // end of loop
   }//end of q5
   
   
   public void q6()
   {
      //6.  Use a loop to print the sum of the odd integers between 0 and 10, inclusive.
       System.out.println ("\n\tq6 method implemented");  
       int sum = 0;
       for (int i = 0; i <= 10; i++){
         if (i % 2 == 1){
            sum += i;
            System.out.print (i + "\t");
         }
       } // end of loop
       System.out.println("\n\tThe sum is:\t" + sum);
   }//end of q6
   
   public void q7()
   {
      //7.  Write the code that uses looping to print the following table of values
      //    
      //    Hints:
      //    Use the following line of code to print out the heading of the table:
      //    System.out.println( "N\t10*N\t100*N\t1000*N\n" );
      //	   You should use one more print statement inside a while loop to print the rest of the table.


      //    N     N * 10   N * 100  N * 1000
      //    
      //    1     10       100      1000
      //    2     20       200      2000
      //    .     .        .        .
      //    5     50       500      5000

       System.out.println ("\n\tq7 method implemented");  
       System.out.printf ("\n\t%-10S%-10S%-10S%-10S", 
                           "N", "N * 10", "N * 100", "N * 1000\n");
       for (int n = 1; n <=5; n++){
       System.out.printf ("\n\t%-10d%-10d%-10d%-10d", 
                           n, n * 10, n * 100, n * 1000);
       }  

   }//end of q7
   
   public void q8 ()
   {
      //8.  Write an application that uses a loop with only the output statements

      //    System.out.print( "* " ); 
      //    System.out.print( " " ); 
      //    System.out.println();

      //    to display in the command window the checkerboard pattern that follows:
      //
      //    * * * * * *
      //     * * * * * *
      //    * * * * * *
      //     * * * * * *
      //    * * * * * *
      System.out.println ("\n\tq8 method implemented");  
      for ( int i = 5; i <= 5; i++){
         System.out.print("* ");
      } 

      

   }//end of q8
   
   public void q9()
   {
      //9.  Write a Java application that uses a loop to read in 10 numbers and calculates and prints their sum.

      System.out.println ("\tq9 method should be implemented");  //remove this line when implemented

   }//end of q9
   
   public void q10 ()
   {
      //10. Write a Java application that inputs an integer and uses an if statement to determine whether 
      //    the integer is even and, if it is, prints that number.

      System.out.println ("\tq10 method should be implemented");  //remove this line when implemented

   }//end of q10
   

   public void q11()
   {
      //11. Write a Java application that inputs an integer and uses an if…else statement to determine 
      //    whether the integer is odd or even. If it is odd, print the number followed by "is odd"; 
      //    if it is even, print the number followed by "is even".

      System.out.println ("\tq11 method should be implemented");  //remove this line when implemented

   }//end of q11
   
   public void q12()
   {
      //12. Write a Java application that uses a counter-controlled loop to sum the integers in the range 1–10, 
      //    then compute the average of those numbers (as an integer value). Display the sum and the average.
      System.out.println ("\tq12 method should be implemented");  //remove this line when implemented

   }//end of q12
   
   public void q13()
   {
   
      //13. Modify your solution to Coding Exercise 12 so that a user can specify the range of numbers to average.
      
      System.out.println ("\tq13 method should be implemented");  //remove this line when implemented

   }//end of q13
}//end of class Loop_Questions_9_27_2016
