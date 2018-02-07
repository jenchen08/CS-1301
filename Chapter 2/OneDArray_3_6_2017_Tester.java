//****************************************
//Purpose:  Practice with one dimensioal array
//
//
//*****************************************
public class OneDArray_3_6_2017_Tester{
   public static void main (String [] args){
      //1.  Declarations
      int [] list1 = {10, 5, 7, 20};
      int [] list2 = new int [10];
      String [] names = {"John", "Chris", "Dustin","Kira","Landon","Martin","Jose"};
      int [] scores = {95, 88, 23, 70, 60, 100, 42};
      char [] grades = {'A', 'B', 'F', 'C', 'D', 'A', 'F'};
      
      //2.  Create an object of OneDArray_3_6_2017 class
      OneDArray_3_6_2017 one = new OneDArray_3_6_2017();
   
      //3.  populate list2 with random values 1 to 15
      one.populate(list2, 15);
      
      //4.  display list2
      one.printOnALine(list2);
      
      //5.  display list1
      one.printOnALine(list1);
      
      //6.  display list2 4 items per line
      one.printNPerline (list2, 4);
      
      //7.  display the sum of list1
      System.out.println ("\t\tThe sum of list1 is:    \t" + one.sum(list1));
      
      //8.  display the sum of list2
      System.out.println ("\t\tThe sum of list2 is:    \t" + one.sum(list2));
   
      //9.  display the max of list2
      System.out.println ("\t\tThe max of list2 is:    \t" + one.max(list2));

      //10.  display the min of list2
      System.out.println ("\t\tThe min of list2 is:    \t" + one.min(list2));
      
      //11.  display the average of list2
      System.out.println ("\t\tThe average of list2 is: \t" + one.average(list2));
      
      //12.  Check if value 17 in list2
      System.out.println ("\t\tIs 17 in list2?          \t" + one.found(list2, 17));
      
      //12.2  Check if value 1 in list2
      System.out.println ("\t\tIs 1 in list2?           \t" + one.found(list2, 1));

      //13.  Display scores and grades
      one.printScoresAndGrades(scores, grades);
      
      //14.  Display names and grades
      one.displayNamesAndScores (names, scores);
      
      //15.  Display names, scores, and grades
      one.displayNames_Scores_Grades (names, scores, grades);


      //14. Display the sum of even values in list1
      System.out.println ("\n\n\t\tSum of even values in list1 is\t" + one.sumOfEvenValues(list1));



   }//end of main method
}//end of class