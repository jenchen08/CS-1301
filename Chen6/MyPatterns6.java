//********************************************************************
// Purpose: Learn how to use loops to print patterns.
//
// Input:   Which pattern we want and how many lines we want.
//
// Output:  Pattern of the numerical triangle/pyramid
//
// Author:  Jenny Chen
// Date:    2/14/17
// Course:  CS1301B
// Program: #6(MyPattern6.java) 
//********************************************************************
// Gave the class a name
public class MyPatterns6 {
	// Main method
   public MyPatterns6() {
	} // end of method

   // start of pattern one method
	public void displayPatternI(int lines) {
		// prints title of the pattern
      System.out.println("\n\tPattern I\n");
		//*******************************************
      // use for loop to have the input of lines
      // to print of the numbers until it is 
      // false then it breaks from the loop
      //********************************************
      for (int i = 1; i <= lines; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			// prints the pattern in the right alignment
         System.out.println();
		} // end of nest loop
	}// end of first pattern

   // start of pattern two method
	public void displayPatternII(int lines) {
		// prints title of the pattern
      System.out.println("\n\tPattern II\n");
		//*******************************************
      // use for loop to have the input of lines
      // to print of the numbers until it is 
      // false then it breaks from the loop
      //********************************************
      for (int i = lines; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			// prints the pattern in the right alignment
         System.out.println();
		} // end of nest loop
	} // end of second pattern method

   // Start of third pattern method
	public void displayPatternIII(int lines) {
      // prints out title of the pattern
		System.out.println("\n\tPattern III\n");
		//*******************************************
      // use for loop to have the input of lines
      // to print of the numbers until it is 
      // false then it breaks from the loop
      // added an extra loop for spaces
      //********************************************
      for (int i = 1; i <= lines; i++) {
			System.out.println();
			for (int k = 1; k <= lines - i; k++)
				System.out.print(" ");
			for (int j = lines - i + 1; j <= lines; j++)
				System.out.print(j);

		} // end of nest loop
      // prints the alignment
      System.out.println();
	} // end of third pattern method

   // start of fourth pattern method
	public void displayPatternIV(int lines) {
		// prints out title for pattern
      System.out.println("\n\tPattern IV\n");
		//*******************************************
      // use for loop to have the input of lines
      // to print of the numbers until it is 
      // false then it breaks from the loop
      // added another loop for spaces
      //********************************************
      for (int i = 1; i <= lines; i++) {
			System.out.println();
			for (int k = 1; k <= lines - i; k++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print(j);
            
		} // end of nest loop
      System.out.println();
	} // end of fourth pattern method

	// Start of fifth pattern method
   public void displayPatternV(int lines) {
      // prints out title for pattern
		System.out.println("\n\tPattern V\n");
		//*******************************************
      // use for loop to have the input of lines
      // to print of the numbers until it is 
      // false then it breaks from the loop
      // added another loop for spaces
      // added another loop to print left and right side 
      // of the pyramid
      //********************************************
      for (int i = 1; i <= lines; i++) {
			for (int k = 1; k <= lines - i; k++) {
				System.out.print("  ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			for (int g = 2; g <= i; g++) {
				System.out.print(g + " ");
			}
			System.out.println();
		} // end of nest loop

	} // end of fifth pattern method

   // start of sixth pattern method
	public void displayPatternVI(int lines) {
		// prints out title of pattern
      System.out.println("\n\tMy Own Pattern\n");
		//*******************************************
      // use for loop to have the input of lines
      // to print of the numbers until it is 
      // false then it breaks from the loop
      // use if and else statements to only use zeros
      // and ones 
      // if true of no remainder then it prints zero
      // if false then prints ones
      //********************************************
      for (int i = 2; i <= lines; i++) {
			for (int j = 2; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(0);
				} else {
					System.out.print(1);
				}
			}
			// prints pattern in right alignment
         System.out.println();
		} // end of nest loop
	} // end of sixth pattern method

} // end of class

