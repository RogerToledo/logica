package hackerRank;

import java.time.LocalDate;

public class DateTime {
    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015));
    }

    public static String findDay(int month, int day, int year) {
        LocalDate someDate = LocalDate.of(year, month, day);

        return someDate.getDayOfWeek().toString();
    }
}
