//*******************************************************************************
//Purpose:  Manipulates a text file and counts different types of characters,
//          tokens, and finds the shortest and longest tokens. Also practicing 
//          with 1-D arrays.
//
//Input:    Any text file
//
//Output:   Information regarding the text file.
//          
//
//Authors:   Chuck Millsap and Jenny Chen
//
//Course:   CS130 B
//
//Date:    03/22/17
//
//Program:  #9(MyCounts9.java)
//**************************************************************************
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
public class MyCounts9{
   //Declarations
   private int numberOfLowerCase = 0;
   private int numberOfUpperCase = 0;
   private int numberOfDigits = 0;
   private int numberOfOtherCharacters = 0;
   private int numberOfTokens = 0;
   private String shortestToken = "                                           ";
   private String longestToken = "";
   private String [] words;
   private String others = "";
   
   private int teamNumber;
   private String teamMember1;
   private String teamMember2;
   private String course;
   private Date dateCreated;
   
   
   //*****************************************************************************
   //constructor: 
   //             1. Receives a text file argument
   //             2. Reads tokens and stores in an ArrayList of type String
   //             3. Creates a one-dimensional array of type string to store tokens
   //             4. Copy the tokens from the ArrayList to the one-dimensional array 
   //*****************************************************************************
   public MyCounts9 (Scanner scan){
          //Declare an ArrayList of type string to hold original tokens
          ArrayList <String> tokens = new ArrayList<>();
          
          //Read tokens from text file and store into the ArrayList
          while (scan.hasNext()){
            String word = scan.next();
            
            //Store non-empty words into the ArrayList
            if (word.length()>0)
               tokens.add(word);
          }
          
          //Declare a one-Dimensional array of type string
          numberOfTokens = tokens.size();
          words = new String [numberOfTokens];
          
          //Copy words from tokens ArrayList to words array
          for (int i = 0; i < tokens.size(); i++)
            words[i] = tokens.get(i); 
    }//end of constructor
    
    //********************************************************************************
    //myTeamInformation:
    //               1: Assigns your group number to teamNumber
    //               2: Assigns your name to teamMember1
    //               3: Assigns your partner's name to teanMember2
    //               4: Assigns your course to course
    //               5: Assign System's date to dateCreated
    //********************************************************************************
    public void myTeamInformation(){
         teamNumber = 2;
         teamMember1 = "Chuck Millsap";
         teamMember2 = "Jenny Chen";
         course = "CS 1301 B";
         dateCreated = new Date();
    } // end of team information method
    
    //***************************************************************************************
    // Longestoken:  
    //               1: Finds the longest word in the string array and saves in longestToken.
    //                  (finding the max of letters in the word by going through the array,
    //                  and for loop, and if statement) 
    //***************************************************************************************
    public void longestToken(){
       int length = longestToken.length();
       longestToken = words[0];
       for (int i = 0; i < words.length; i++) {
         if (words[i].length() > length) {
            length = words[i].length();
            longestToken = words[i];
         } // end of for loop 
       }  // end of if statement    
    } // end of method
    
