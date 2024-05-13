import java.util.Arrays;

import java.util.Scanner;

public class StudentGrade {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

System.out.println("How many students do you have? ");
   int students = input.nextInt();

System.out.println("How many subjects do they offer? ");
   int subjects = input.nextInt();

System.out.println("Saving  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

System.out.println("Saved successfully ");

int[][] numbers = new int[students][subjects];

    int total = 0;

    int average = 1;

  for (int i = 0; i < students; i++) {
     for (int j = 0; j < subjects; j++) {
System.out.printf("Entering score for student %d%n", i+1);
   
System.out.printf("Enter score for subject %d%n", j + 1);
    numbers[i][j] = input.nextInt();

   if (numbers[i][j] <= 100) {
	continue;
     }
 System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> ");

System.out.println("Saved successfully ");
    }
 }
  
System.out.println("===================================================");

System.out.printf("STUDENT\t");

    for (int k = 0; k < subjects; k++) {

System.out.printf("\tSUB", "%2s", k+1);
    }
System.out.println("\tTOT\tAVE\tPOS");
   
 System.out.println("===================================================");
  
    for(int i = 0; i < numbers.length; i++) {

       System.out.printf("Student %d\t", i + 1);

    for (int count = 0; count < numbers[subjects].length; count++) {

      System.out.print(numbers[i][count] + "     ");

	 total += numbers[i][count];

      }

     System.out.printf(total + " ");
     
    System.out.println();
     }

System.out.println("================================================");

System.out.println("================================================");
  


public static int[] fill Array(int[] input)

[50,70,10,12,100}

fillArray(input)

if (counter > count) {

fillArray += i;


}

}