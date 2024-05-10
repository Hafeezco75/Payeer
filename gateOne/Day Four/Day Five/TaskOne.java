import java.util.Scanner;

public class TaskOne {

public static void main(String... args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter a Card Number to verify Card Validity");
    String digit = input.nextLine();

boolean answer = cardNumber(digit);

}
 
public static boolean cardNumber(String[] digit) {

boolean result = false;

int[] digit = new int[16];

String length = "-";

int digit0 = 4;
int digit1 = 3;
int digit2 = 2;
int digit3 = 5;
int digit4 = 6;
int digit5 = 9;
int digit6 = 8;
int digit7 = 4;
int digit8 = 6;
int digit[9] = 3;
int digit[10] = 2;
int digit[11] = 9;
int digit[12] = 4;
int digit[13] = 3;
int digit[14] = 3;
int digit[15] = 7;


for(int count = digit.length; count > 0; count++)  {
   String DIGIT = Integer.toString(digit[0]);

   if( digit[0] == 4 && digit[0] == 5 || digit[0] == 6)  {
           boolean result = true;
       }
   else { 
       boolean result = false;
    }
  }
 return result;


for(int count = 0; count < digit.length; count+=1)  {
  String DIGIT1 = Integer.toString(digit[1]);
 
  if(digit[1] % 2 == 0)  {
    boolean result = true;
    }
  else {
     boolean result = false;
    }
  }
 return result;

for(int count = 0; count < digit.length; count+=2)  {
   String DIGIT2 = Integer.toString(digit[2]);

     if(digit[2] % 2 == 1)  {
    boolean result = true;
    }
  else {
     boolean result = false;
    }
   }
  return result;


}

}


        













 