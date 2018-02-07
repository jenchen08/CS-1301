public class Location_Tester{

   public static void main (String [] args){
      double [][] table1 = {{12, 3, 15, 11},
                            {5, 20, 50, 4},
                            {33, 22, 19}};
                            
                            
      double [][] table2 = {{2, 3, 1, 11},
                            {5, 20, 4},
                            {33, 22}};

      displayTable (table1);
      Location loc1 = Location.locateLargest(table1);
      System.out.println ("Maximum Value " + loc1.getMaxValue() + " is located at (row,column): ( " + loc1.getRow() + ", " + loc1.getColumn() + " )");
      
      displayTable(table2);
      Location loc2 = Location.locateLargest (table2);
      System.out.println ("Maximum Value " + loc2.getMaxValue() + " is located at (row,column): ( " + loc2.getRow() + ", " + loc2.getColumn() + " )");
      
   }
   
   public static void displayTable (double [][] a){
      for (int r = 0; r < a.length; r++){
         System.out.println();
         for (int c = 0; c < a[r].length; c++){
            System.out.print (a[r][c] + "\t");
         }
      }
      System.out.println();
   }

}
                            