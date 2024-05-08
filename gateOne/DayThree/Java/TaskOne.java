import java.lang.Math;

import java.util.Scanner;

public class TaskOne {

public static void main(String... args)  {

Scanner random = new Scanner(System.in);

double rand = Math.random();

int number = random.nextInt();

for(int count = 0; count < 12; count++)  {
     System.out.println("2 * 2");
      number = random.nextInt();

    if (number == 4)  {
      System.out.println("Correct");
    }
 else {
       System.out.println("Wrong");
    }


  for(int count = 0; count < 12; count++) {
    int check = (int)(Math.random()) + number;
   }

   

}

}