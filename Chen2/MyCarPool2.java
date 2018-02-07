//*****************************************************************************************************************

// Purpose: Calculate your daily driving cost, so that you can estimate how much money could be saved by car-pooling, 
//          which also has other advantages such as reducing carbon emission and reducing traffic congestion. 	
//	
// Input:   Reading the total miles driven per day, cost per gallon of gasoline, average miles per gallon, parking fees per day, 
//          tolls per day, number of passengers (sharing the same vehicle). 
//
// Output:	Displaying the user's cost per day of driving to 
//          work with and without car-pooling.
//
//	Author:  Jenny Chen
//	Date:	   1/17/2017
//	Class:   CS1301B
//	Program:	#2(MyCarPool2.java)

//*******************************************************************************************************************

// This imports the current date and time
import java.util.Date;

// imports into the class
import java.util.Scanner;

//(Blueprint)
public class MyCarPool2 {
   
// Declarations for each variable  
   private static String name;
   private static String course;
   private static Date dateCreated;
   private static double totalMilesDrivenPerDay;
   private static double costPerGallonOfGasoline;
   private static double averageMilesPerGallonOfGasoline;
  	private static double parkingFeesPerDay; 
   private static double tollsPerDay;
   private static int numberOfPassengers;
   private static double totalCost;
   private static double dailyTripCost;
   private static double onePassengerDailyCost;
   private static double daily;
   private static double weekly;
   private static double monthly;
   private static double annualSavings;
   private static final int WEEKLY= 5;
   private static final int MONTHLY= 22;
   private static final int ANNUALLY= 260;
   
   //Main Method
   public static void main( String args[] ){
      readData();
      calculations();
      printOutput();
   } //end main

   // Implement the method readData
   public static void readData(){
     
   // Scanner reads the statements    
      Scanner scan = new Scanner (System.in);
      
   // Reads the data of the statements   
      System.out.println("Welcome to the Daily Driving Cost Calculator\n");
      System.out.print ("Enter Name:\t");
      name= scan.nextLine ();
      System.out.print ("Enter Course Name:\t");
      course= scan.nextLine ();
      System.out.print ("Enter Total Miles Driven Per Day:\t");
      totalMilesDrivenPerDay= scan.nextDouble();
      System.out.print ("Enter Cost Per Gallon of Gasoline:\t");
      costPerGallonOfGasoline = scan.nextDouble();
      System.out.print ("Enter Average Miles Per Gallon of Gasoline:\t");
      averageMilesPerGallonOfGasoline = scan.nextDouble();
      System.out.print ("Enter Parking Fees Per Day:\t");
      parkingFeesPerDay = scan.nextDouble();
      System.out.print ("Enter Tolls Per Day:\t");
      tollsPerDay = scan.nextDouble();
      System.out.print ("Enter Number of passengers:\t");
      numberOfPassengers = scan.nextInt();
      
   } //end method for readData
  
   // Calculate for carpooling
   public static void calculations() {
      totalCost = totalMilesDrivenPerDay / averageMilesPerGallonOfGasoline * costPerGallonOfGasoline + tollsPerDay + parkingFeesPerDay;
      onePassengerDailyCost = totalCost / numberOfPassengers;
      daily = totalCost - onePassengerDailyCost;
      weekly= daily * WEEKLY;
      monthly = daily * MONTHLY;
      annualSavings = daily * ANNUALLY;
   
   // Gets date and time from system
   dateCreated = new Date(); 
   
  } // end method for calculations
   
   //invokes everything wanted to print
   public static void printOutput() {

   // methods for the repo
   printHeader();
   printFooter();

   } // end main of printOutput
   
   // Prints the top info   
   public static void printHeader(){

   // System prints statements for the report and "system.out.printf" formats printing, formatting can be customized
   System.out.println ("\n\t******* Car Pooling Report *************");
		
      System.out.printf ("\n\t%-20s%-20s", "Name:",name);
      System.out.printf ("\n\t%-20s%-20s", "Course:",course);
      System.out.printf ("\n\t%-20s%-20s", "Date:",dateCreated);
     	
      System.out.println ("\n\t***********************************");
	  
      System.out.printf ("\n\t%-25s%5.2f","Total Miles Driven Per Day:",totalMilesDrivenPerDay);
      System.out.printf ("\n\t%-29s%5.2f","Cost Per Gallon of Gasoline:",costPerGallonOfGasoline);
      System.out.printf ("\n\t%-38s%5.2f","Average Miles Per Gallon of Gasoline:",averageMilesPerGallonOfGasoline);
      System.out.printf ("\n\t%-22s%5.2f","Parking Fees Per Day:",parkingFeesPerDay);
      System.out.printf ("\n\t%-15s%5.2f","Tolls Per Day:",tollsPerDay);
      System.out.printf ("\n\t%-23s%-20d","Number of Passengers:",numberOfPassengers);
      System.out.printf ("\n");
      System.out.printf ("\n\t%-12s%5.2f","Total Cost:",totalCost);
      System.out.printf ("\n\t%-26s%5.2f","One Passenger Daily Cost:",onePassengerDailyCost);
      System.out.printf ("\n\t%-7s%5.2f","Daily:",daily);
      System.out.printf ("\n\t%-8s%5.2f","Weekly:",weekly);
      System.out.printf ("\n\t%-9s%5.2f","Monthly:",monthly);
      System.out.printf ("\n\t%-17s%5.2f","Annual Savings:",annualSavings);
      
      
      } //ends the method
      
      //Method
      public static void printFooter(){
		
     // Prints bottom info 
      System.out.println ("\n\n\t******* Have a nice day ************");
	  
     
     } // end of method
     
   } //end of class