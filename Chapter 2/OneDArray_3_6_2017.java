//**************************************
//Purpose:	Practice with one-dimensional Array
//
//
//**************************************
import java.util.*;
public class OneDArray_3_6_2017 {
	public OneDArray_3_6_2017 (){
	}
	
	//***********************************
	//1. populate:	receives a one-dimensional array
	//				of type int and a second argument 
	//				of type int indicating the upper 
	//				range of the random values to insert
	//				in the array. The method populates the
   //          array with values from 1 to n (inclusive)
	//***********************************
	public void populate (int [] list, int n) {
      Random rng = new Random();
      for (int i = 0; i < list.length; i++){
         list [i] = rng.nextInt(n)+ 1;
      }
   }
   
	//***********************************
	//2.printOnALine:	receives a one-dimensional array
	//				of type int and prints its values 
	//				on a single line
	//***********************************
	public void printOnALine (int [] list){
      System.out.println();
      for (int i = 0; i < list.length; i++){
         System.out.print (list [i] + "\t");
      }
      System.out.println();
   }//end of printOnALine method
	
   //***********************************
	//3.printNPerLine:	receives a one-dimensional array
	//				of type int and n as the number of 
   //          values to be printed per line. 
	//				on a single line
	//***********************************
	public void printNPerline(int [] list, int n){
       System.out.println();
       for (int i = 0; i < list.length; i++){
         if (i%n == 0)
            System.out.println();
         System.out.print (list [i] + "\t");
      }
      System.out.println();

   }

   //***********************************
	//4.sum:	receives a one-dimensional array
	//			of type int and returns the sum of its values 
	//				
	//***********************************
	public int sum (int [] list){
      int sum = 0;
      for (int i = 0; i < list.length; i++){
         sum += list [i];
      }
	   return sum;
	}
	//***********************************
	//5.max:	receives a one-dimensional array
	//			of type int and returns the max of its values 
	//				
	//***********************************
	public int max (int [] list){
      int largest = list[0];
      for (int i = 1; i < list.length; i++)
         if (list[i] > largest)
            largest = list[i];
      return largest; 
	}
	
	//***********************************
	//6. min:	receives a one-dimensional array
	//			of type int and returns the min of its values 
	//				
	//***********************************
	public int min (int [] list){
      int smallest = list[0];
      for (int i = 1; i < list.length; i++)
         if (list[i] < smallest)
            smallest = list[i];
      return smallest; 
   }
   
	//***********************************
	//7.average:	receives a one-dimensional array
	//			of type int and returns the average of its values.
   //       You may use the sum method 
	//				
	//***********************************
	public double average (int [] list){
      return (double) sum(list) / list.length;
   }

	//***********************************
	//8. found:	receives a one-dimensional array
	//			of type int and a key. returns true
	//			if key is the array, otherwise, returns false 
	//				
	//***********************************
	public boolean found (int [] list, int key){
      boolean found = false;
      for (int i = 0; i < list.length; i++){
         if (list[i] == key){
            found = true;
            break;
         }
      }
      return found; 
	}


	//***********************************
	//9. computeGrade:	Receives an int array that holds the scores
	//						and another array to hold the letter grades
	//***********************************
	public void computeGrade (int [] score, char [] grade){
        char g;
        int s;
        for (int i = 0; i < grade.length; i++) {
         s = score[i];
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
         grade[i] = g;
     }      

   }	
	
	//***************************************
	//10. printScoresAndGrades:	Receives a score array and grade array.
	//								prints scores and grades in a table format
	//
	//***************************************
	public void printScoresAndGrades (int [] score, char [] grade){
      System.out.printf("\n\n\t%15S%10S", "Score", "Grade");
      for (int i = 0; i < score.length; i++){
         System.out.printf("\n\t%15d%10c", score[i], grade[i]);
      }
	      
   }  
	
	//***************************************************
	//11. displayNamesAndScores:	receives name and score arrays,
	//								Displays names and scores with appropriate 
	//								labels and record numbers
	//***************************************************
	public void displayNamesAndScores (String [] name, int [] score){
      System.out.printf("\n\n\t%15s     %-15S%10S","Number", "Name", "Score");
      for (int i = 0; i < score.length; i++){
         System.out.printf("\n\t%15d     %-15s%10d", (i + 1), name[i], score[i]);
      }
   
	}
	//***************************************************
	//12. displayNames_Scores_Grades:	receives name,score, and grade arrays,
	//								Displays names, scores, and grades with appropriate 
	//								labels and record numbers
	//***************************************************
	public void displayNames_Scores_Grades (String [] name, int [] score, char [] grade){
		  System.out.printf("\n\n\t%15s     %-15S%10S%10S","Number", "Name", "Score", "Grade");
        for (int i = 0; i < score.length; i++){
            System.out.printf("\n\t%15d     %-15s%10d%10c", (i + 1), name[i], score[i], grade[i]);
      }
	}
   
   //***************************************************
	//13. sumOfEvenValues:	receives a one dimensional array of type integer,
   //                      computes and returns the sum of all even values 
   //                      in the array.
	//***************************************************
   public int sumOfEvenValues (int [] list){
      int sum = 0;
      for (int i = 0; i < list.length; i++){
         if (list[i] % 2 == 0)
            sum += list[i];
      }
	
      return sum;
   }
   

}