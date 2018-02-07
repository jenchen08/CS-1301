//****************************************************************************
//Purpose:	Using static methods, Date, and Scanner classes
//Input:		Reading name, course, and rectangle dimensions
//Output:	Displays rectangle information. See sample output at the bottom
//Author:	Fares
//Class:		CS1301
//Date:		1/11/2017
//Program:	Rectangle_Lab_1_11_2017.java
//****************************************************************************

//1.  Import the packages that have the Scanner and Date classes

import java.util.Date;
import java.util.Scanner;
public class Rectangle_Lab_1_11_2017 {
	//2.  Declarations
   //    Declare static variables that can be used in all the methods of the class
   //    Declare width, height, area, and perimeter of type double
   //    Declare name and course of type String
	private static String name;
   private static String course;
   private static double width, height, area, perimeter, color;
   private static Date dateCreated;
  	private static String School; 
   private static String Color;
	//****************************************************************************
	//main:	invokes other methods.
   //       main methods just invokes readData, calculations, and printOutput methods
	//****************************************************************************
	public static void main (String [] args) {
	   readData();
      calculations();
      printOutput();
   }//end of main
	
	//****************************************************************************
	//readData:	Read name, course, and rectangle width and height
	//				
	//****************************************************************************
	
   //3.  Implement the readData method
   public static void readData(){
      //3.1 Create a Scanner object to help in reading name, course, height, and width from keyboard
      Scanner scan = new Scanner (System.in);
            
      //3.2 Reading data: name, course, and rectangle dimensions
      System.out.print ("Enter your name:\t");
      name = scan.nextLine();
      System.out.print ("Enter Course name:\t");
      course = scan.nextLine();
      System.out.print ("Enter your School:\t");
      School = scan.nextLine();
      System.out.print ("Enter Color:      \t");
      Color = scan.nextLine();
      System.out.print ("Enter width:\t\t");
      width = scan.nextDouble();
      System.out.print ("Enter your height:\t");
      height = scan.nextDouble();
      



   }//end of readData method
	
   //4.  Implement the calculations method
	//****************************************************************************
	//calculations:	computes area and perimeter.
   //                Also, gets date and time from the system
	//						
	//****************************************************************************
	public static void calculations (){
      //4.1 Compute perimeter and area
      perimeter = 2*(width + height);
      area = width * height;    
      
      //4.2 Get date and time from the system
   dateCreated = new Date();
   
      
      } //end of calculations method
	
	//****************************************************************************
	//printOutput:	invokes header and footer
	//					and displays rectangle  
	//					information
	//****************************************************************************

	   public static void printOutput(){
		//invoke the printHeader method
      printHeader();
      
      //print width, height, area, perimeter, and color as shown in sample output
		System.out.printf ("\n\t%-20s%5.2f","Width:", width);
      System.out.printf ("\n\t%-20s%5.2f","Height:", height);
      System.out.printf ("\n\t%-20s%5.2f","Area:", area);
      System.out.printf ("\n\t%-20s%5.2f","Perimeter:", perimeter);
      //invoke printFooter method
		printFooter();
	}
	
	//****************************************************************************
	//printHeader:	Prints name, clas, and date.
   //             Use the Date class to get the date and time from the system
	//****************************************************************************
	public static void printHeader(){
		System.out.println ("\n\t******* Rectangle Report *************");
		System.out.printf ("\n\t%-20s%-20s", "Name:", name);
      System.out.printf ("\n\t%-20s%-20s", "Course:", course);
      System.out.printf ("\n\t%-20s%-20s", "School:", School);
      System.out.printf ("\n\t%-20s%-20s", "Color:", Color);
      System.out.printf ("\n\t%-20s%-20s", "Date:", dateCreated);
     	System.out.println ("\n\t***********************************");
	}
	
	//************************************
	//printFooter:	prints a footer line
	//************************************
	public static void printFooter(){
		System.out.println ("\n\n\t******* Have a nice day ************");
	}
   
   /*
   

   ******* Rectangle Report *************
	   Name:	John Smith
   	Class:	CS1301
      Date:	Mon Aug 22 09:37:41 EDT 2016
   ***********************************
      
      Width                     3.00
      Height                    4.00
      Area                     12.00
      Perimeter                14.00
            
   ******* Have a nice day ************
*/
}