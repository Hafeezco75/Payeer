prompt = """
====================================================
SEMICOLON MOBILE PHONEBOOK APP (VERSION 1.0)
====================================================
1-> Add Contact
2-> Remove Contact
3-> Find Contact by Phone Number
4-> Find Contact by Firstname
5-> Find Contact by lastname
6-> Edit Contact

===================================================
""";

print(prompt)

firstname = []

lastname = [] 

phonenumber = []

user_Input = int(input("Enter any of the available Options to select"))

match(user_Input): 
	case 1 : add_Contact()

	case 2 : removeContact()

	case 3 : findContactByPhoneNumber()

	case 4 : findContactByFirstname()


def add_Contact():

	name = int(input("Enter your Firstname"))
  
	firstname.append(name)

	Lastnames = str(input("Enter your Lastname"))
  
	lastname.append(Lastnames)

	contact_number = str(input("Enter your Phone Number"))

	phonenumber.append(contact_number)


def remove_Contact():

	phone_number = str(input("Remove PhoneNumber"))
  
	for count in firstname: 
    
		if(contacts.get(count).equalsIgnoreCase(phoneNumber)):
        	
			phonenumber.remove(count)

	else:

		print("Contact does not exist")


def find_Contact_By_PhoneNumber():

	search = str(input("Search for contact"))

	for count in phonenumber:

		if(contacts.get(count).equalsIgnoreCase(phoneNumber)):
	
			contacts.get(count)
	
		print("Contact exists")
        
	else:

		print("Contacts cannot be found")


def findContactByFirstname():

	searchName = str(input("Search the Firstname of the Contact"))

	for count in firstname:

		if(searchName.equals(firstname.get(count))):

			firstname.indexOf(count)

		print(firstname + " exists")

	else: 
		("searchName" != (firstname.get(count)))

		firstname.indexOf(count)

		print("Firstname not found")


def findContactByLastname():

	lastnames = str(input("Search the Lastname of the Contact"))
    
	for count in lastname:

		if(lastName.equals(lastnames)):

			lastname.indexOf(lastName)
 
	print(lastName + " exists")

	if("lastName" != (lastnames)):

  		LastName.indexOf(lastName);
  
	print("LastName not found")
 



  


