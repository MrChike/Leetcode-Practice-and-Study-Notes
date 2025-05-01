package m6.v5_DatesAndTimes_1.after;
import static java.lang.System.out;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes_1 {

    public static void main(String[] args) {

        out.println("\n** Dates and Times, Part 1 ** \n");

        /* Create current local dates and times and time zoned date time */
        LocalDate localDate = LocalDate.now();

        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.now();

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        /* Create a LocalDate for an arbitrary date */
        localDate = LocalDate.of(2022,10,31);
        out.println(localDate); //  2022-10-31

        /* Create a LocalTime for an arbitrary time */
        localTime = LocalTime.of(9,45, 00,00);
        out.println(localTime); // 09:45

        /* Create a LocalDateTime for an arbitrary date and time*/
        localDateTime = LocalDateTime.of(
                2022,10,31,
                9,45);
        out.println(localDateTime); // 2022-10-31T09:45

        /* Create a ZonedDateTime for an arbitrary date and time */
        zonedDateTime = ZonedDateTime.of(
                2022,10,31,
                9,45,00,00,
                ZoneId.of("America/Chicago"));
        out.println(zonedDateTime); // 2022-10-31T09:45-85:00[America/Chicago]

        /* Create a date time string using LocalDateTime methods */
        String dateTimeString = ""
                +localDateTime.getDayOfWeek() + " "
                +localDateTime.getMonth() + " "
                +localDateTime.getDayOfMonth() + " "
                +localDateTime.getYear() + " at "
                +localDateTime.getHour() + ":"
                +localDateTime.getMinute();
        out.println(dateTimeString); // MONDAY OCTOBER 31 2022 at 9:45

        /* Format a LocalDateTime using the DateTimeFormatter */
        dateTimeString = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        out.println(dateTimeString); // 2022-10-31T09:45

        /* Attempt to format a LocalDateTime using an invalid ISO constant */
        // String str = localTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
