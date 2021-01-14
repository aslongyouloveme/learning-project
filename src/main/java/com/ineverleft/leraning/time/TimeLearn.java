package com.ineverleft.leraning.time;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * @Description @ClassName TimeLearn @Author ineverleft
 *
 * @date 2021.01.13 15:08
 */
public class TimeLearn {

  public static void main(String[] args) {
//
//    Instant instant = Instant.now();
//    System.out.println(instant.toEpochMilli());
//    LocalTime localTime = LocalTime.now();
//    LocalDateTime localDateTime = LocalDateTime.now();
//    LocalDate now = LocalDate.now();

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    System.out.println(dateTimeFormatter.format(LocalDateTime.now()));
    Clock clock = Clock.systemUTC();
    System.out.println(clock.millis());
    System.out.println(clock.getZone().getId());
    //DateTimeFormatter
    //  ZoneId.getAvailableZoneIds();
  }
}
