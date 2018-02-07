//*************************************************************
//Purpose:  Practice with two-dimensional arrays
//
//Author:   Fares
//Course:   CS1301
//Date:     11/8/2016
//Program:  TwoDArray_3_27_2017_Test.java
//*************************************************************

import java.util.*;
public class TwoDArray_3_27_2017{
	public TwoDArray_3_27_2017(){
	}
	
   //*****************************
	//1. Write a method that accepts 
	//	  an input file, a one-dimensional array
   //   of type string.
   //   The method reads from input file records
   //   of names and two scores. It stores names into the names
   //   array, scores into the scores array. Method checks for
   //   end of file and full array. 
	//******************************
      
	public void readNamesAndScores (Scanner input, String [] names, int [][] s) {
      int r = 0;
      while (input.hasNext()){
         names[r] = input.next();
         for (int c = 0; c < s[r].length; c++)
            s[r][c] = input.nextInt();
         r++;
      }   
	} 

   
	//*****************************
	//2. Write a method that accepts 
	//	  a one-dimensional array of type 
	//	  String. to display names one per line
	//******************************
	public void displayNames (String [] names){
      System.out.printf ("\n\t%10s %-20s","Number","Name");
      for(int r = 0; r < names.length; r++)
         System.out.printf ("\n\t%10s %-20s",(r+1),names[r]);
      System.out.println();   
   
   }

   
   //*****************************
	//3. Write a method that accepts 
	//	  a two dimensional array of type 
	//	  integer. to display scores one row per line
	//******************************
	public void displayScores (int [][] scores){
      System.out.printf("\n\t%-10s%-10s%-10s", "Test1","Test2","Test3");
      for(int r = 0; r < scores.length; r++){
         System.out.println();
         for(int c = 0; c < scores[r].length; c++)
            System.out.printf("%10d", scores[r][c]);
      }
	
   }
   
   //*****************************
	//4. Write a method that accepts 
	//	  a two dimensional array of type 
	//	  integer. Compute and return the 
   //   sum of all values in the array.
	//******************************
	public int sum (int [][] a){
      int sum = 0;
      for (int r = 0; r < a.length; r++){
         for(int c = 0; c < a[r].length; c++) 
            sum += a[r][c];
      }   
   
      return sum;  //update
	}

   //*****************************
  //	 5. Write a method that accepts 
  //	  a two dimensional array of type 
  //	  integer. Find and return the 
  //   largest value in the array.
  //******************************
	public int max (int [][] a){
      int max = a[0][0];
      for (int r = 0; r < a.length; r++){
         for(int c = 0; c < a[r].length; c++)
            if(a[r][c] > max)
               max = a[r][c]; 
            
      }   
   
     return max;  //update
   }

   //*****************************
	//6. Write a method that accepts 
	//	  a two-dimensional array of type integer, 
   //   computes and returns the sum of all even values
	//******************************
	public int sumOfEvenValues (int [][] list){
		int sum = 0;
      for (int r = 0; r < list.length; r++){
         for(int c = 0; c < list[r].length; c++)
            if(list[r][c] % 2 == 0)  
            sum += list[r][c];
            
      }   

      return sum; //update
   }
}