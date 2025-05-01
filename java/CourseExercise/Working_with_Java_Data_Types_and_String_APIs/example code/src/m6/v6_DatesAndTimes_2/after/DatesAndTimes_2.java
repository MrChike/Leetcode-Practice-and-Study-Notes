package m6.v6_DatesAndTimes_2.after;
import static java.lang.System.out;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes_2 {

    public static void main(String[] args) {

        out.println("\n** Dates and Times, Part 2 ** \n");

        /* Create arbitrary local dates and times and time zoned date time */
        LocalDateTime localDateTime = LocalDateTime.of(
                2022,10,31,
                9,45);



		/* Create a DateTimeFormatter with format pattern */
        var pattern = DateTimeFormatter.ofPattern("EEEE, LLLL dd, yyyy 'at' hh:mm");
        String dateTimeString = localDateTime.format(pattern);
        out.println(dateTimeString); // Monday, October 31, 2022 at 09:45

        /* invalid pattern applied to Local Time */
        LocalTime localTime = LocalTime.of(
                9,45, 00,00);
        //dateTimeString = localTime.format(pattern);

    }
}
