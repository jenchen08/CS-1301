//*****************************************************************************
//Purpose:  A driver to test One dimensional arrays
//          linear search, binary search, selection sort, Arrays.sort, and 
//          Arrays.fill method
//
//Author:   Fares
//
//Course:   CS1301
//
//Date:     3/21/2017
//
//*****************************************************************************
import java.util.*;
public class O_D_Array_3_21_2017_Tester{
   public static void main (String [] args){
      //1.  Declarations
      int [] intList = {10, 5, 20, 25, 15};
      String [] names = {"Basem", "Dustin", "Landon", "Martin", "Jose","Wei", "Mathew"};
      String [] names2 = {"Jenny", "Adam", "Joe"};
      
      //2.  Create an object of O_D_Array_3_21_2017 class
      O_D_Array_3_21_2017 one = new O_D_Array_3_21_2017();
      
      //3.  Display the integer list
      one.displayIntegerList(intList);
      
      //4.  Display the string list
      one.displayStringList(names);
      
      //5.  Use linear search to look for integer 20 in intList
      System.out.println ("value 20 is located at location:\t" + one.linearSearch(intList, 20));
      
      //6.  Use linear search to look for integer 12 in intList
      System.out.println ("value 12 is located at location:\t" + one.linearSearch(intList, 12));
      
      //7.  Use linear search to look for string Harlan in names List
      System.out.println ("value Harlan is located at location:\t" + one.linearSearch(names, "Harlan"));
      
      //8.  Use linear search to look for string Martin in names List
      System.out.println ("value Martin is located at location:\t" + one.linearSearch(names, "Martin"));

      //9.  Display the integer list
      one.displayIntegerList(intList);

      //10. sort intList
      one.selectionSort(intList);
      one.displayIntegerList(intList);
      
      //10.1 sort names
     one.selectionSort(names);
     one.displayStringList(names);

      //11.  Display the sorted integer list
      one.displayIntegerList(intList);
      
      //12.  Display the unsorted names string list
      one.displayStringList(names);

      //13. Use the Arrays class method sort
      java.util.Arrays.sort(names);
      
      //14.  Display the sorted names string list
      one.displayStringList(names);
      
      //15. Use the Arrays class method binarySearch
      //15.1  Display the sorted integer list
      one.displayIntegerList(intList);
      //15.2  Use Arrays.binarySearch method to look for integer 12 in intList
      System.out.println ("value 12 is located at location:\t" + java.util.Arrays.binarySearch(intList, 12));
      //15.3  Use Arrays.binarySearch method to look for integer 20 in intList
      System.out.println ("value 20 is located at location:\t" + java.util.Arrays.binarySearch(intList, 20));

      //16.1  Display the sorted names string list
      one.displayStringList(names);
      one.displayStringList(names2);
      Arrays.sort(names2);
      one.displayStringList(names2);
      //16.2  Use Arrays.binarySearch method to look for Smith in names
      System.out.println ("value Smith is located at location:\t" + java.util.Arrays.binarySearch(names, "Smith"));
      //16.3  Use Arrays.binarySearch method to look for Landon
      System.out.println ("value Landon is located at location:\t" + java.util.Arrays.binarySearch(names, "Landon"));
      
      //17.1   Use the Arrays toString method
      int [] list2 = {2, 4, 7, 20};
      System.out.println (java.util.Arrays.toString(list2));
      
      //18.1   Use the Arrays fill method
      java.util.Arrays.fill(list2, 9);
      System.out.println (java.util.Arrays.toString(list2));
      
      java.util.Arrays.fill(list2,1,3,7);
      System.out.println (java.util.Arrays.toString(list2));

      
      


      


      
      

      
   }
   
}
