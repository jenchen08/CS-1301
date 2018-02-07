//***************************************************************************
//Purpose:  Using arrays and loops
//
//Input:    The text file of students with their grades
//
//Output:   The test average and student complete record with the lowest score 
//          , and student complete record with the highest score 
//
//Author:   Chuck Millsap and Jenny Chen
//
//Course:   CS1301B
//
//Date:     3/7/17
//
//Program:  #8(MyCourse8.java)
//**************************************************************************

// The scanner imports into class
import java.util.Scanner;
// Blueprint and gave the class a name 
public class MyCourse8 {
   //Declarations
   private String courseName;
   private String instructorName;
   private int numberOfStudents;
   private String school;
   private String semester;
   private int year;
   private String [] names;
   private int [] scores;
   private char [] grades;
   private double testAverage;
   private int lowestScoreIndex;
   private int highestScoreIndex;
   
   //**********************************************************************
   //Constructor:    Document 
   //**********************************************************************
   public MyCourse8 (Scanner scan){ 
      
      //reading course information
      courseName = scan.nextLine();
      instructorName = scan.nextLine();
      this.numberOfStudents = scan.nextInt();
      this.school = scan.next();
      this.semester = scan.next();
      this.year = scan.nextInt();
      
            
      //declaring needed arrays
      names = new String [numberOfStudents];
      scores = new int [numberOfStudents];
      grades = new char [numberOfStudents];
      
      
      //reading students records
      for (int i = 0; i < numberOfStudents; i++){
         names [i] = scan.next();
         scores[i] = scan.nextInt();
         
      }//end of for
      
      //computing students totals, grades, tests averages,
      //highest total index, and lowest total index
      //computeStudentsTotals ();
      computeGrades();
      computeTestAverage ();
      findStudentWithHighestTotal();
      findStudentWithLowestTotal();
      
      //Printing output.
      displayOutput();
   }
   
   //**********************************************************************
   //computeGrades:    This computes all the scores together 
   //**********************************************************************
   public void computeGrades (){
     int sum = 0;
     for (int i = 0; i < scores.length; i++) 
        sum += scores[i];
        
  }

   //**********************************************************************
   //computeTestAverage:   This computes the average of the test scores
   //**********************************************************************
    public void computeTestAverage(){
      int sum = 0;
      for(int i=0; i < scores.length ; i++)
         sum += scores[i];
         testAverage = sum / scores.length;
   }

   //**********************************************************************
   //findStudentWithHighestTotal:    This find the highest score 
   //                                through the text file by using
   //                                a for loop, if statement, and array 
   //**********************************************************************
   public void findStudentWithHighestTotal(){
      int max = scores[0];
      for ( int i = 0; i < scores.length; i++){
         if (scores[i] > max){
            max = scores[i];
            highestScoreIndex = i;
         }
      }
   }     

   //**********************************************************************
   //findStudentWithLowestTotal:    This find the highest score 
   //                                through the text file by using
   //                                a for loop, if statement, and array  
   //**********************************************************************
   public void findStudentWithLowestTotal(){
      int min = scores[0];
      for ( int i = 0; i < scores.length; i++){
         if (scores[i] < min){
            min = scores[i];
            lowestScoreIndex = i;
         }
      }
   
   }

   //**********************************************************************
   //displayOutput:    This displays the outputs of student records
   //                  average, highest score, and lowest score 
   //**********************************************************************  
   public void displayOutput(){   
     
      displayHeader();
      displayStudentsRecords ();
      displayFooter ();
      
   }
   
   //**********************************************************************
   //displayHeader:    This displays the course, instructor, semester,
   //                  year, and school name.
   //**********************************************************************  
   public void displayHeader(){
     System.out.println (courseName);
     System.out.println (instructorName);
     System.out.println (semester);
     System.out.println (year);
     System.out.println (school);
   }

   //**********************************************************************
   //displayStudentsRecords:    Displays student's name and scores 
   //**********************************************************************  
   public void displayStudentsRecords(){
      //display labels
     for (int i = 0; i < names.length; i++){
         String n = names[i];
         int s = scores[i];
         System.out.printf("\n%-10s%-10d" , n , s);
     }
         System.out.println ("\n");
     }
     
     
   //**********************************************************************
   //displayFooter:    Displays test scores, Highest test score, and
   //                  lowest test score.
   //**********************************************************************  
   public void displayFooter (){
      System.out.println ("Test Average:      \t" + testAverage);
      System.out.println ("Highest Test Score:\t" + names[highestScoreIndex] + " " + scores[highestScoreIndex]);
      System.out.println ("Lowest Test Score:  \t" +  names[lowestScoreIndex] + " " + scores[lowestScoreIndex]);
   }// end of displayFooter
 
   
}//end of class