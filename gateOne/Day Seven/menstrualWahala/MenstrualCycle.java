import java.util.Scanner;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

import java.time.format.DateTimeformatter;

public class MenstrualCycle {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

System.out.println("=====================================================");

System.out.println("Welcome to Your EverInteractive Menstrual Cycle App");

LocalDate formatter =              

System.out.println("What is the Start date of your period,Enter in the format:(dd-MM-yyyy) ");
    String startDate = input.next();

System.out.println("What is the average length of your menstrual cycle");
   int length = input.nextInt();

int ovulationTime = length / 2;

LocalDate startDay = LocalDate.parse(startDate,formatter);

int periodToFertility = 8;

int lengthToSafePeriod = 19;

LocalDate ovulationLength = localDate.plusDays(ovulationTime);

LocalDate fertile = localDate.plusDays(periodToFertility);

LocalDate safetime = localDate.plusDays(lengthToSafePeriod);

long noOfDaysBetween = ChronoUnit.DAYS.between(localDate, after);


LocalDate nextFlow = localDate.plusDays(length);

System.out.print("\n");

System.out.println("if your menstrual cycle is " + length + "\n");

System.out.println("Your estimated fertile window is " + fertile + " to " + after + "\n");

System.out.println("Your Estimated Ovulation date is " + ovulationTime);

System.out.println("Your Safe period is " + safetime);

System.out.println("Your Next Flow Date is " + nextFlow);

System.out.print("\n\n");

System.out.println("SAFETY CONCLUSION: You are most likely to get Pregnant, if you have sex without birth control a few days before your ovulation date.");

System.out.println("======================================================");

 

}

}