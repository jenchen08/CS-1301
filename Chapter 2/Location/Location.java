//*******************************************************************************
//Purpose:  Practice with Classes and Objects
//          Location of largest value in two-dimensional array.
//          Row,Column, and largest value
//
//Author:   Fares
//
//Course:   CS 1301
//
//Date:     4/12/2017
//
//*******************************************************************************
public class Location{
   private int row;           //row of largest value
   private int column;        //column of largest value
   private double maxValue;   //largest value
   
   //****************************************************************************
   //no-argument constructor
   //****************************************************************************
   public Location (){
   }
   
   //****************************************************************************
   //getRow accessor
   //****************************************************************************
   public int getRow(){
      return row;
   }
   
   //****************************************************************************
   //getColumn accessor
   //****************************************************************************
   public int getColumn(){
      return column;
   }

   //****************************************************************************
   //getMaxValue accessor
   //****************************************************************************
   public double getMaxValue(){
      return maxValue;
   }
   
   //****************************************************************************
   //setRow mutator
   //****************************************************************************
   public void setRow(int row){
      this.row = row;
   }
   
   //****************************************************************************
   //setColumn mutator
   //****************************************************************************
    public void setColumn(int column){
      this.column = column;
   }

   //****************************************************************************
   //setMaxValue mutator
   //****************************************************************************
    public void setMaxValue(double maxValue){
      this.maxValue = maxValue;
   }
   
   //****************************************************************************
   //static method that create an object of Location, finds row, column, and max value
   //       and assigns to local Location object and then return that object
   //****************************************************************************
   public static Location locateLargest (double [][] a){
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

   //****************************************************************************
   //toString. Returns Location data fields values
   //****************************************************************************
   public String toString(){
      String result = "Maximum Value " + maxValue + " is located at (row,column): ( " + row + ", " + column + " )";
      return result;
   }
} 
   
