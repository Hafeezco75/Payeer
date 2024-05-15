import java.util.Scanner;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import java.time.YearMonth;

public class MenstrualCycle {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

System.out.println("=================================================");

System.out.println("Welcome to Your EverInteractive Menstrual Cycle App");

System.out.println("What is the Start date of your period,Enter in the format:(YYYY-MM-DD) ");
    String startDate = input.next();

int lengthToOvulation = 13;

int periodToFertility = 8;

LocalDate localDate = LocalDate.parse(startDate);

LocalDate after = localDate.plusDays(lengthToOvulation);

LocalDate fertile = localDate.plusDays(periodToFertility);

long noOfDaysBetween = ChronoUnit.DAYS.between(localDate, after);

System.out.println("What is the average length of your menstrual cycle");
   int length = input.nextInt();


System.out.println("if your menstrual cycle is " + length);

System.out.println("Your estimated fertile window is " + fertile + " - " + after);

System.out.println("Your estimated ovulation date is " + after);

//System.out.println("Your safe period is " + );

System.out.println("You are most likely to get pregnant if you have sex without birth control a few days before your ovulation date.");

System.out.println("===================================================");

 

}

}