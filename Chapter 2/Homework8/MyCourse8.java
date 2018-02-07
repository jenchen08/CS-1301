//***************************************************************************
//Purpose:  Using methods and arrays
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
//Date:     3/8/17
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
   //Constructor:  Reads the text file and uses arrays/methods   
   //**********************************************************************
   public MyCourse8 (Scanner scan){ 
      
      //reading course information
      courseName = scan.nextLine();
      instructorName = scan.nextLine();
      numberOfStudents = scan.nextInt();
      school = scan.next();
      semester = scan.next();
      year = scan.nextInt();
      
            
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
   //computeGrades:    This goes through the list of scores to add a
   //                  letter grade next to it 
   //**********************************************************************
   public void computeGrades (){
        char g;
        int s;
        for (int i = 0; i < grades.length; i++) {
         s = scores[i];
         if (s >= 90)
            g = 'A';
         else if (s >= 80)
            g = 'B';
         else if (s >= 70)
            g = 'C';
         else if (s >= 60)
            g = 'D';
         else            
            g = 'F';
         grades[i] = g;
     }            
        
  }

   //**********************************************************************
   //computeTestAverage:   This computes the average of the test scores
   //**********************************************************************
    public void computeTestAverage(){
      int sum = 0;
      for(int i=0; i < scores.length ; i++)
         sum += scores[i];
         testAverage = (double)sum / scores.length;
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
   //findStudentWithLowestTotal:    This find the lowest score 
   //                               through the text file by using
   //                               a for loop, if statement, and array  
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
   //displayOutput:    Displays the info from text file
   //                  also displays grades, average, and highest and lowest
   //                  scores.
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
     System.out.println("******************* Output Report *******************");
     System.out.println ("\tCourse Name:      \t" + courseName);
     System.out.println ("\tInstructor's Name:\t" + instructorName);
     System.out.println ("\tSemester:         \t" + semester);
     System.out.println ("\tYear:             \t" + year);
     System.out.println ("\tSchool Name:      \t" + school);
     System.out.println("*****************************************************\n\n\n\n");
     System.out.printf("%12s%6s%10s%11s","Number","Name","Score","Grade");
   }

   //*******************************************************************************
   //displayStudentsRecords:    Displays numbers, student's name, scores, and grades 
   //*******************************************************************************  
   public void displayStudentsRecords(){
      //display labels
     for (int i = 0; i < names.length; i++){
         String n = names[i];
         int s = scores[i];
         char a = grades[i];
         System.out.printf("\n\t%-3d%-15s%-10d%-10c",i + 1, n, s, a);
     }
         System.out.println ("\n");
   }
     
     
   //****************************************************************************
   //displayFooter:    Displays test average, Highest test score with the grade
   //                  , and lowest test score with the grade.
   //*****************************************************************************  
   public void displayFooter (){
      System.out.printf ("\n\t%-10s%10.2f\n\n", "Test Average:" , testAverage);
      System.out.println ("\tStudent with highest score:\n\t" + names[highestScoreIndex] + "\t" + scores[highestScoreIndex] + "\t"
                           + grades[highestScoreIndex] + "\n");
      System.out.println ("\tStudent with lowest score:\n\t" +  names[lowestScoreIndex] + "   \t" + scores[lowestScoreIndex]+ "\t"
                           + grades[lowestScoreIndex] + "\n");
   }// end of displayFooter
 
   
}//end of class