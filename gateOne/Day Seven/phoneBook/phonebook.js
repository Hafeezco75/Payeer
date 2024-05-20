const prompt = require("prompt-sync")();

let firstname = [];

let lastname = [];

let phonenumber = [];

semicolonPhoneApp = phonebookMenu() 

function phonebookMenu() {

menuprompt = `
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
`;

console.log(menuprompt);

userInput = prompt("Select any operations to perform ");

switch (userInput){
    case "1": 
	    addContact();
    break;

    case "2": 
	    removeContact();
    break;

    case "3": 
	    findContactByPhoneNumber();
    break;

    case "4": 
	    findContactByFirstname();
    break;

    case "5": 
	    findContactByLastname();
    break;

    case "6": 
	    editContact();
    break;

    case "7": 
	    phonebookMenu();
    break;

     }
    
   }

function addContact()  {

name = prompt("Enter your Firstname ");

firstname.push(name);

names = prompt("Enter your Lastname ");
  
lastname.push(names);

number = prompt("Enter your Phone Number ");
  
phonenumber.push(number);

addAnotherContact();

}

function addAnotherContact()  {

newContact = prompt("Do you still want to add another Contact(Yes/No) ");
     
if(newContact === ("Yes")) {
      
 addContact();
 }

else {
 console.log("Contacts added Successfully>>>>>>>>>>>>>");
 phonebookMenu();
  }

}

function removeContact()  {

contactNumber = prompt("Remove Contact PhoneNumber ");

for(let count = 0; count < phonenumber.length; count++) {

if(contactNumber === (phonenumber.at(count)))  {
  phonenumber.pop(count);
  firstname.pop(count);
  lastname.pop(count);

 console.log(contactNumber.at(count));
   console.log(firstname);
    console.log(lastname);

console.log("Contact PhoneNumber deleted Successfully >>>>>>>>>>>");

console.log("Contact FirstName deleted Successfully >>>>>>>>>>>");

console.log("Contact LastName deleted Successsfully >>>>>>>>>>");
 } 

else {
    console.log("Contact does not exist");  
     }
 }

phonebookMenu();
    
}


function findContactByPhoneNumber()  {

searchNumber = prompt("Search for Phone Number");

   for(let count = 0; count < phonenumber.length; count++)  {

	if(searchNumber === (phonenumber.at(count)))  {
   	phonenumber.indexOf(count);
  	console.log(phonenumber + " exists");
   }

      if(searchNumber != (phonenumber.at(count)))  {
   	phonenumber.indexOf(count);
  	console.log("PhoneNumber not found");
    }
  }

phonebookMenu();
}

function findContactByFirstname() {

   searchName = ("Search the Firstname of the Contact");
           
 	for(let count = 0; count < firstname.length; count++) {
     
  	if(searchName === (firstname.at(count)))  {
   	firstname.indexOf(count);
  	console.log(firstname + " exists");
    }
 
       else if(searchName != (firstname.at(count)))  {
  	firstname.indexOf(count);
 	 console.log("Firstname not found");
   }
  }  
   
 } 
  
function findContactByLastname() {

lastNameSearch = prompt("Search the Lastname of the Contact");
    
for(let count = 0; count < lastname.length; count++) {
   
  if(lastNameSearch.equals(lastname.get(count))) {
   lastname.indexOf(count);
 console.log(lastname + " exists");
  }

 else if (!"lastNameSearch".equals(lastname.get(count))) {
  lastname.indexOf(count);
  console.log("Lastname not found");
  }
}

}

function editContact()  {

editContact = prompt("Enter the Contact you want to Edit");
    }

