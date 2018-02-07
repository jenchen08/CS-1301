//********************************************************************
// Purpose: Compute personal income taxes.
//
// Input:    Name, status, and annual income
//
// Output:   name, status, annual income, and tax due
//
// Author:  Jenny Chen
// Date:    2/7/17
// Course:  CS1301B
// Program: #5(MyIncomeTax5.java) 
//********************************************************************

// Gave class a name 
public class MyIncomeTax5 {

   //**********************************************	
   // declarations for each variable
   // declare string for name and status name
   // declare integer for status
   // declare double for annual Income and tax due
   //***********************************************
   public static String name;
	public static int status;
	public static String statusName;
	public static double annualIncome;
	public static double taxDue;

	// Main method 
   public static void main(String[] args) {
		// methods within the main method also we are
      // using the run args line
      readArguments(args);
		computeTax();
		printOutput();
	} // end of method

	// Implements next method which is the for
   // the run aruguments input
   public static void readArguments(String[] args) {
		// assigned each variable to a argument block
      name = args[0];
		status = Integer.parseInt(args[1]);
		annualIncome = Double.parseDouble(args[2]);
	} // end of args method

	// next method which includes the switch case
   public static void computeTax() {
		//************************************************
      // switch case determines which status bracket
      // you belong in depending on the number entered
      // in the read args line
      // the break means whatever that person enters
      // it exits and moves onto the next method
      //*************************************************
      switch (status) {
		case 0:
			statusName = "Single Filer";
			computeSingleFilers();
			break;
		case 1:
			statusName = "Married Filing Jointly";
         computeSingleFilers();
			computeMarriedFilingJointly();
			break;
		case 2:
			statusName = "Married Filing Separately";
			computeSingleFilers();
         computeMarriedFilingSeparately();
			break;
		case 3:
			statusName = "Head of Household";
			computeHeadOfHousehold();
			break;
		default:
			System.out.println(status + "\t is invalid status");
			System.exit(1);
		}// end of switch statement
	} // end of computeTax Method

	// Implements next method for calculations of 
   // a single filer
   public static void computeSingleFilers() {
		//***********************************
      // use if and else if statements to
      // determine which percent bracket
      // they are suppose to be in
      //**********************************
      if (annualIncome <= 9275) {
		   taxDue += annualIncome * 0.10;
	   } 
      else if ((annualIncome > 9276) && (annualIncome <= 37650)) {
			taxDue += 927.50 + (annualIncome - 9275) * 0.15;
		} 
      else if ((annualIncome > 37651) && (annualIncome <= 91150)) {
			taxDue += 5183.75 + (annualIncome - 37650) * 0.25; 
		} 
      else if ((annualIncome > 91151) && (annualIncome <= 190150)) {
			taxDue += 18558.75 + (annualIncome - 91150) * 0.28;		
      } 
      else if ((annualIncome > 190151) && (annualIncome <= 413350)) {
			taxDue += 46278.75 + (annualIncome - 190150) * 0.33;		
      } 
      else if ((annualIncome > 413351) && (annualIncome <= 415050)) {
			taxDue += 119934.75 + (annualIncome - 413350) * 0.35;
 		} 
      else if (annualIncome >= 415051) {
			taxDue += 120529.75 + (annualIncome - 415050) * 0.396; 
  		} 
	}// end of computing single filer method

	// next method for computing married or jointly
   public static void computeMarriedFilingJointly() {
      //*********************************************
      // multiply by two because there are two people
      // on the same taxes
      //*********************************************
      taxDue *= 2;
	} // end of coputing married method

   // next method for computing married separately
   public static void computeMarriedFilingSeparately() {
	   //**************************************
      // divide by two because two people
      // are filing separately
      //**************************************
      taxDue /= 2;
   } // end of computing married separately

	// next method for computing Head of Household
   public static void computeHeadOfHousehold() {
     	//***********************************
      // use if and else if statements to
      // determine which percent bracket
      // they are suppose to be in
      //**********************************
      if (annualIncome <= 13250) {
		   taxDue += annualIncome * 0.10;
	   } 
      else if ((annualIncome > 13251) && (annualIncome <= 50400)) {
			taxDue += 1325 + (annualIncome - 13250) * 0.15;
		} 
      else if ((annualIncome > 50401) && (annualIncome <= 130150)) {
			taxDue += 6897.50 + (annualIncome - 50400) * 0.25; 
		} 
      else if ((annualIncome > 130151) && (annualIncome <= 210800)) {
			taxDue += 26835 + (annualIncome - 130150) * 0.28;		
      } 
      else if ((annualIncome > 210801) && (annualIncome <= 413350)) {
			taxDue += 49417 + (annualIncome - 210800) * 0.33;		
      } 
      else if ((annualIncome > 413351) && (annualIncome <= 44100)) {
			taxDue += 116258.50 + (annualIncome - 413350) * 0.35;
 		} 
      else if (annualIncome >= 44100) {
			taxDue += 125936 + (annualIncome - 44100) * 0.396; 
      }
	} // end of computing head of household method

   // next method for printing output
	public static void printOutput() {
		// method within this method
      displayHeader();
		// printing out the person's input 
      System.out.printf("\n\t%-32s%-10s","Name:", name);
		System.out.printf("\n\t%-32s%-10s","Status:", statusName);
		System.out.printf("\n\t%-32s%-10.2f","Annual Income:", annualIncome);
		System.out.printf("\n\t%-33s%-10.2f","2016 estimated tax due:", taxDue);
		// method within this method
      displayFooter();
	} // end of print output method

	// next method for printing the top of the output
   public static void displayHeader() {

		System.out.println("\t************************************************************");
		System.out.println("\t**                                                        **");
		System.out.println("\t**      Estimating 2016 Personal Federal Income Tax       **");
		System.out.println("\t**                                                        **");
		System.out.println("\t**      CS1301                                            **");
		System.out.println("\t**                                                        **");
		System.out.println("\t**      2/5/17                                            **");
		System.out.println("\t**                                                        **");
		System.out.println("\t************************************************************");
	} // end of this method
   
   // next method for printing the end of the output
	public static void displayFooter() {
		System.out.println("\n\n\t************************************************************");
		System.out.println("\t**                                                        **");
		System.out.println("\t**      It is needed but not fun to pay taxes             **");
		System.out.println("\t**                                                        **");
		System.out.println("\t**      Have a good day                                   **");
		System.out.println("\t**                                                        **");
		System.out.println("\t************************************************************");
	} //end of method

}// end of class