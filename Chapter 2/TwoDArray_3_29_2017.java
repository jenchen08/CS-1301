//*************************************************************
//Purpose:  Practice with two-dimensional arrays
//
//Author:   Fares
//Course:   CS1301
//Date:     3/29/2017
//Program:  TwoDArray_3_29_2017_Test.java
//*************************************************************
import java.util.*;
public class TwoDArray_3_29_2017{
	public TwoDArray_3_29_2017(){
	}
	
    
   //*****************************
	//1. Write a method that accepts 
	//	  a two dimensional array of type 
	//	  integer and displas its contents one row per line
	//******************************
	public void displayList (int [][] a){
      for (int r = 0; r < a.length; r++){
         System.out.println();
         for (int c = 0; c < a[r].length; c++)
            System.out.print(a[r][c] + "\t");
      }
      System.out.println();
   }
   
   //*****************************
	//2. Write a method that accepts 
	//	  a two dimensional array of type 
	//	  integer and a start and end integer values.
   //   The method should populate the array with random values 
   //   from the start to end values.
	//******************************
	public void populate (int [][] a, int start, int end){
      Random rng = new Random();
      for (int r = 0; r < a.length; r++){
         for (int c = 0; c < a[r].length; c++)
            a[r][c] = rng.nextInt(end - start + 1) + start;
      }

	}

   //*****************************
  //3. Write a method that accepts 
  //	  a two dimensional array of type 
  //	  integer and displays each row with its total on same line 
  //******************************
	public void rowTotals (int [][] a){
      for (int r = 0; r < a.length; r++){
         System.out.println();
         int sum = 0;
         for (int c = 0; c < a[r].length; c++){
            System.out.print (a[r][c] + "\t");
            sum += a[r][c];
         }
         System.out.print(sum);
      }
      System.out.println();   
   }

   //*****************************
	//4. Write a method that accepts 
	//	  a two-dimensional array of type integer, 
   //   and displays the array followed by column totals
	//******************************
	public void  columnTotals (int [][] list){
      displayList (list);
      for (int c = 0; c < list[0].length; c++){
         int sum = 0;
         for (int r = 0; r < list.length; r++)
            sum += list[r][c];
            System.out.print(sum + "\t");
      }      
      System.out.println();
   }

   //*****************************
	//5. Write a method that accepts 
	//	  a two-dimensional array of type integer, 
   //   finds and returns the largest value
	//******************************
	public int  max (int [][] list){
     int max = list [0][0];
     for (int r = 0; r < list.length; r++){
         for (int c = 0; c < list[r].length; c++)
            if (list[r][c] > max)
               max = list[r][c];
      }      
      System.out.println();

     return max; //update this statement 
   }
   
   //*****************************
	//6. Write a method that accepts 
	//	  a two-dimensional array of type integer, 
   //   displays the row and column of the largest value
	//******************************
	public void  maxLocation (int [][] list){
     int max = list [0][0];
     int rowMax = 0;
     int columnMax = 0;
     for (int r = 0; r < list.length; r++){
         for (int c = 0; c < list[r].length; c++){
            if (list[r][c] > max)
               max = list[r][c];
               rowMax = r;
               columnMax = c;
         }
     }
     System.out.println(max + "is located at row" + rowMax + "and column" + columnMax);
   }
   
   //*****************************
	//7. Write a method that accepts 
	//	  a two-dimensional array of type integer, 
   //   finds and returns the sum of all values
	//******************************
	public int  sum (int [][] list){
     int sum = 0;
     for (int r = 0; r < list.length; r++){
         for (int c = 0; c < list[r].length; c++){
            sum += list[r][c];           
         }
     }
     return sum; 
   }
   
   //*****************************
	//8. Write a method that accepts 
	//	  a two-dimensional array of type integer, 
   //   finds and returns the number of elements in array
	//******************************
	public int  countElements (int [][] list){
     int count = 0;
     for (int r = 0; r < list.length; r++){
         for (int c = 0; c < list[r].length; c++){
            count++;           
         }
     }
         return count; 
   }
   
   //*****************************
	//9. Write a method that accepts 
	//	  a two-dimensional array of type integer, 
   //   finds and returns the average of all values in array
	//******************************
	public double  average (int [][] list){
     return (double) sum(list) / countElements(list); 
   }
}