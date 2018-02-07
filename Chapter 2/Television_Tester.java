public class Television_Tester{

   public static void main (String [] args){
      Television t1 = new Television("Sharp", 60);
   
      System.out.println(t1);
   
      t1.increaseVolume();
   
      t1.setChannel(55);
   
      System.out.println (t1);
   
   }
}