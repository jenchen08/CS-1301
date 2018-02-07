//*************************************************************************
//Purpose:  Implements a Rectangle class with accessors, mutators,
//          and getArea, getPerimeter, and toString methods
//
//Input:    NA
//Output:   NA
//
//Author:   Jenny Chen  
//
//Course:   CS1301B
//
//Date:     2/20/2017
//
//Program:  Rectangle.java
//***************************************************************************

import java.util.Date;
public class Rectangle{
  //1.   Declarations
  private double length;
  private double height;
  private String color;
  private Date dateCreated;
 
  //***********************************************************************
  //2.   no-argument constructor   Assigns 1 to length and height.
  //     Assigns white to color
  //     gets the system's date and assigns to dataCreated
  //
  //***********************************************************************
  public Rectangle() {
  
      length = 1;
      height = 1;
      color = "White";
      dateCreated = new Date();
     
  }

  //***********************************************************************
  //3.   overloaded constructor   Received length, height, and color.
  //     Assigns the received parameters to the class data fields.
  //     Also, it gets the system's date and assigns to dataCreated
  //
  //***********************************************************************
  public Rectangle(double len, double h, String c) {
      length = len;
      height = h;
      color = c;
      dateCreated = new Date();
      
  }

  //***********************************************************************
  //4.   getLength: Returns the rectangle's length.
  //
  //***********************************************************************
  public double getLength() {
  
    return length;
    
  }

  //***********************************************************************
  //5.   getHeight: Returns the rectangle's height.
  //
  //***********************************************************************
  public double getHeight() {
      
      return height;
    
  }

  //***********************************************************************
  //6.   setLength: Updates rectangle's length.
  //
  //***********************************************************************
  public void setLength(double len) {
  
      length = len;
  
  }

  //***********************************************************************
  //7.   setHeight: Updates rectangle's height.
  //
  //***********************************************************************
  public void setHeight(double height) {
    
    this.height = height;     
      
  }

  //***********************************************************************
  //8.   getArea: Computes and returns the area of the rectangle.
  //
  //***********************************************************************
  public double getArea() {
      double area = length * height; 
        
      return area;
      
      //or return length * height;
  }

  //***********************************************************************
  //9.   getPerimeter: Computes and returns the perimeter of the rectangle.
  //
  //***********************************************************************
  public double getPerimeter() {
      
      double perimeter = 2 * (length + height);
      return perimeter;
      
      // or return 2 * (length + height);
  }
  
    
  //***********************************************************************
  //10.  toString:  Returns a string containing rectangle’s dimensions, 
  //           color, area, perimeter, and date created with appropriate labels.
  //
  //***********************************************************************
  public String toString(){
   String result = "\n\tRectangle Information:  \t" +
                   "\n\tLength:                \t" + length +
                   "\n\tHeight:                \t" + height+
                   "\n\tColor:                 \t" + color +
                   "\n\tArea:                  \t" + getArea() +
                   "\n\tPerimeter:             \t" + getPerimeter() +
                   "\n\tDate Created:          \t" + dateCreated;

   return result;
  }//end of toString()
}