    //**********************************************************************************************
    // Shortesttoken:   1: Finds the shortest word in the string array and saves in shortestToken.
    //                  (finding the min of letters in the word by going through the array,
    //                  nested for loops, and if statement)
    //**********************************************************************************************
    public void shortestToken(){ //start of method
       int length = words[0].length();
       shortestToken = words[0];
       for (int i = 0; i < words.length; i++) {
         if (words[i].length() < length) {
            length = words[i].length();
            shortestToken = words[i];      
         } //end of for loop
       } // end of if statement
    } // end of method

    
    //********************************************************************************
    //   CountChars:   
    //               1: Processes all tokens in the string array to
    //               2: compute the numbers of digits
    //               3: compute the number of lowercase letters
    //               4: compute the number of uppercase letters
    //               5: compute the number of other characters
    //               6: accumulate all other characters
    //********************************************************************************
    public void countChars (){ //start of method
      // used nested for loops and if and else if statements to run through 
      // the file to count the characters of the word or symbols
      for (int i = 0; i < words.length; i++) {
         for(int j = 0; j < words[i].length(); j++) {
            if (words[i].charAt(j) >= '0' && words[i].charAt(j) <= '9')
               numberOfDigits++;
            else if (words[i].charAt(j) >= 'A' && words[i].charAt(j) <= 'Z')
               numberOfUpperCase++;
            else if (words[i].charAt(j) >= 'a' && words[i].charAt(j) <= 'z')
               numberOfLowerCase++;   
            else {
               numberOfOtherCharacters++;
               others += words[i].charAt(j);
            }  // end of else statement       
         } // end of inner for loop with if and else if statements
      } // end of nested for loop      
    }//end of countChars
    //********************************************************************************
    //   Header:   
    //               1: Displays team number
    //               2: Your name
    //               3: Your partner's name
    //               4: your course
    //               5: System's date and time
    //               6: used printf statements to align the info
    //********************************************************************************
    public void header (){ // Start of method
       System.out.println("*******************************************************************");
       System.out.printf ("%-30s%-30d\n", "Team Number:", teamNumber);
       System.out.printf ("%-30s%-30s\n", "Team Member 1:", teamMember1); 
       System.out.printf ("%-30s%-30s\n", "Team Member 2:", teamMember2);  
       System.out.printf ("%-30s%-30s\n\n", "Course:", course);
       System.out.printf ("%-30s%-30s\n\n", "Date:", dateCreated);
       System.out.println("*******************************************************************");
                
    }//end of header
    
    //********************************************************************************
    //displayOutput:    Displays counts, longest, and longest tokens
    //                  used printf statements to align the info              
    //********************************************************************************
    public void displayOutput(){ // start of method
       
       System.out.printf ("%-30s%-30d\n", "Number of Tokens:", words.length);
       System.out.printf ("%-30s%-30s\n", "Longest Token:", longestToken);
       System.out.printf ("%-30s%-30s\n", "Shortest Token:", shortestToken);
       System.out.printf ("%-30s%-30d\n", "Number of digits:", numberOfDigits);
       System.out.printf ("%-30s%-30d\n", "Number of uppercase letters:", numberOfUpperCase);
       System.out.printf ("%-30s%-30d\n", "Number of lowercase letters:", numberOfLowerCase);
       System.out.printf ("%-30s%-30d\n", "Number of other characters:", numberOfOtherCharacters);
       System.out.printf ("%-30s%-30s\n\n", "List of other characters:", others);
       System.out.println("*******************************************************************");
    } // end of displayOutput 
    
    //********************************************************************************
    //bonus:    Find and display additional information, such as number of numeric tokens, 
    //          Alphabetic tokens.
    //          This method is optional 
    //********************************************************************************
    public void bonus (){ //start of method 
    
      //*****************************************************
      // number of numeric tokens
      // only counting the numbers within the words
      //*****************************************************
      int numberOfNumericTokens = 0;
      for (int i = 0; i < words.length; i++) {
         for (int j = 0; j < words[i].length(); j++) {
            if (words[i].charAt(j) >= '0' && words[i].charAt(j) <= '9') { 
               numberOfNumericTokens++; 
               break;
            }  // end of if statement  
         } // end of inner for loop
      } // end of nested for loop
      
      //*******************************************************
      //number of alphabetic tokens
      // only counting the words with uppercase letters
      // or lowercase letters
      //*******************************************************
      int numberOfAlphabeticTokens = 0;
      for (int i = 0; i < words.length; i++) {
         for (int j = 0; j < words[i].length(); j++) {
            if (words[i].charAt(j) >= 'A' && words[i].charAt(j) <= 'Z') { 
               numberOfAlphabeticTokens++; 
               break;
            }// end of if statement with a break if it's true   
            else if (words[i].charAt(j) >= 'a' && words[i].charAt(j) <= 'z') { 
               numberOfAlphabeticTokens++; 
               break;
            } // end of else if statement with a break if it's true  
         } // end of inner for loop
      } // end of nested for loop
  
      //*********************************************************************************
      // Printed the number of numeric tokens and number of alphabetic tokens using
      // print f statements    
      //*********************************************************************************
      System.out.printf ("\n%-30s%-30d\n", "Number of numeric tokens:", numberOfNumericTokens);
      System.out.printf ("%-30s%-30d\n", "Number of alphabetic tokens:", numberOfAlphabeticTokens);                     
                       
  
    } // end of bonus method
      
      
    
 }//end of class               