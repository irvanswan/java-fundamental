package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
  public static void main(String[] args) {
    // INSTANCE OBJECT
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();

    // FORMAT DATE
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
    String formattedDate = date.format(formatter);

    // CALCULATE
    LocalDate tomorrow = date.plusDays(1);
    LocalDate threeDaysAgo = date.minusDays(3);

    // PRINT
    System.out.println(date);
    System.out.println(time);
    System.out.println(dateTime);
    System.out.println(formattedDate);
    System.out.println(tomorrow);
    System.out.println(threeDaysAgo);
  }
}
