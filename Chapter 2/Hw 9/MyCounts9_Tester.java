//****************************************************************
//Purpose:  A driver to process a text file.
//
//Input:    a text file
//
//Author:   Fares
//
//Course:   CS1301
//
//Date:     3/7/2017
//
//****************************************************************

import java.io.*;
import java.util.Scanner;

public class MyCounts9_Tester {
   public static void main (String [] args)throws IOException{
   //input text file
		File infile1 = new File ("data9.txt"); //text lines
		Scanner scan = new Scanner (infile1);
      
      MyCounts9 mg = new MyCounts9(scan);

      mg.myTeamInformation();
      
      mg.longestToken();
      
      mg.shortestToken();
      
      mg.countChars();
      
      mg.header();
      
      mg.displayOutput();
      
      mg.bonus();
            
   }

}