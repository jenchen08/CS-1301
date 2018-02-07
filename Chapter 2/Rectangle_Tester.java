//*****************************************************************************
//Purpose:  A driver to use Rectangle class
//
//Input:    
//Output:
//
//Author:   Fares
//
//Course:   CS1301
//
//Date:     2/20/2017
//
//Program:  Rectangle_Tester.java
//****************************************************************************
public class Rectangle_Tester{
   //*************************************************************************
   //main:  creates objects of Rectangle and uses its methods
   //*************************************************************************
   public static void main (String [] args){
      //1.  Declare an object of Rectangle class by using the no-argument construtor
      Rectangle rectangle1 = new Rectangle();
      
      //2.  Display rectangle1 values by invoking the toString method
      System.out.println ("\n\trectangle1 default values:   \t"+ rectangle1.toString());
      
      //3.  Declare an object of Rectangle class by using the overloaded constructor
      Rectangle rectangle2 = new Rectangle(3, 4, "Green");
      
      //4.  Display rectangle2 original values by invoking the toString method
      System.out.println ("\n\trectangle2 original values:  \t"+ rectangle2);
      
      //5.  Display the length of rectangle2
      System.out.println ("\n\trectangle2 length:           \t"+ rectangle2.getLength());
      
      //6.  Change the length and height of rectangle1 and display the new dimensions
      rectangle1.setLength(10);
      rectangle1.setHeight(5);
      System.out.println ("\n\trectangle1 length:           \t"+ rectangle1.getLength());
      System.out.println ("\n\trectangle1 height:           \t"+ rectangle1.getHeight());

      
      //7.  Display the area of rectangle1
      System.out.println ("\n\trectangle1 area:             \t"+ rectangle1.getArea());

      //8.  Display the perimeter of rectangle2
      System.out.println ("\n\trectangle2 perimeter:        \t"+ rectangle2.getPerimeter());

      //9.  Display rectangle1 and rectangle2 values by invoking the toString method
      System.out.println ("\n\trectangle1 default values:   \t"+ rectangle1);
      System.out.println ("\n\trectangle2 default values:   \t"+ rectangle2);
      
   }//end of main method
} //end of Rectangle_Tester