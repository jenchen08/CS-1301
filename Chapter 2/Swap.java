import java.util.*;

public class Swap {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a string");
      String s = in.nextLine();
      int length = s.length();

      

      int l=length/2;
      String st="",sw="";
      for(int i=0;i<l;i++)
      st+=s.charAt(i);
      for(int j=l;j<length;j++)
      sw+=s.charAt(j);
      System.out.println("The new string is:\t"+sw+st);
   }
}