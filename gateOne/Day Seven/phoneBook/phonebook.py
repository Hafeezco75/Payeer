import num.py;

firstname = []

lastname = [] 

phonenumber = []

prompt = """
1-> Add Contact
2-> Remove Contact
3-> Find Contact by Phone Number
4-> Find Contact by Firstname
5-> Find Contact by lastname
6-> Edit Contact
""";

print(prompt)

user_Input = int(input("Enter any of the available Options to select"))

match(user_Input): 
	case 1: addContact();

	case 2: removeContact();

	case 3: findContactByPhoneNumber();

	case 4: findContactByFirstname();


def addContact():

	name = int(input("Enter your Firstname"))
  
	firstname.append(name)

	Lastnames = str(input("Enter your Lastname"))
  
	lastname.append(Lastnames)

	contact_number = str(input("Enter your Phone Number"))

	phonenumber.append(contact_number)


def removeContact():

	phone_number = str(input("Remove PhoneNumber"))
  
	for count in firstname: 
    
		if(contacts.get(count).equalsIgnoreCase(phoneNumber)):
        	
			phonenumber.remove(count)

	else:

		print("Contact does not exist")


def findContactByPhoneNumber():

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

	elif(!"searchName".equals(firstname.get(count))):

  		firstname.indexOf(count)

 	print("Firstname not found")

  


