import java.util.Scanner;

public class TaskTwo {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

int counter = 0;

int sum = 0;

int average = 0;

while (counter < 10)  {
System.out.println("Enter a score");
  int number = input.nextInt();
      sum += number;

      average = sum / number;
  counter++;
      }
 System.out.printf("Average of scores is %d", average);
    


}

}