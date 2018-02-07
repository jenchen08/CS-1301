public class One_D_Example_3_1_2017_Tester{
   public static void main (String [] args){
      
      int [] list1 = new int [5];
      int [] list2 = new int [23];
      
      One_D_Example_3_1_2017 a1 = new One_D_Example_3_1_2017();
      
      a1.populate(list1);
      
      a1.display(list1);
     
      a1.populate(list2);
      
      a1.display(list2); 
      
      System.out.println("\n\tThe Sum of list 1 id:\t" + a1.sum(list1));
      System.out.println("\n\tThe Sum of list 2 id:\t" + a1.sum(list2));
   }
}