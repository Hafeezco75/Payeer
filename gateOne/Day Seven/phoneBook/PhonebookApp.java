import java.util.ArrayList;

import java.util.Scanner;

public class PhonebookApp  {

static ArrayList<String> contacts = new ArrayList<String>();

static ArrayList<String> FirstName = new ArrayList<String>();

static ArrayList<String> LastName = new ArrayList<String>();

static ArrayList<String> phoneNumber = new ArrayList<String>();

public static void main(String... args)  {

Scanner input = new Scanner(System.in);

String prompt = """
1-> Add Contact
2-> Remove Contact
3-> Find Contact by Phone Number
4-> Find Contact by Firstname
5-> Find Contact by lastname
6-> Edit Contact
""";

System.out.println(prompt);
int userInput = input.nextInt(); 

switch(userInput) {
case 1-> addContact();


}

}

public static void addContact()  {

Scanner input = new Scanner(System.in);

System.out.println("Add contacts");
  String Contact = input.nextLine();

contacts.add(Contact);

System.out.println("Enter your Firstname");
  String firstName = input.nextLine();

FirstName.add(firstName);

System.out.println("Enter your Lastname");
  String lastName = input.nextLine();

LastName.add(lastName);


String name = firstName.concat(lastName);

 }

public static void removeContact()  {

System.out.println("Remove contact");
  String Contact = input.nextLine();






}