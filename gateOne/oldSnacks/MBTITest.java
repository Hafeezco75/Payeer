import java.util.Arrays;

import java.util.Scanner;

public class MBTITest  {

public static void main(String[] args)  {

Scanner input = new Scanner(System.in);

String letter = input.nextLine();

System.out.println("A.expend energy, enjoy groups \t\t B.conserve energy, enjoy one-on-one");
      letter = input.nextLine();

System.out.println("A.Interpret literally \t\t B.look for meaning and possibilities");
     letter = input.nextLine();

System.out.println("A.logical, thinking, questioning \t\t B.empathetic, feeling, accomodating");
     letter = input.nextLine();

System.out.println("A.organized, orderly \t\t B.flexible, adaptable");
     letter = input.nextLine();

System.out.println("A.more outgoing, think out loud \t\t B.more reserved, think to yourself");
     letter = input.nextLine();

System.out.println("A.practical, realistic, experiential \t\t B.imaginative, innovative, theoretical");
     letter = input.nextLine();

System.out.println("A.candid, straight forward, frank \t\t B.tactful, kind, encouraging");
      letter = input.nextLine();

System.out.println("A.plan, schedule \t\t\t B.unplanned, spontaneous");
     letter = input.nextLine();

System.out.println("A.seek many tasks,public activities, interaction with others \t\t B.seek private, solitary activities with quiet to concentrate");
     letter = input.nextLine();

String[] outputs = MBTIQuestions.Question(letter);

System.out.println(Arrays.toString(outputs));



}

}