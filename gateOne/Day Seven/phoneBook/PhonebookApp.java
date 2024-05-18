import java.util.ArrayList;

import java.util.Scanner;

public class PhonebookApp  {

static ArrayList<String> firstname = new ArrayList<String>();

static ArrayList<String> lastname = new ArrayList<String>();

static ArrayList<String> phonenumber = new ArrayList<String>();

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
  String name = input.nextLine();

firstname.add(name);

System.out.println("Enter your Lastname");
  String names = input.nextLine();

lastname.add(names);

System.out.println("Enter your Phone Number");
  String number = input.next();

phonenumber.add(number);

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

Scanner input = new Scanner(System.in);

System.out.println("Remove Contact PhoneNumber");
   String contactNumber = input.nextLine();

for(int count = 0; count < phonenumber.size(); count++) {

if(contactNumber.equals(phonenumber.get(count)))  {
  phonenumber.remove(count);
  firstname.remove(count);
  lastname.remove(count);

 System.out.println(contactNumber);
   System.out.println(firstname);
    System.out.println(lastname);

System.out.println("Contact PhoneNumber deleted Successfully >>>>>>>>>>>");

System.out.println("Contact FirstName deleted Successfully >>>>>>>>>>>");

System.out.println("Contact LastName deleted Successsfully >>>>>>>>>>");
 } 

else {
    System.out.println("Contact does not exist");  
     }
 }
phonebookMenu();
    
}


public static void findContactByPhoneNumber()  {

Scanner input = new Scanner(System.in);

   System.out.println("Search for Phone Number");
   String searchNumber = input.nextLine();

     for(int count = 0; count < phonenumber.size(); count++)  {

	if(searchNumber.equals(phonenumber.get(count)))  {
   	phonenumber.indexOf(count);
  	System.out.println(phonenumber + " exists");
   }

      if(!"searchNumber".equals(phonenumber.get(count)))  {
   	phonenumber.indexOf(count);
  	System.out.println("PhoneNumber not found");
    }
  }

phonebookMenu();
}

public static void findContactByFirstname() {

   Scanner input = new Scanner(System.in);

	System.out.println("Search the Firstname of the Contact");
        String searchName = input.nextLine();
   
 	for(int count = 0; count < firstname.size(); count++) {
     
  	if(searchName.equals(firstname.get(count)))  {
   	firstname.indexOf(count);
  	System.out.println(firstname + " exists");
    }
 
       else if(!"searchName".equals(firstname.get(count)))  {
  	firstname.indexOf(count);
 	 System.out.println("Firstname not found");
   }
  }  
   
 } 
  
public static void findContactByLastname() {

Scanner input = new Scanner(System.in);

System.out.println("Search the Lastname of the Contact");
    String lastNameSearch = input.nextLine();

for(int count = 0; count < lastname.size(); count++) {
   
  if(lastNameSearch.equals(lastname.get(count))) {
   lastname.indexOf(count);
 System.out.println(lastname + " exists");
  }

 else if (!"lastNameSearch".equals(lastname.get(count))) {
  lastname.indexOf(count);
  System.out.println("Lastname not found");
  }
}

}
public static void editContact()  {

Scanner input = new Scanner(System.in);

System.out.println("Enter the Contact you want to Edit");
    String editContact = input.next();
}

}





