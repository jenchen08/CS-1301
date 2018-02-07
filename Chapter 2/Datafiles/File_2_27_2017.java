//*******************************************************************
//Purpose:  Working with Scanner and files
//
//Author:   Fares
//Date:     2/27/2017
//Course:   CS1301
//
//*******************************************************************
import java.util.Scanner;
public class File_2_27_2017 {
   //Declarations
   private int numberOfLines = 0;
   private int numberOfTokens = 0;
   private int numberOfScores = 0;
   private int value;
   private double averageValue;
   private int sum = 0;
     
   
   //****************************************************************
   //constructor: no-argument constructor
   //****************************************************************
   public File_2_27_2017 (){
   }
   
   //****************************************************************
   //1. read_Text_file: Accepts an input text file. 
   //       
   // 1. Read one line at a time
   // 2. Display each line
   // 3. Increment line count
   // 4. Scan items on the line, count number of tokens
   // 5. Display each item on the line (one token on each line)
   // 6. Declare needed local variables
   //****************************************************************
   public void read_text_file (Scanner infile){
      System.out.println ("\n\t1.\tread_text_file method should be implemented");
      
      //1.1 Declare local variables
      String line;
      String token;     
      //1.2 Establish a loop to process one line at a time from input file
      while (infile.hasNext()){
               line = infile.nextLine();
               numberOfLines++;
               System.out.println ("\n\t" + numberOfLines + "\t" + line);
              //create an object of the Scanner class
              Scanner scan = new Scanner (line);
                 
              //1.3 Establish an inner loop to process each token of the line
              while (scan.hasNext()){
                 token = scan.next(); 
                 numberOfTokens++;
                 System.out.println ("\t\t" + numberOfTokens + "\t" + token);
              } // end of inner while loop
      } // end of outer while loop 
   } // end of method
   
   //****************************************************************
   //2. read_Text_Integer_file: Accepts an input text file with names and scores. 
   //       
   // 1. Read name and display
   // 2. Read score add to sum, count, and display
   //****************************************************************
   public void read_text_Integer_file (Scanner infile){
        System.out.println ("\n\t2.\tread_text_Integer_file method should be implemented");
 
      //2.1 Declare local variables
      String name;
      int score;   
      //2.2 Establish a loop to process each token in file
      //    Display tokens
      //    increment number of scores
      //    increment sum
      //    display token number, name, and score
      while (infile.hasNext()){
         name = infile.nextLine();
         numberOfTokens++;
         System.out.println ("\n\t" + numberOfTokens + "\t" + name);

            
     }
         
      //2.3 Display average score
                     
  } // end of method

   
} //end of class file_2_27_2017
