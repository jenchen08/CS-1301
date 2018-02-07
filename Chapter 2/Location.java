public class Location {

   private int row;
   private int column;
   private double maxValue;
   
   public Location(){
   }
   
   public int getRow(){
      return row;
   }
   
   public int getColumn(){
      return column;
   }
   
   public double getMaxValue(){
      return maxValue;
   }
   
   public void setRow(int row){
      this.row = row;
   }
   
   public void setColumn(int column){
      this.column = column;
   }
   
   public void setMaxValue(double maxValue){
      this.maxValue = maxValue;
   }
   
   public static Location locateLargest(double [][] a){
      Location loc = new Location();
      loc.setMaxValue(a[0][0]);
      for (int r = 0; r < a.length; r++){
         for (int c = 0; c < a[r].length; c++){
            if (a[r][c] > loc.getMaxValue()){
               loc.setMaxValue(a[r][c]);
               loc.setRow(r);
               loc.setColumn(c);
            }
         }
      }
      return loc;
   }
   
   public String toString(){
      String result = "Maximum Value " + maxValue + " is located at (row,column): ( " + row + ", " + column + " )";
      return result;
   }
} 
