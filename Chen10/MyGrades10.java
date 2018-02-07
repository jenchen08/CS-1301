//*******************************************************************************
//Purpose:  Using one-dimensional and two-dimensional arrays. Reading info
//          from a text file. 
//
//Input:    Any text file
//
//Output:   Information regarding the text file.
//          
//Authors:  Chuck Millsap and Jenny Chen
//
//Course:   CS1301B
//
//Date:     03/29/17
//
//Program:  #10(MyGrades10.java)
//**************************************************************************

// The scanner imports into class
import java.util.Scanner;

// Blueprint and gave the class a name 
public class MyGrades10 {
	// Declarations
	private String courseName;
	private String instructorName;
	private int numberOfStudents;
	private int numberOfTests;
	private String school;
	private String semester;
	private int year;
	private String[] names;
	private int[][] scores;
	private int[] studentTotals;
	private char[] grades;
	private double[] testAverages;
	private int lowestScoreIndex;
	private int highestScoreIndex;
	private Scanner infile;

	// **********************************************************************
	// Constructor: Reads the text file and uses arrays/methods
	// **********************************************************************
	public MyGrades10(Scanner scan) {

      readCourseInfo(scan);

		// Declaring needed arrays
		names = new String[numberOfStudents];
		scores = new int[numberOfStudents][numberOfTests];
		grades = new char[numberOfStudents];
		studentTotals = new int[numberOfStudents];
		testAverages = new double[numberOfTests];

		readRecords(scan);

		computeStudentsTotals();
		computeGrades();
		computeTestAverages();
		findStudentWithHighestTotal();
		findStudentWithLowestTotal();
		displayOutput();

	}

	//*************************************************
   // Reads the course info of any file
   // the method scan from the file
   //*************************************************
   private void readCourseInfo(Scanner infile) {
		courseName = infile.nextLine();
		instructorName = infile.nextLine();
		school = infile.nextLine();
		semester = infile.next();
		year = infile.nextInt();
		numberOfStudents = infile.nextInt();
		numberOfTests = infile.nextInt();
	}

	//*************************************************
   // reading students name and  test scores 
   // and scans from any file
   //*************************************************
	private void readRecords(Scanner infile) {
		for (int i = 0; i < numberOfStudents; i++) {
			names[i] = infile.next();
			for (int j = 0; j < numberOfTests; j++)
				scores[i][j] = infile.nextInt();
		}

	}
   //*************************************************
   // Computes the test scores and gives the
   // results of total scores
   //*************************************************
	public void computeStudentsTotals() {
		int sum;
		for (int j = 0; j < scores.length; j++) {
			sum = 0;
			for (int k = 0; k < scores[j].length; k++) {
				sum += scores[j][k];
				studentTotals[j] = sum;
			}

		}
	}

	// **********************************************************************
	// computeGrades: This goes through the list of test scores and total to 
   // add a letter grade next to it
	// **********************************************************************
	public void computeGrades() {
		char g;
		double t;
		for (int i = 0; i < numberOfStudents; i++) {
			t = (double) studentTotals[i] / numberOfTests;
			if (t >= 90)
				g = 'A';
			else if (t >= 80)
				g = 'B';
			else if (t >= 70)
				g = 'C';
			else if (t >= 60)
				g = 'D';
			else
				g = 'F';
			grades[i] = g;
		}

	}

	// **********************************************************************
	// computeTestAverage: This computes the average of each test scores
	// **********************************************************************
	public void computeTestAverages() {
		int sum;
		for (int j = 0; j < numberOfTests; j++) {
			sum = 0;
			for (int i = 0; i < scores.length; i++) {
				sum += scores[i][j];

			}
			testAverages[j] = (double) sum / scores.length;
		}
	}

	// **********************************************************************
	// findStudentWithHighestTotal: This find the highest score
	// through the text file by using
	// a for loop, if statement, and arrays
	// **********************************************************************
	public void findStudentWithHighestTotal() {
		int max = 0;
		int sum;
		for (int j = 0; j < scores.length; j++) {
			sum = 0;
			for (int k = 0; k < scores[j].length; k++) {
				sum += scores[j][k];
				studentTotals[j] = sum;
				if (sum > max) {
					max = sum;
					highestScoreIndex = j;
				}

			}
		}
	}

