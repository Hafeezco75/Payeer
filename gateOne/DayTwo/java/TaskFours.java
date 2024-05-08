public class TaskFours {

public static int[] evenIndex(int[] numbers) {

int[] Even = new int[8];

int counter = 0;

for(int count = 0; count < numbers.length; count+=2)  {
         Even[counter] = numbers[count];

         }
       return Even;

}

}