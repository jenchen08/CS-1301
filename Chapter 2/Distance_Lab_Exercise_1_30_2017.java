//********************************************************************
// Purpose: compute the distance between the two points.
//
// Input:   coordinates of two points
// Output:  Your name, class, section, date, coordinates, and distance
//
// Author:  Jenny Chen
// Date:    1/30/17
// Course:  CS1301B
// Program: Distance_Lab_Exercise_1_30_2017.java 
//********************************************************************

import java.util.Scanner;
import java.util.Date;
public class Distance_Lab_Exercise_1_30_2017{
   //-----------------------------------------------------------------
   //  Computes the distance between two points using the distance
   //  formula. distance =sqrt((x2-x1)^2 + (y2-y1)^2 ) 
   //-----------------------------------------------------------------

   public static void main (String[] args){
      //1.  Declarations
      //the x and y coordinates for first point
      //the x and y coordinates for second point
      //distance to hold the distance between points
      //object to read data from keyboard
      //object to hold system's date
      int x1, y1;
      int x2, y2;
      double distance;
      Scanner scan = new Scanner( System.in );
      Date dateCreated = new Date(); 
      
      
      //2.  Reading the coordinates of two points from keyboard
      
      System.out.println("Enter first x and y coordinates:\t");
      x1= scan.nextInt();
      y1= scan.nextInt();
      System.out.println("Enter second x and y coordinates:\t");
      x2= scan.nextInt();
      y2= scan.nextInt();
 
   
      //3.  Compute the distance =sqrt((x2-x1)^2 + (y2-y1)^2 )
      
      distance=  Math.sqrt (Math.pow ((x2-x1),2) + Math.pow ((y2-y1),2));
      
      //Display output
      System.out.printf ("\n\t%-100s","****************** Distance Report ****************");
      System.out.printf ("\n\t%-30s%-30s","Name:","Jenny Chen");
      System.out.printf ("\n\t%-30s%-30s","Class:","CS1301B");
      System.out.printf ("\n\t%-30s%-30s","Name:","Jenny Chen");
      System.out.printf ("\n\t%-30s%-30s","Date Created:",dateCreated);
      System.out.printf ("\n\t%-100s\n","***************************************************");

      System.out.printf ("\n\t%-30s%-2s%2d%-2s%2d%-2s","First points coordinates:","(",x1,", ",y1," )");
      System.out.printf ("\n\t%-30s%-2s%2d%-2s%2d%-2s","Second points coordinates:","(",x2,", ",y2," )");
      System.out.printf ("\n\t%-30s%9.2f\n","Distance is:",distance);
 
      System.out.printf ("\n\t%-100s","*************** Have a good day ******************");
   }
}
