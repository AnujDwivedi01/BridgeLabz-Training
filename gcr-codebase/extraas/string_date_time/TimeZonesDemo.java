// java program for date and time in different zones

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesDemo {
    public static void main(String[] args) {

        // get current date-time in GMT 
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));

        // get current date-time in IST 
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // get current date-time in PST 
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // display times
        System.out.println("Current Time in GMT : " + gmt);
        System.out.println("Current Time in IST : " + ist);
        System.out.println("Current Time in PST : " + pst);
    }
}
