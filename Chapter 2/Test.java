public class Test{
   public static void main (String [] args){
     int [] numbers = {10, 5, 100, 12};
      mystery1(numbers);
      mystery2(numbers);
   }
   public static void mystery1(int [] numbers) {
      int temp;
     for (int i = numbers.length -2; i >= 0; i--) {
         for (int j= 0; j <= i; j++)
            if (numbers [j] < numbers [j+1]) {
               temp = numbers [j];
               numbers [j] = numbers [j+1];
               numbers [j+1] = temp;
            } 
      }
      numbers [0] = -9;
      numbers [numbers.length-1] = 99; 
   } // method mystery1



   public static void mystery2 (int[] list) {
      for (int i = 0; i < list.length; i++)
         System.out.print (list[i] + "\t");
   }
} // class FigureOut

