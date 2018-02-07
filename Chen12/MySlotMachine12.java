// imported scanner, randomizer to randomize the 6 objects
// , and array for the 6 objects.
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

// start and blueprint for the program
public class MySlotMachine12 {

// declarations
   public String [] pic = {"Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars"};
   public String [] pic2 = new String [3];
   public int randomNum;
   public int entry;
   public int count = 0;
   public double dollar = 0;
   public double amountEntered;
   public double winnings = 0;
   public int wins;
   public int losses;
   
   //-------------------------------------------------------------------------------
   // method begins game and invokes other methods
   //-------------------------------------------------------------------------------
      
   public void startGame() {
   
      Scanner scan = new Scanner(System.in);
       
      System.out.println("----------------------------------");  
      System.out.println("Welcome to the coin slot simulator!");
      System.out.print("Enter any number to begin (enter -1 to exit):\t");
      entry = scan.nextInt();
      
      while (entry != -1){
         System.out.print("Enter dollar amount:\t");
         dollar = scan.nextDouble(); 
         amountEntered += dollar;
         System.out.println();        
         playGame();
         resetValues();
         System.out.println("----------------------------------");
         System.out.print("Enter any number to try again (enter -1 to exit):\t");
         entry = scan.nextInt();
      }
      summary(); 
   }
   
   //-------------------------------------------------------------------------------
   //method does computations for winnings, wins, and losses
   //-------------------------------------------------------------------------------
   
   public void playGame() {
   
      Random rng = new Random();
      
      //populates an array with random values of another array
      for (int i = 0; i < 3; i++){
         randomNum = rng.nextInt(6);
         pic2[i] = pic[randomNum];
      }   
       
      //display populated array   
      for (int i = 0; i < 3; i++) 
         System.out.print(pic2[i] + "\t");
         
      //check entries   
      for (int i = 0; i < 2; i++)    
         if (pic2[i] == pic2[i+1])
            count++;
            
      if (count < 2 && pic2[0] == pic2[2])
         count++;      
      
      //1. increment winnings, wins, and losses
      //2. display information from gameplay
      if (count == 2) {
         winnings += dollar * 3;
         wins++;
         System.out.println("\nWe have a winner!!!");
         System.out.printf("You won $%-20.2f!", dollar * 3);
         System.out.println("\n----------------------------------\n");
      }
      else if (count == 1) {
         winnings += dollar * 2;
         wins++;
         System.out.println("\nWe have a winner!!!");
         System.out.printf("You won $%-20.2f!", dollar * 2);
         System.out.println("\n----------------------------------\n");
      }   
      else {
         losses++;
         System.out.println("\nSorry. Good luck next time");
         System.out.println("You won $0.00.");
         System.out.println("----------------------------------\n"); 
      }          
         
          
   }      
   
   //----------------------------------------
   //reset values critical for gameplay
   //----------------------------------------
   
   public void resetValues() {
      Arrays.fill(pic2, null);
      count = 0;    
   }
   
   //--------------------------------------------------
   //display cummulative stats gathered from gameplay
   //--------------------------------------------------
   
   public void summary() {
   
      System.out.print("\n----------------------------------");
      System.out.printf("\nAmount entered:\t\t$%-20.2f", amountEntered);
      System.out.printf("\nAmount won:\t\t$%-20.2f", winnings);
      System.out.printf("\nNumber of wins:\t\t%-20d", wins);
      System.out.printf("\nNumber of losses:\t%-20d", losses);
      System.out.print("\n----------------------------------");
   
   }   
} //end of class      
      