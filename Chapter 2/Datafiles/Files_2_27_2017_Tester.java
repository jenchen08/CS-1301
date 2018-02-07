//*************************************************************************
//Purpose:  Processing text files and ArrayLists
//
//Author:   Fares
//Date:     10/20/2015
//Course:   CS1301
//
//*************************************************************************
import java.util.*;
import java.io.*;
public class Files_2_27_2017_Tester {
   public static void main (String [] args) throws IOException {
      //Declarations
		//input file
      //data1
		File infile1 = new File ("data1_2_27_2017.txt"); //text lines
		Scanner scan1 = new Scanner (infile1);

      File_2_27_2017 object = new File_2_27_2017();
      
      object.read_text_file (scan1);

      File infile2 = new File ("data2_2_27_2017.txt"); //names & Scores
		Scanner scan2 = new Scanner (infile2);
      object.read_text_Integer_file(scan2);

    }
}