//**************************************
//Purpose:	Practice with one-dimensional Array
//
//
//**************************************
import java.util.*;
public class OneDArray_3_20_2017 {
	public OneDArray_3_20_2017 (){
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
      System.out.println ();
      for (int i = 0; i < list.length; i++){
         System.out.print (list [i] + "\t");
      }
      System.out.println ();
   }//end of printOnALine method
	
   //***********************************
	//3.printNPerLine:	receives a one-dimensional array
	//				of type int and n as the number of 
   //          values to be printed per line. 
	//				on a single line
	//***********************************
	public void printNPerline(int [] list, int n){
    System.out.println ();
      for (int i = 0; i < list.length; i++){
         if (i%n == 0)
            System.out.println();
         System.out.print (list [i] + "\t");
      }
      System.out.println ();
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
		int min = list[0];
     for (int i = 1; i < list.length; i++)
         if (list[i] < min)
            min = list[i];
     return min; 
   }
   
	//***********************************
	//7.average:	receives a one-dimensional array
	//			of type int and returns the average of its values.
   //       You may use the sum method 
	//				
	//***********************************
	public double average (int [] list){
    	return (double) sum(list)/list.length;
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
            return true;
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
      for (int i = 0; i < score.length; i++){
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
      }//end of for	
	}//end of computeGrade
   
	//***************************************
	//10. printScoresAndGrades:	Receives a score array and grade array.
	//								prints scores and grades in a table format
	//
	//***************************************
	public void printScoresAndGrades (int [] score, char [] grade){
      System.out.printf ("\n\n\t%15S%10S","Score","Grade");
      for (int i = 0; i < score.length; i++){
          System.out.printf ("\n\t%15d%10c",score[i],grade[i]);
      }//end of for
	}//end of printScoresAndGrades  
	
	//***************************************************
	//11. displayNamesAndScores:	receives name and score arrays,
	//								Displays names and scores with appropriate 
	//								labels and record numbers
	//***************************************************
	public void displayNamesAndScores (String [] name, int [] score){
    System.out.printf ("\n\n\t%15s     %-15S%10S","Number","Name","Score");
      for (int i = 0; i < score.length; i++){
          System.out.printf ("\n\t%15d     %-15s%10d",(i+1),name[i],score[i]);
      }//end of for
	}
	//***************************************************
	//12. displayNames_Scores_Grades:	receives name,score, and grade arrays,
	//								Displays names, scores, and grades with appropriate 
	//								labels and record numbers
	//***************************************************
	public void displayNames_Scores_Grades (String [] name, int [] score, char [] grade){
	   System.out.printf ("\n\n\t%15s     %-15S%10S%10S","Number","Name","Score","Grade");
         for (int i = 0; i < score.length; i++){
          System.out.printf ("\n\t%15d     %-15s%10d%10c",(i+1),name[i],score[i], grade[i]);
      }//end of for
	}
   
   //***************************************************
	//14. sumOfEvenValues:	receives a one dimensional array of type integer,
   //                      computes and returns the sum of all even values 
   //                      in the array.
	//***************************************************
   public int sumOfEvenValues (int [] list){
      int sum = 0;
      for (int i = 0; i < list.length; i++) {
         if (list[i]%2 == 0) {
            sum += list[i];
         }
      }
      return sum;
   }
   
   //***************************************************
	//15. squareValuesInList:	receives a one dimensional array of type integer.
   //                      Create another local array, square the values in received
   //                      array and store them the new array. When done, return the new array.
	//***************************************************
   public int[] squareEvenValuesInList (int [] list){
      int count = 0;
      for (int i = 0; i < list.length; i++)
         if (list[i] % 2 == 0)
         count++;
      int [] temp = new int [count];
      int k = 0;
      for (int i = 0; i < list.length; i++){
        if (list[i] % 2 == 0){
         temp [k] = list[i] * list[i];
         k++;	
         }
      }
      return temp;
   }

   //***************************************************
	//16. average:	receives a variable argument list of integer/double values.
   //             The method computes and returns the average of received arguemnts.
	//***************************************************
   public double average (double ... list){
      double sum = 0;
      for (int i = 0; i < list.length; i++) {
         sum += list[i];
      }
      return sum / list.length;
	
   }

   //***************************************************
	//17. max:	receives a variable argument list of integer/double values.
   //          The method computes and returns the largest of received arguemnts.
	//***************************************************
   public double max (double ... list){
      double max = list[0];
      for (int i = 1; i < list.length; i++) {
         if (list[i] > max)
         max = list[i];
      }	
      return max;
   }
}