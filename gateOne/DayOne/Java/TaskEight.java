import java.util.Scanner;

public class TaskEight {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

int counter = 0;

int total = 0;

while (counter < 10)  {
 System.out.println("Enter a score");
  int number = input.nextInt();

  if (number > 100)  {
     boolean result = false;
    }
  if (number <= 100)  {
     boolean result = true;
    }

         total += number;
    counter++;
     }
   System.out.printf("Sum of valid scores is %d", total);

}

}