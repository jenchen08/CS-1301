//**********************************************
//Purpose: Practice with 1-D arrays
//
//
//
//***********************************************
import java.util.Random;
public class One_D_Example_3_1_2017{

   //*********************************
   // No argument constructor
   //*********************************
   public One_D_Example_3_1_2017(){
   }
   //***********************************
   // populate: populates array with 
   // random integer 0 to 11
   //***********************************
   public void populate (int[] a){
      //Create an object of Random class
      Random rng = new Random();
      
      //populate array
      for (int i = 0; i < a.length; i++){
         int value = rng.nextInt(11);
         a[i] = value;
         } //end of loop
   } // end of populate
   
   
   //************************************
   // display: display values in array 
   //          4 per line
   //***********************************    
   public void display (int[] a){
      System.out.println();
      for (int i = 0; i < a.length; i++){
         if (i%4 == 0)
            System.out.println();
         System.out.print (a[i] + "\t");
      }
   }
   
   public int sum (int[] a){
      int sum = 0;
      for (int i = 0; i < a.length; i++){
        sum += a[i];
      }
      return sum;
   }
   
}