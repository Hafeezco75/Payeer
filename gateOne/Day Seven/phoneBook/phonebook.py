import num.py;

List contacts = []

List FirstName = []

List LastName = [] 

List PhoneNumber = []

String prompt = """
1-> Add Contact
2-> Remove Contact
3-> Find Contact by Phone Number
4-> Find Contact by Firstname
5-> Find Contact by lastname
6-> Edit Contact
""";

print(prompt);
int userInput = input.nextInt(); 

switch(userInput) {
case 1-> addContact();
case 2-> removeContact();
case 3-> findContactByPhoneNumber();


}

}

def addContact():

firstName = int(input("Enter your Firstname"))
  
FirstName.append(firstName);

lastName = str(input("Enter your Lastname"))
  
LastName.append(lastName);

phoneNumber = str(input("Enter your Phone Number"))

PhoneNumber.append(phoneNumber);

String name = firstName.concat(lastName);

}

def removeContact():

String phoneNumber = null;

Contacts = str(input("Remove contact"))
  
for count in range contacts.size(); 
    
	if(contacts.get(count).equalsIgnoreCase(phoneNumber)):
        contacts.remove(Contacts);

  	else:

  	print("Contact does not exist")


def findContactByPhoneNumber():

String phoneNumber = null;

search = str(input("Search for contact"))

for count in range(contacts.size()

if(contacts.get(count).equalsIgnoreCase(phoneNumber)):
	contacts.get(1)
else:

	print("Contacts cannot be found")
  


