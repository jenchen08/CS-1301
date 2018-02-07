public class TimeSkeleton_Tester {
  public static void main(String[] args) {
    TimeSkeleton time1 = new TimeSkeleton();
    System.out.println("Hour: " + time1.getHour() + " Minute: " +
                       time1.getMinute() + " Second: " + time1.getSecond());

    TimeSkeleton time2 = new TimeSkeleton(555550000);
    System.out.println("Hour: " + time2.getHour() + " Minute: " +
                       time2.getMinute() + " Second: " + time2.getSecond());
  }
}

class TimeSkeleton {
  private int hour;
  private int minute;
  private int second;

  public TimeSkeleton() {
    this(System.currentTimeMillis());
  }

  public TimeSkeleton(long elapsedTime) {
    setTime(elapsedTime);
  }

  public TimeSkeleton(int hour, int minute, int second) {
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
