//*****************************************************************************************************************

// Purpose: Write an application for shipping charges 	
//	
// Input:  Prompts the user to enter name, course, weight of package, and distance 
//
// Output:	Displaying the weight of package, miles of shipping, and how much shipping cost 
// based on the weight of package.
//
//	Author:  Jenny Chen
//	Date:	   1/25/2017
//	Class:   CS1301B
//	Program:	#3(MyShippingCharges3.java)

//*******************************************************************************************************************

// Import the Scanner to read the statements
import java.util.Scanner;

// Gave class a name (Blueprint of the program)
public class MyShippingCharges3 {

   // Declarations for each variable   
   private static String name;
   private static String course;
   private static double weightOfPackage;
   private static double ratePerThousandMilesShipped;
   private static double kgOrLess;
   private static double overKgAndLessThanOrEqualToFiveKg;
   private static double overFiveKgAndLessThanOrEqualToTenKg;
   private static double overTenKg;
   private static double totalCost;
   private static final double ONEKGORLESS= 1.70;
   private static final double OVERONEKGANDLESSTHANOREQUALTOFIVEKG= 2.20;
   private static final double OVERFIVEKGANDLESSTHANOREQUALTOTENKG= 6.70;
   private static final double OVERTENKG= 9.80;
   
   // Main Method    
   public static void main( String args[] ){
     readData();
     calculations();
     displayTable();
     printOutput();
   } // End Method
   
   // Implements the method
   public static void readData() {

       // Reads the statements in the system.out.print
       Scanner scan = new Scanner (System.in);
      
       // Reads the statements within the ()
       System.out.print ("Enter Name:\t");
       name= scan.nextLine ();
       System.out.print ("Enter Course Name:\t");
       course= scan.nextLine ();
       System.out.print ("Enter Weight of Package (Kg):\t");
       weightOfPackage= scan.nextDouble ();
       System.out.print ("Distance (Rate per 1000 Miles Shipped):\t");
       ratePerThousandMilesShipped= scan.nextDouble ();
      
      } // End of readData Method
   
      // Implements the next method for the calculations
      public static void calculations () {
   
      // This whole section gave the amount for the Table Charges
      kgOrLess = ONEKGORLESS;
      overKgAndLessThanOrEqualToFiveKg = OVERONEKGANDLESSTHANOREQUALTOFIVEKG;
      overFiveKgAndLessThanOrEqualToTenKg = OVERFIVEKGANDLESSTHANOREQUALTOTENKG;
      overTenKg = OVERTENKG;
      
      // Used if statements to get the total cost based on the weight of package 
      // and the distance.
      if (weightOfPackage <= 1) {
      
         totalCost = ONEKGORLESS;
      }
      
      if (weightOfPackage > 1 && weightOfPackage <= 5) {
      
         totalCost = OVERONEKGANDLESSTHANOREQUALTOFIVEKG;
      }
      
      if (weightOfPackage > 5 && weightOfPackage <= 10) {
         
         totalCost = OVERFIVEKGANDLESSTHANOREQUALTOTENKG;
      }
      
      if  (weightOfPackage > 10) {
         
         totalCost = OVERTENKG;
      }
      
      if (ratePerThousandMilesShipped > 1000) {
         
         totalCost *= 2.00;
         
      }
      
     } // End of calculations method 
      
      // Implements the next method for the Table to be displayed for the person
      // that is reading it
      public static void displayTable() {

      // Methods for the report
      printHeader();
      printFooter();

      } // End main of printOutput
   
      // Prints the top info   
      public static void printHeader(){
      
      // System prints statements for the report and "system.out.printf" formats printing, formatting can be customized
      System.out.println ("\n\t**************** Table Charges ************************");
		
      System.out.printf ("\n\tWeight of Package(Kg)");
      System.out.printf ("\t\tRate per 1000 Miles Shipped");
     	
      System.out.println ("\n\t*******************************************************");
	  
      System.out.printf ("\n\t%-31s$%.2f","1 Kg or Less:", kgOrLess);
      System.out.printf ("\n\t%-31s$%.2f","Over 1 Kg and <= 5 Kg:",overKgAndLessThanOrEqualToFiveKg);
      System.out.printf ("\n\t%-31s$%.2f","Over 5 Kg and <= 10 Kg:",overFiveKgAndLessThanOrEqualToTenKg);
      System.out.printf ("\n\t%-31s$%.2f","Over 10 Kg:",overTenKg);
      System.out.printf ("\n");
      System.out.printf ("\n\tCost will be doubled for distance > 1000 miles");
     } // End of method for printHeader
  
     // Prints the bottom 
     public static void printFooter(){   
      
      System.out.println ("\n\t*********************************************************");
     } // End of method
     
      // Next method for the printout of the report
      public static void printOutput (){
      
      System.out.println ("\n\t**************** Shipping Report ***********************");

      
      System.out.printf ("\n\t%-20s%-20s", "Name:",name);
      System.out.printf ("\n\t%-20s%-20s", "Course:",course);
      System.out.printf ("\n\t%-20s%.2f%n", "Weight of Package:",weightOfPackage);
      System.out.printf ("\n\t%-20s%.2f%n", "Distance:",ratePerThousandMilesShipped);
      System.out.printf ("\n\t%-20s$%.2f%n", "Total Cost:", totalCost);
     
      System.out.println ("\n\t******************Have a Nice Day!***********************");
     } // End of method
     
     
     
   } // End of class
  
  
  
	  
     

   
  

