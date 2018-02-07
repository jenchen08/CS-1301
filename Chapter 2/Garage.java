// Lab: Garage.java

// Program calculates charges for parking
import java.util.Scanner;

	public class Garage
   {
	// begin calculating charges
	public void startCharging()
	{
   	Scanner input = new Scanner( System.in );
   
   	double totalReceipts = 0.0;   // total fee collected for the day
   	double fee;                   // the charge for the current customer
   	double hours;                 // hours for the current customer
      String name;
   	// read in the first customer's name and hours
   	      System.out.print(
   	"Enter number of hours (a negative to quit): " );
   	hours = input.nextDouble();
      input.nextLine();
   	
      while ( hours >= 0.0 )
      	{
         System.out.print("Enter your name: ");
         name = input.nextLine();

      	/* 1. Write code here to calculate the fee and assign it to the variable fee */
         fee = calculateCharges (hours);
         /* 2. Write code here to calculate the total receipts */
         totalReceipts += fee;
      	System.out.printf(
      	"Name:%s, Hours: %.2f, Current charge: $%.2f", name, hours,
      	fee);
      
      	// read in the next customer's hours
      	System.out.print(
      	"Enter number of hours (a negative to quit): " );
      	hours = input.nextDouble();
         input.nextLine();
   	} // end while loop
	} // end method startCharging

   	// determines fee based on time
   	/* 3. Write the header for the calculateCharges method */
      public double calculateCharges (double hours){
         
      	// apply minimum charge
      	/* 3.1   Write a line of code that declares and initializes a variable
      	with the minimum charge of $2 */
         double charge = 2;
                  
      	// add extra fees as applicable
      	/*3.2 Write an if statement that determines whether hours is greater
      	than 3.0 and, if so, calculates the additional charge. */
         if (hours > 3)
            charge = 2.0 + 0.5 * Math.ceil(hours - 3);

               
      	// apply maximum value if needed
      	/*3.3 Write code here that determines whether the 10 hour maximum has been reached
      	and if so sets the maximum charge */
         if (charge > 10) 
            charge = 10; 
                     
      	/*3.4  Write a line of code that returns the calculated charge */
         return charge;
        
      } // end method calculateCharges
      
}