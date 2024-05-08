import java.util.Scanner;

public class TaskOne {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

int counter = 0;

int total = 0;

   while (counter < 10)  {
System.out.println("Enter a score");
  int number = input.nextInt();

      total += number;
  counter++;
     }
 System.out.printf("Sum of scores is %d", total);




}

}