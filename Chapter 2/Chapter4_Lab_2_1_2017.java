//*******************************************************************************
//Purpose:  
//          1. Using command-line arguments
//          2. Using String method charAt(i)
//          3. Using switch or nested if statements
//
//          Program reads two characters and displays the major and status 
//          represented in the characters.
//          The first character indicates the major and the second is a number 
//          character 1, 2, 3, 4, which indicates whether a student is freshman,
//          sophomore, junior, or senior. Suppose the following characters are 
//          used to denote the majors:
//
//          M: Mathematics
//          C: Computer Science
//          I: Information Technology
//
//          Here is a sample run:
//
//    M1
//    Mathematics Freshman
//
//    C3
//    Computer Science Junior
//
//    T3
//    Invalid input
//
//    Expand documentation
//
//*******************************************************************************
public class Chapter4_Lab_2_1_2017{

   public static void main (String [] args){
     // declarations (instead of null you can put "")
     String code;
     String majorName = null;
     String statusName = null;
     char major;
     char status;
     code = args[0];
     major = code.charAt(0);
     status = code.charAt(1);
     
     //determine major
     switch (major){
     
      case 'M':
      case 'm': majorName = "Mathematics";
                break;
      case 'C':
      case 'c': majorName = "Computer Science";
                break;
      case 'I':
      case 'i': majorName = "Information Technology";
                break;
      
      default: System.out.println (major + "is invalid major code");
         System.exit(0);
         break;  
   }
   
   //determine status 
   switch (status){
      
      case '1': statusName = "Freshman";
                break;
 
      case '2': statusName = "Sophomore";
                break;
     
      case '3': statusName = "Junior";
                break;
      
      case '4': statusName = "Senior";
                break;
               
      default: System.out.println (status + "is invalid status code");
      
   }
   
   System.out.printf("\n\t%-20s%-10s","Entered code:",code);
   System.out.printf("\n\t%-20s%-10s","Major code:",major);
   System.out.printf("\n\t%-20s%-10s","Status code:",status);
   System.out.printf("\n\t%-20s%-30s%-30s","Output message:",majorName,statusName);
   
   }
   
}
      
 
 
   
   



   
   
   
