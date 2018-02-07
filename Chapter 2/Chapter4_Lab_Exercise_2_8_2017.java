//**************************************************************************
//Purpose:  Generate random numbers and letters.
//          
//Input:    None
//Output:   Vehicle plate number
//
//Author:   Jenny Chen 
//
//Course:   CS1301
//
//Date:     2/8/2017
//
//Program:  Chapter4_Lab_Exercise_2_8_2017.java
//**************************************************************************
public class Chapter4_Lab_Exercise_2_8_2017 {
   public static void main (String [] args){
      //1.  Declarations
      String plateNumber = "";
      char ch;
      int n;
      int range, start, end;
            
      //2.  Generate a random uppercase letter
      end = (int)'Z';
      start = (int)'A';
      range = end - start + 1;
      ch = (char)(int)(Math.random() * range + start);
      System.out.println (ch);
      
      //3.  Generate a random lowercase letter
      end = (int)'z';
      start = (int)'a';
      range = end - start + 1;
      ch = (char)(int)(Math.random() * range + start);
      System.out.println (ch); 
      
      //4.  Generate a random integer digit
      end = 9;
      start = 0;
      range = end - start + 1;
      n = (int)(Math.random() * range + start);
      System.out.println (n); 

      //5.  Generate a string of 3 random uppercase letters.
      end = (int)'Z';
      start = (int) 'A';
      range = end - start + 1;
      ch = (char)(int)(Math.random() * range + start);
      System.out.print(ch); 
      ch = (char)(int)(Math.random() * range + start);
      System.out.print(ch);
      ch = (char)(int)(Math.random() * range + start);
      System.out.print(ch);
      
      //6.  Generate a string of 4 random digits
      end = 9;
      start = 0;
      range = end - start + 1;
      n = (int)(Math.random() * range + start);
      System.out.print("\n" + n); 
      n = (int)(Math.random() * range + start);
      System.out.print(n); 
      n = (int)(Math.random() * range + start);
      System.out.print(n); 
      
      //7.  Generate a Vehicle Plate Number of 3 uppercase letters followed by 4 integers.
      // use a for loop
      end = (int)'Z';
      start = (int) 'A';
      range = end - start + 1;
      ch = (char)(int)(Math.random() * range + start);
      System.out.print(ch); 
      ch = (char)(int)(Math.random() * range + start);
      System.out.print(ch);
      ch = (char)(int)(Math.random() * range + start);
     
      for (int i = 0; i < 6; i++) {
         plateNumber += (char)(int)(Math.random() * range + start);
      } // end of loop
      
      end = 9;
      start = 0;
      range = end - start + 1;
      n = (int)(Math.random() * range + start);
      System.out.print("\n" + n); 
      n = (int)(Math.random() * range + start);
      System.out.print(n); 
      n = (int)(Math.random() * range + start);
      System.out.print(n); 
      
       for (int i = 0; i < 3; i++) {
         plateNumber += (int)(Math.random() * range + start);
      } // end of loop
      System.out.printf("\n%-20s%-20s","Plate Number:",plateNumber);

            
   }//end of main
}//end of class