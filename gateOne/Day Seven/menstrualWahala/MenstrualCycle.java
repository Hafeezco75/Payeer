import java.util.Scanner;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class MenstrualCycle {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

System.out.println("=====================================================");

System.out.println("Welcome to Your EverInteractive Menstrual Cycle App");

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");          

System.out.println("When is the last day of your last period, Enter in the format:(dd/MM/yyyy) ");
    String lastDate = input.next();

System.out.println("What is the Start date of your period,Enter in the format:(dd/MM/yyyy) ");
    String startDate = input.next();

System.out.println("What is the average length of your menstrual cycle");
   int length = input.nextInt();

int ovulationTime = length / 2;

LocalDate startDay = LocalDate.parse(startDate, formatter);

LocalDate lastDay = LocalDate.parse(lastDate, formatter);

LocalDate ovulationLength = lastDay.plusDays(ovulationTime);

LocalDate fertile = ovulationLength.minusDays(6);

LocalDate safetime = lastDay.plusDays(9);

LocalDate safeLength = startDay.minusDays(10);

System.out.print("\n");

System.out.println("if your menstrual cycle is " + length + "\n");

System.out.println("Your estimated fertile window is " + fertile + " to " + ovulationLength  + "\n");

System.out.println("Your Estimated Ovulation date is " + ovulationLength + "\n");

System.out.println("Your Safe period is " + lastDay + " to " + safetime + " and " + safeLength + " to " + startDay);

System.out.print("\n\n");

System.out.println("SAFETY CONCLUSION: You are most likely to get Pregnant, if you have sex without birth control a few days before your ovulation date.");

System.out.println("======================================================");

 

}

}