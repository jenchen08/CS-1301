import java.util.*;
public class Lab_String_Character_2_13_2017{
   public static void main (String[] args){
      String str1 = "Valdosta";
      String str2 = "Valddosta State University";
      String str3, str4, str5;
      int m, n;
      //See sample output below
      
      //1.  Display the length of str1
      System.out.printf("\n\t1.\t%-20s%-10d", "Length of str1:", str1.length());
      
      //2.  Display the first character of str1
      System.out.printf("\n\t2.\t%-20s%-10c", "First char of str1:", str1.charAt(0));
           
      //3.  Display the last character of str1
      System.out.printf("\n\t3.\t%-20s%-20c", "Last char of str1:", str1.charAt(str1.length() - 1));
      
      //4.  Display the middle character of str1
      System.out.printf("\n\t4.\t%-20s%-20c", "Middle char of str1:", str1.charAt(str1.length() / 2));
            
      //5.  Display str1 in upper case
      System.out.printf("\n\t5.\t%-20s%-20s", "Upper case of str1:", str1.toUpperCase());
            
      //6.  Display whether str1 is equal to str2
      System.out.printf("\n\t6.\t%-20s%-20b", "Str1 is equal to Str2?:", str1.equals(str2));
      
      //7.  Display charcters 0 to 5 (5 is not included ) in str1
      System.out.printf("\n\t7.\t%-20s%-20s", "First 5 char of str1:", str1.substring(0,5));
            
      //8.  Count and display the number of uppercase letters in str2
      //    You may need to use a loop
      int count = 0;
      for (int i = 0; i < str2.length(); i++){
         char ch = str2.charAt(i);
         if (ch >= 'A' && ch <= 'Z')
            count++;
      }
      System.out.printf("\n\t8.\t%-20s%-20s", "Str2 is:", str2);
      System.out.printf("\n\t8.\t%-20s%-20d", "Number of upper case letters:", count);

      //9. Display str1 in reverse order
      //   You may use a loop
      System.out.printf("\n\t9.\t%-20s%-20s", "Str1 is:", str1);
      System.out.printf("\n\t9.\t%-20s", "Str1 in reverse order:");
      for (int i = str1.length() - 1; i >= 0; i--){
         System.out.print(str1.charAt(i));
      }
      System.out.println();   
            
      
      //Use other String and Character methods. See Chapter4 & 5

      /*
      
     1	Original str1 is:             Valdosta            
     2	First character of str1 is:   V                   
     3	Last character of str1 is:    a                   
     4	Middle character of str1 is:  o                   
     5	str1 in upper case:           VALDOSTA            
     6	Is str1 equal to str2?:       false               
     7	characters 1-4 in str1:       aldo                
     8	Number of uppercase letters in:        3 
     9	Original str1  Valdosta                       str1 in reverse is atsodlaV                      
        
      */   
   }
}