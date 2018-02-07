//*****************************************************************************
//Purpose:  Chapter 7: One dimensional arrays
//          linear search, binary search, and sort
//
//Author:   Fares
//
//Course:   CS1301
//
//Date:     3/21/2017
//
//*****************************************************************************
public class O_D_Array_3_22_2017{
   
   public O_D_Array_3_22_2017(){
   }
   
   //**************************************************************************
   //1.  displayIntegerList:   Receives one dimensional array of type integer and  
   //                      displays its contents.
   //**************************************************************************
   public void displayIntegerList (int[] list){
      System.out.print ("\n\t");
      for (int value : list)
         System.out.print(value + "\t");
      
      System.out.println();
   }
   
   //**************************************************************************
   //2.  displayStringList:   Receives one dimensional array of type String and  
   //                     displays its contents.
   //**************************************************************************
   public void displayStringList (String[] list){
      System.out.print ("\n\t");
      for (String value : list)
         System.out.print(value + "\t");
      
      System.out.println();
  }

   
   //**************************************************************************
   //3.  linearSearch:   Receives one dimensional array of type integer and an integer key.
   //                it searches the array and returns the key location in the array, 
   //                otherwise, it returns -1 (not found)
   //**************************************************************************
   public int linearSearch (int [] list, int key){
      int location = -1;
      for (int i = 0; i < list.length; i++){
         if (list[i] == key){
            location = i;
            break;
         }
      }
      return location;
   }
   
   //**************************************************************************
   //4.  linearSearch:   Receives one dimensional array of type string and a string key.
   //                it searches the array and returns the key location in the array, 
   //                otherwise, it returns -1 (not found)
   //**************************************************************************
   public int linearSearch (String [] list, String key){
      int location = -1;
      for (int i = 0; i < list.length; i++){
         if (list[i].equals(key)){
            location = i;
            break;
         }
      }
      return location;
   }
   
   //**************************************************************************
   //5.  selectionSort:   Receives unsorted one dimensional array of type int.
   //                it sorts the list on ascending order using the selection
   //                sort algorithm.
   //**************************************************************************
   public void selectionSort (int [] list){
      for (int pass = 0; pass < list.length - 1; pass++){
         int currentMin = list[pass];
         int currentMinIndex = pass;
         for (int i = pass + 1; i < list.length; i++){
            if (list[i] < currentMin){
               currentMin = list[i];
               currentMinIndex = i;
            }
         }
         //swap entries
         list[currentMinIndex] = list[pass];
         list[pass] = currentMin;
      }
   }
            
   
   //**************************************************************************
   //6.  selectionSort:   Receives unsorted one dimensional array of type String.
   //                it sorts the list on ascending order using the selection
   //                sort algorithm.
   //**************************************************************************
   public void selectionSort (String [] list){
    for (int pass = 0; pass < list.length - 1; pass++){
         String currentMin = list[pass];
         int currentMinIndex = pass;
         for (int i = pass + 1; i < list.length; i++){
            if (list[i].compareTo(currentMin)< 0){
               currentMin = list[i];
               currentMinIndex = i;
            }
         }
         //swap entries
         list[currentMinIndex] = list[pass];
         list[pass] = currentMin;
      }
   }    

}