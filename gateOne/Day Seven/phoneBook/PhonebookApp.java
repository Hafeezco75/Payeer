import java.util.ArrayList;

import java.util.Scanner;

public class PhonebookApp  {

static ArrayList<String> contacts = new ArrayList<String>();

static ArrayList<String> FirstName = new ArrayList<String>();

static ArrayList<String> LastName = new ArrayList<String>();

static ArrayList<String> PhoneNumber = new ArrayList<String>();

public static void main(String... args)  {
   phonebookMenu();
}

public static void phonebookMenu()  {

Scanner input = new Scanner(System.in);

String prompt = """
======================================================================
Welcome to Semicolon Phonebook App,Enter any of the Options to perform.

1-> Add Contact
2-> Remove Contact
3-> Find Contact by Phone Number
4-> Find Contact by Firstname
5-> Find Contact by lastname
6-> Edit Contact
7-> Back

=========================================
""";

System.out.println(prompt);
int userInput = input.nextInt(); 

switch(userInput) {
case 1-> addContact();
case 2-> removeContact();
case 3-> findContactByPhoneNumber();
case 4-> findContactByFirstname();
case 5-> findContactByLastname();
case 7-> phonebookMenu();

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

addAnotherContact();
}

public static void addAnotherContact()  {

Scanner input = new Scanner(System.in);

System.out.println("Do you still want to add another Contact(Yes/No)");
     String newContacts = input.next();

if(newContacts.equalsIgnoreCase("Yes")) {
      addContact();
 }
else {
 System.out.println("Contacts added Successfully>>>>>>>>>>>>>");
 phonebookMenu();
  }

}
public static void removeContact()  {

String firstname = "";
String lastname = "";
String phoneContact = "";

Scanner input = new Scanner(System.in);

System.out.println("Remove Lastname of contact");
   String lastName = input.nextLine();

for(int count = 0; count < LastName.size(); count++) {
lastname = LastName.get(count);
 if(lastname.equals(lastName)) {
   LastName.remove(lastname);
  System.out.println(LastName);
System.out.println("Contact LastName deleted Successsfully >>>>>>>>>>");
  }

System.out.println("Remove Firstname of contact");
   String firstName = input.nextLine();

   firstname = FirstName.get(count);
 if(firstname.equals(firstName))  {
  FirstName.remove(firstname);
  System.out.println(FirstName);
System.out.println("Contact FirstName deleted Successfully >>>>>>>>>>>");
   }

System.out.println("Remove Contact PhoneNumber");
   String removeNumber = input.nextLine();

phoneContact = PhoneNumber.get(count);
 if(phoneContact.equals(firstName))  {
  FirstName.remove(firstname);
  System.out.println(FirstName);


 }
phonebookMenu();
    
}

public static void findContactByPhoneNumber()  {

String phoneContact = "";

Scanner input = new Scanner(System.in);

System.out.println("Search for Phone Number");
  String searchNumber = input.nextLine();

for(int count = 0; count < PhoneNumber.size(); count++)  {

phoneContact = PhoneNumber.get(count);

 if(phoneContact.equals(searchNumber))  {
   PhoneNumber.indexOf(phoneContact);
  System.out.println(phoneContact + " exists");
   }

 if(!"phoneContact".equals(searchNumber))  {
   PhoneNumber.indexOf(phoneContact);
  System.out.println("Phone Number not found");
    }
  }

phonebookMenu();
}

public static void findContactByFirstname() {

Scanner input = new Scanner(System.in);

String firstName = "";

System.out.println("Search the Firstname of the Contact");
     String Name = input.nextLine();
   
 for(int count = 0; count < FirstName.size(); count++) {
     firstName = FirstName.get(count);

  if(firstName.equals(Name))  {
   FirstName.indexOf(firstName);
  System.out.println(firstName + " exists");
   }
 
else if(!"firstName".equals(Name))  {
  FirstName.indexOf(firstName);
 System.out.println("FirstName not found");
   }
  }  
   
 } 
  
public static void findContactByLastname() {

Scanner input = new Scanner(System.in);

String lastName = "";

System.out.println("Search the Lastname of the Contact");
    String lastnames = input.nextLine();

for(int count = 0; count < LastName.size(); count++) {
   lastName = LastName.get(count);

  if(lastName.equals(lastnames)) {
  LastName.indexOf(lastName);
 System.out.println(lastName + " exists");
  }

 else if (!"lastName".equals(lastnames)) {
  LastName.indexOf(lastName);
  System.out.println("LastName not found");
  }
}

}
public static void editContact()  {

Scanner input = new Scanner(System.in);

System.out.println("Enter the Contact you want to Edit");
    String editContact = input.next();
}

}





