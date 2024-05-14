import java.util.ArrayList;

import java.util.Scanner;

public class PhonebookApp  {

static ArrayList<String> contacts = new ArrayList<String>();

static ArrayList<String> FirstName = new ArrayList<String>();

static ArrayList<String> LastName = new ArrayList<String>();

static ArrayList<String> phoneNumber = new ArrayList<String>();

public static void main(String... args)  {
   phonebookMenu();
}

public static void phonebookMenu()  {

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
case 2-> removeContact();
case 3-> findContactByPhoneNumber();


}

}

static void addContact()  {

Scanner input = new Scanner(System.in);

System.out.println("Enter your Firstname");
  String firstName = input.nextLine();

FirstName.add(firstName);

System.out.println("Enter your Lastname");
  String lastName = input.nextLine();

LastName.add(lastName);

System.out.println("Enter your Phone Number");
  String phoneNumber = input.next();

PhoneNumber.add(phoneNumber);

String name = firstName.concat(lastName);

}

static void removeContact()  {

String phoneNumber = null;

String firstname = " ";
String lastname = " ";
String phoneContact = " ";

Scanner input = new Scanner(System.in);

System.out.println("Remove contact");
  String Contacts = input.nextLine();

if(FirstName.isEmpty(firstName))  {
   System.out.println("Contacts not found");
 }
if(LastName.isEmpty())  {
  System.out.println("Name not found");
  }
if(phoneNumber.isEmpty())  {
 System.out.println("Phonenumber does not exist");
  }
if(phoneNumber.contains(phoneNumber))  {
 System.out.println("phoneNumber found");
 }
if(FirstName.contains(firstname))  {
  System.out.println("firstname found"); 
 }
if(LastName.contains(lastname))  {
  System.out.println("lastName found");
 }

}

public static void findContactByPhoneNumber()  {

String phoneNumber = null;

Scanner input = new Scanner(System.in);

System.out.println("Search for contact");
  String searchNumber = input.nextLine();

for(int count = 0; count < contacts.size(); count++)  {

 if(contacts.get(count).equals(searchNumber))  {
   System.out.println(FirstName);
   System.out.println(LastName);
   System.out.println(phoneNumber);
    }
if(!contacts.get(count).equals(searchNumber))  {
   System.out.println("Contact not found");
   }
}

}




}