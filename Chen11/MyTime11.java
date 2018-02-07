//**********************************************************************************
//Purpose: Using objects,getters, and methods
//
//Input:   The added time increments  
//
//Output:  The new time as time has been incremented by hour, minutes, or seconds  
//          
//Authors: Chuck Millsap and Jenny Chen
//
//Course:  CS1301B
//
//Date:    04/10/17
//
//Program: #11(MyTime11.java)
//***********************************************************************************
public class MyTime11 {

// declarations   
   int hour;
   int minute; 
   int second;

// Getting the time from the system but converting it to 
// milliseconds    
   public MyTime11() {
      this(System.currentTimeMillis());
   }

//*******************************************   
// Methpd that sets the new time
// gives the millisencond in hour, minute, 
// and seconds
//*******************************************   
   public MyTime11(long elapsedTime) {
    setTime(elapsedTime);
   }
// Getting the info from MyTime11 tester
   public MyTime11(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
  }
//*************************************************
// returning the value hours, minutes, and seconds
// from the tester
//*************************************************
  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }
  
  public void setTime(long elapsedTime) {
    // gets the total seconds since the midnight, Jan 1, 1970
    long totalSeconds = elapsedTime / 1000;

    // Compute the current second in the minute in the hour
    second = (int)(totalSeconds % 60);

    // gets the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    minute = (int)(totalMinutes % 60);

    // gets the total hours
    int totalHours = (int)(totalMinutes / 60);

    // Compute the current hour
    hour = (int)(totalHours % 24);
    
    }
//**********************************************
// no-argument constructor for incremented 
// seconds, minutes, and hour.
//**********************************************    
    public void incrementSecond(){
      second += 1;   
    }
  
    public void incrementMinute() {
      minute += 1;
    }
    
    public void incrementHour() 
      hour += 1;  
    }
//**********************************************
// overloaded methods that accepts any integer
// used if statement to check each incremented
// time value and calculated to add and change
// the right time
//**********************************************    
    public void incrementSecond(int i){
      if (second >= 60)
         second += (second + i) - 60;
         second += i;
    }
    
    public void incrementMinute(int i) {
      if (minute >= 60)
         minute += (minute + i) - 60;
         minute += i - 60;
         hour += 1;
    }
    
    public void incrementHour(int i) {
      hour += i;
      if (hour >= 24)
         hour -= 24;
         
    }
    
}// end of class    