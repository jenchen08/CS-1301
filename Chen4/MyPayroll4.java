//*****************************************************************************************************************

// Purpose: The program computes how much the user worked overall based on the calculations. It prints a payroll 
//          report for overtime pay and regular pay.
//	
// Input:  The user has to enter name, course, hours worked, hourly rate,federal tax rate
//         and state tax rate.  
//
// Output: Compute gross pay, overtime pay, federal tax, state tax, and net pay.	
//
//	Author:  Jenny Chen
//	Date:	   1/30/2017
//	Class:   CS1301B
//	Program:	#4(MyPayroll4.java)

//*******************************************************************************************************************

// Import the Scanner to read the statements
import java.util.Scanner;

// Imports the exact date of when the program is running
import java.util.Date;

// Gave class a name (Blueprint of the program)
public class MyPayroll4{
   
   //***************************************************************
   // Declarations for each static variable
   // declare string for name and course
   // declare Date from the system
   // declare integer for hoursWorked and hourlyRate
   // declare double for federal tax rate, state tax rate, gross pay,
   // regular pay, overtime pay, federal tax, state tax, and net pay.
   //****************************************************************
   
   private static String name;
   private static String course;
   private static Date dateCreated;
   private static int hoursWorked;
   private static int hourlyRate;
   private static double federalTaxRate;
   private static double stateTaxRate;
   private static double grossPay;
   private static double regularPay;
   private static double overtimePay;
   private static double federalTax;
   private static double stateTax;
   private static double netPay;
   
   // Main method
   public static void main(String args[]){
      
      // methods within the main method 
      readData();
      calculations();
      printOutput();
   } // End Method
   
   // Implements the method (Reads the data for name, course, weight of package, and distance
   public static void readData() {

       // Reads the statements in the system.out.print
       Scanner scan = new Scanner (System.in); 
       
       // Reads the statements in the ()
       System.out.print ("Enter Name:\t");
       name= scan.nextLine();
       System.out.print ("Enter Course:\t");
       course= scan.nextLine();
       System.out.print ("Enter Hours Worked:\t");
       hoursWorked= scan.nextInt();
       System.out.print ("Enter Hourly Rate:\t");
       hourlyRate= scan.nextInt();
       System.out.print ("Enter Federal Tax Rate:\t");
       federalTaxRate= scan.nextDouble();
       System.out.print ("Enter State Tax Rate:\t");
       stateTaxRate= scan.nextDouble();
       
       // reads the date when running the program 
       dateCreated = new Date();
      } // end of readData method
      
   // Method for calculations
   public static void calculations() {
   
      //calculations for payroll
      //if statement for hours over 40 (Overtime) 
      if (hoursWorked > 40) {
          int overtimehours = hoursWorked - 40;
          regularPay = hourlyRate * (hoursWorked - overtimehours);
          overtimePay = (hoursWorked - 40) * (hourlyRate * 1.5); 
      }
      
      // pay under 40 (Regular pay)
      else{
      regularPay = hourlyRate * hoursWorked;
      }
      
      //calculations for payroll  
      grossPay = regularPay + overtimePay;
      federalTax = grossPay * federalTaxRate;
      stateTax = grossPay * stateTaxRate;
      netPay = grossPay - (federalTax + stateTax);
   
      //decimals into percent  
      federalTaxRate *= 100;
      stateTaxRate *= 100;
      
    } //end of calculation method
    
    // method to print output for the payroll report 
    public static void printOutput() { 
      
      //Method for report
      printHeader();
      
      //print out the calculations for each variable put in   
      System.out.printf ("\n\t%-30s%7d", "Hours Worked:", hoursWorked);
      System.out.printf ("\n\t%-30s%7d", "Hourly Rate:", hourlyRate);
      System.out.printf ("\n\t%-30s%10.2f%%", "Federal Tax Rate:", federalTaxRate);
      System.out.printf ("\n\t%-30s%10.2f%%", "State Tax Rate:", stateTaxRate);
      System.out.printf ("\n\t%-30s%10.2f", "Regular Pay:", regularPay );
      System.out.printf ("\n\t%-30s%10.2f", "Overtime pay:", overtimePay);
      System.out.printf ("\n\t%-30s%10.2f", "Gross Pay:", grossPay);
      System.out.printf ("\n\t%-30s%10.2f", "Federal Tax:", federalTax);
      System.out.printf ("\n\t%-30s%10.2f", "State Tax:", stateTax);
      System.out.printf ("\n\t%-30s%10.2f", "Net Pay:", netPay);
      System.out.printf ("\n");
      
      //Method for report  
      printFooter();
    
    } //end of printHeader method 
    
    // Method to printout the top of the report 
    public static void printHeader() {
      
      //printing out the statements in the ()
      System.out.println ("\n\t**************** Payroll Report ************************");
      System.out.printf ("\n\t%-20s%-20s", "Name:", name);
      System.out.printf ("\n\t%-20s%-20s", "Course:", course);
      System.out.printf ("\n\t%-20s%-20s", "Date:", dateCreated);
      System.out.printf ("\n");
      System.out.println ("\n\t*********************************************************");
    } //end of printHeader method 
    
    // Next method to print out the bottom of the report
    public static void printFooter() {
     
      // printing out the statements in the ()
      System.out.printf ("\n\t%-60s","*********************************************************");
      System.out.printf ("\n\t%1s%-54s%1s","*","","*");
      System.out.printf ("\n\t%-60s","*****************  Have a good day **********************");
    } //End of printFooter Method 
    
} // End of Class
     