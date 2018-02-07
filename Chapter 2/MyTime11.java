public class MyTime11 {
   private int hour;
   private int minute; 
   private int second;
   
   public MyTime11() {
      this(System.currentTimeMillis());

   }
   public MyTime11(long elapsedTime) {
    setTime(elapsedTime);
   }

   public MyTime11(int hour, int minute, int second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public int getSecond() {
    return second;
  }
  
  public void incrementSecond(){}
  
  public void setTime(long elapsedTime) {
    // Obtain the total seconds since the midnight, Jan 1, 1970
    long totalSeconds = elapsedTime / 1000;

    // Compute the current second in the minute in the hour
    second = (int)(totalSeconds % 60);

    // Obtain the total minutes
    long totalMinutes = totalSeconds / 60;

    // Compute the current minute in the hour
    minute = (int)(totalMinutes % 60);

    // Obtain the total hours
    int totalHours = (int)(totalMinutes / 60);

    // Compute the current hour
    hour = (int)(totalHours % 24);
    
    }
    

    

       
}    