

import java.util.*;
public class TwoDArray_3_29_2017_Tester {
	public static void main (String [] args ){
		int [][] scores = new int [26][3];
      int [][] list1 = {{2, 4},
                       {7, 10, 15},
                       {11},
                       {20, 12, 6, 8, 9}};
                       
      int [][] list2 = {{ 8, 5,  3, 7},
                        {11, 9, 12, 4},
                        {20,11,  6,13}}; 
                        
      int [][] list3 = new int [5][6];
				
		TwoDArray_3_29_2017 tdo = new TwoDArray_3_29_2017();
		System.out.println ("\nList1 contains: ");
      tdo.displayList(list1);
      System.out.println ("\nList2 contains: ");
      tdo.displayList(list2);
      tdo.populate(list3,1,25);
      System.out.println ("\nList3 contains: ");
      tdo.displayList(list3);
      System.out.println ("List2 with row totals: ");
      tdo.rowTotals(list2);
      System.out.println ("List2 with column totals: ");
      tdo.columnTotals (list2);
      tdo.maxLocation(list2);
      System.out.printf ("%n%n\tThe sum of all values is:\t         %10d",tdo.sum(list2));
      System.out.printf ("%n%n\tThe largest value in the array is:\t%10d%n",tdo.max(list2));
      System.out.printf ("%n%n\tThe average value in the array is:\t%13.2f%n",tdo.average(list2));

   }//end of main method
}//end of class 	
		