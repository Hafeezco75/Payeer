import java.util.Scanner;

import java.util.Arrays;

public class TaskOne  {

public static void main (String... args)  {

Scanner input = new Scanner(System.in);

int[] number = new int[10];

for(int count = 0; count <= 10 ; count++)  {
  System.out.println("Enter a score");
    number[count] = input.nextInt();
     }

for(int counter = 0; counter < number.length; counter++) {
   }
      System.out.println(Arrays.toString(number));
    

}

}