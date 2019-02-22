package demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        LocalDate joshuaTree = LocalDate.of(1987, 3, 9);
        LocalDate rattleAndHum = LocalDate.of(1988,10,10);

        Period diff = Period.between(joshuaTree, rattleAndHum);
        int years = diff.getYears();
        int months = diff.getMonths();
        int days = diff.getDays();

       LocalDate newReleaseDate = LocalDate.of(
               rattleAndHum.plusYears(diff.getYears()).getYear(),
               rattleAndHum.plusMonths(diff.getMonths()).getDayOfMonth(),
               rattleAndHum.plusDays(diff.getDays()).getDayOfMonth());


        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println(String.format("Time Between Albums \nYear(s): %d \nMonths: %d\nDays: %d", years,months,days));
        System.out.println("");

        System.out.println("New Release Date: " + df.format(newReleaseDate));












    }
}

//Deliverable
//        1.
//        Calculate and print how many days, months, and years
//        have elapsed since U2 released their album,
//        The Joshua
//        Tree
//        .
//        2.
//        Calculate and print the amount of time between
//        The
//        Joshua Tree
//        and their next album,
//        Rattle and Hum
//        .
//        3.
//        Calculate and print the release date for a third album
//        that released the same amount of time after
//        Rattle and
//        Hum
//        .
//        The Joshua Tree
//        9 March 1987
//        Rattle and Hum
//        10 October 1988