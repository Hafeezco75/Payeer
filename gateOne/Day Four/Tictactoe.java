import javax.swing.*;

import java.util.Scanner;

public class Tictactoe {

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

new Tictactoe();

Object row[][] = new Object[3][3];

Object[] type = {"X","O"};

int[][] array = new int[3][3];

for (int count = 0; count < array.length; count++) {

    System.out.println("Enter either X or O ");
	int userInput = input.nextInt();

     for (int counter = 0; counter < array.length; counter++) {
  System.out.println("Enter rows and column where you want to select between 1 t0 9");
            array[count][counter] = input.nextInt();

      if (array[0][0] == 1)  {
       System.out.println("X");
       }
      else {
        System.out.print("O");
        }
    
   if (array[0][1] == 2 )  {
      System.out.print("X");
     }
    else {
        System.out.print("O");
      }

    if (array[0][2] == 3)  {
      System.out.println("X");
   }
  else {
        System.out.print("O");
      }

 }
    if (array[1][0] == 4)  {
      System.out.print("X");
   }
  else {
        System.out.println("O");
      }

    if (array[1][1] == 5)  {
      System.out.println("X");
   }
  else {
        System.out.println("O");
      }

  if (array[1][2] == 6)  {
      System.out.println("X");
   }
  else {
        System.out.println("O");
      }

   if (array[2][0] == 7)  {
      System.out.println("X");
   }
  else {
        System.out.println("O");
      }
   
 if (array[2][1] == 8)  {
      System.out.println("X");
   }
  else {
        System.out.print("O");
      }
  if (array[2][2] == 9)  {
      System.out.print("X");
      }
    else {
      System.out.print("O");
   }
  }
 
}


  
}




    