	// **********************************************************************
	// findStudentWithLowestTotal: This find the lowest score
	// through the text file by using
	// a for loop, if statement, and arrays
	// **********************************************************************
	public void findStudentWithLowestTotal() {
		int min = scores[0][0];
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++)
				if (scores[i][j] < min) {
					min = scores[i][j];
					lowestScoreIndex = i;
				}
		}

	}

	// **********************************************************************
	// displayOutput: Displays the info from text file
	// also displays grades, average, and highest and lowest
	// scores.
	// **********************************************************************
	public void displayOutput() {

		displayHeader();
		displayStudentsRecords();
		displayFooter();

	}

	// **********************************************************************
	// displayHeader: This displays the course, instructor, semester,
	// year, school name, number, name for students, number of tests, total, 
   // and grade.
	// **********************************************************************
	public void displayHeader() {
		System.out.println("\tCourse Name:      \t" + courseName);
		System.out.println("\tInstructor's Name:\t" + instructorName);
		System.out.println("\tSemester:         \t" + semester);
		System.out.println("\tYear:             \t" + year);
		System.out.println("\tSchool Name:      \t" + school + "\n");
		System.out.printf("%-8s%-10s", "Number", "Name");

		//*****************************************************************
      // used for loop to count how many number of tests are in the file
      // to print
      //***************************************************************** 
      for (int i = 1; i < numberOfTests + 1; i++) {
			String testNum = Integer.toString(i);
			System.out.printf("Test" + i + "     ");
		}
		System.out.printf("%-9s%8s", "Total", "Grade");
	}

	// *********************************************************************************
	// displayStudentsRecords: Displays numbers, student's name, test scores, total, and
	// grades
	// *********************************************************************************
	public void displayStudentsRecords() {
		// display labels
		String n;
		int s;
		char a;
		int t;
		for (int i = 0; i < numberOfStudents; i++) {
			n = names[i];
			t = studentTotals[i];
			a = grades[i];
			System.out.printf("\t\n %-7d%-12s", i, n);
			for (int j = 0; j < numberOfTests; j++) {
				s = scores[i][j];
				System.out.printf("%-10d", s);
			}
			System.out.printf("%-10d%-15c", t, a);

		}
		System.out.println("\n");
	}

	// ****************************************************************************
	// displayFooter: Displays test average, Highest test scores (total) with the grade
	// , and lowest test scores (total) with the grade.
	// *****************************************************************************
	public void displayFooter() {
		double avg;
		System.out.printf("%-9s", "AVERAGES:");
		
      // used for loop to display the average under the test scores of the file  
      for (int i = 0; i < numberOfTests; i++) {
			avg = testAverages[i];
			System.out.printf(" %12.2f", avg);
		}
		System.out.println("\n");

		System.out.printf("%10s%6s", "\tStudent with lowest average:\n\t", names[lowestScoreIndex]);

		// used nested for loop to display the lowest scores based on each test scores of any file
      for (int j = lowestScoreIndex; j < lowestScoreIndex + 1; j++) {
			for (int k = 0; k < numberOfTests; k++) {
				String s = Integer.toString(scores[j][k]);
				System.out.print("     " + s + "    ");
			}
		}
		System.out.printf("%7d%8c", studentTotals[lowestScoreIndex], grades[lowestScoreIndex], "\n\n");

		System.out.printf("\n%10s%6s", "\n\tStudent with highest average:\n\t", names[highestScoreIndex]);
		
      // used nested for loop to display the highest scores based on each test scores of any file
      for (int j = highestScoreIndex; j < highestScoreIndex + 1; j++) {
			for (int k = 0; k < numberOfTests; k++) {
				String s = Integer.toString(scores[j][k]);
				System.out.print("   " + s + "    ");
			}
		}

		System.out.printf("%7d%8c", studentTotals[highestScoreIndex], grades[highestScoreIndex], "\n\n");
		System.out.println("\n");
	}// end of displayFooter

}// end of class
