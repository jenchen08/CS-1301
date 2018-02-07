// ************************************************************
// Purpose: Classes and Objects for TV
// Author: Jenny Chen 
// Class: CS1301 B
// Date: 2/22/17
//************************************************************
public class Television{

   // declarations
   private final String MANUFACTURER;
   private final int SCREEN_SIZE;
   private boolean powerOn = false;
   private int channel = 2;
   private int volume = 20;

   // Constructor 
   public Television (String brand, int size){
      MANUFACTURER = brand;
      SCREEN_SIZE = size;
   }

   // Mutator
   public void setChannel (int station){
      channel = station;
   }
   
   public void power(){
      powerOn = !powerOn;
   }
   
   public boolean getPower(){
      return powerOn;
   }
   
   public void increaseVolume(){
      volume = (volume + 1) % 31;
    
   }
   
   public void decreaseVolume(){
      volume = (volume == 0)?0:--volume;
   
   }
   
   public int getChannel(){
      return channel;
   }
   
   public int volume(){
      return volume;
   }
   
   public String getManufacturer(){
      return MANUFACTURER;
   }
   
   public int getScreenSize(){
      return SCREEN_SIZE;
   }
   
   public String toString(){
      String result;
      result = "\n\tManufacturer: \t" + MANUFACTURER +
               "\n\tScreen Size: \t" + SCREEN_SIZE +
               "\n\tPower: \t" + powerOn +
               "\n\tChannel: \t" + channel +
               "\n\tVolume: \t" + volume;
      return result;
      
      }
 }