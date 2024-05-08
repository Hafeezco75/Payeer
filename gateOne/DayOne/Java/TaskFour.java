import java.util.Scanner;

public class TaskFour {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

int counter = 0;

int total = 0;

while (counter < 10)  {
System.out.println("Enter a score");
  int number = input.nextInt();
    if (counter % 2 == 0)  { 
        
    total += counter;
    }
    counter++;
      }
  System.out.printf("Sum of even scores is %d", total);
    

}

}