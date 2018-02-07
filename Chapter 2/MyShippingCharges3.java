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

   // Declarations for each static variable
   // declare string for name and course
   // declare integer for weight of package and distance
   // declare double for each weight of the package
   // declare final double constant variables for the set total of the shipping   
   private static String name;
   private static String course;
   private static int weightOfPackage;
   private static int distance;
   private static double weightBracket1;
   private static double weightBracket2;
   private static double weightBracket3;
   private static double weightBracket4;
   private static double totalCost;
   private static final double WEIGHT_BRACKET_1= 1.70;
   private static final double WEIGHT_BRACKET_2= 2.20;
   private static final double WEIGHT_BRACKET_3= 6.70;
   private static final double WEIGHT_BRACKET_4= 9.80;
   
   // Main Method invokes the other methods for reading data, calculations, table, and print output   
   public static void main(String args[]){
     readData();
     calculations();
     displayTable();
     printOutput();
   } // End Method
   
   // Implements the method (Reads the data for name, course, weight of package, and distance
   public static void readData() {

       // Reads the statements in the system.out.print
       Scanner scan = new Scanner (System.in);
      
       // Reads the statements within the ()
       System.out.print ("Enter Name:\t");
       name= scan.nextLine();
       System.out.print ("Enter Course Name:\t");
       course= scan.nextLine();
       System.out.print ("Enter Weight of Package (Kg):\t");
       weightOfPackage= scan.nextInt();
       System.out.print ("Distance:\t");
       distance= scan.nextInt();
      
      } // End of readData Method
   
      // Implement the next method for the calculations. This section is
      //what is going to printed for the total cost
      public static void calculations () {
   
         // This whole section gave the amount for the Table Charges and is the set amount
         weightBracket1 = WEIGHT_BRACKET_1;
         weightBracket2 = WEIGHT_BRACKET_2;
         weightBracket3 = WEIGHT_BRACKET_3;
         weightBracket4 = WEIGHT_BRACKET_4;
      
         // Used if and else statements to get the total cost based on the weight of package 
         // and the distance. 
         
         if (distance > 1000) {
            
            totalCost *= 2;
         }
         
         if (weightOfPackage <= 1) {
      
             totalCost = WEIGHT_BRACKET_1;
         }
         
         else if (weightOfPackage <= 5) {
      
             totalCost = WEIGHT_BRACKET_2;
         }
      
         else if (weightOfPackage <= 10) {
         
             totalCost = WEIGHT_BRACKET_3;
         }
      
         else             
            totalCost = WEIGHT_BRACKET_4;
        
      
     } // End of calculations method 
      
      // Implements the next method for the Table to be displayed for the person
      // that is reading it
      public static void displayTable() {

         // Methods for the report
         printHeader();
         printFooter();

      } // End main method of printOutput
   
         // Prints the top info   
         public static void printHeader(){
      
         // System prints statements for the report and "system.out.printf" formats printing, formatting can be customized
         // Prints the set prices of the weight and distance
         System.out.println ("\n\t**************** Table Charges ************************");
		
         System.out.printf ("\n\tWeight of Package(Kg)");
         System.out.printf ("\t\tDistance");
     	
         System.out.println ("\n\t*******************************************************");
	  
         System.out.printf ("\n\t%-31s$%.2f","1 Kg or Less:",weightBracket1 );
         System.out.printf ("\n\t%-31s$%.2f","Over 1 Kg and <= 5 Kg:",weightBracket2);
         System.out.printf ("\n\t%-31s$%.2f","Over 5 Kg and <= 10 Kg:",weightBracket3);
         System.out.printf ("\n\t%-31s$%.2f","Over 10 Kg:",weightBracket4);
         System.out.printf ("\n");
         System.out.printf ("\n\tCost will be doubled for distance > 1000 miles");
     } // End of method for printHeader
  
     // Prints the bottom 
     public static void printFooter(){
         System.out.println ("\n\t*********************************************************");
     } // End of method
     
      // Next method for the printout of the shipping report
      public static void printOutput (){
      //prints the name, course, weight of package, distance, and the total cost
         System.out.println ("\n\t**************** Shipping Report ***********************");

      
         System.out.printf ("\n\t%-20s%-20s", "Name:",name);
         System.out.printf ("\n\t%-20s%-20s", "Course:",course);
         System.out.printf ("\n\t%-22s%-22d", "Weight of Package:",weightOfPackage);
         System.out.printf ("\n\t%-20s%-21d", "Distance:",distance);
         System.out.printf ("\n\t%-21s$%.2f%n", "Total Cost:", totalCost);
     
         System.out.println ("\n\t******************Have a Nice Day!***********************");
     } // End of method
     
     
     
   } // End of class