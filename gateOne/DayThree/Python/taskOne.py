import random

r = random.SystemRandom()
         
for count in range(1,12):

	number = int(input("2 + 2  "))
	
	count += number

if (number == 4):
      	
	print("Correct")
else: 
       			
	print("Wrong")

print(r.randint(1,12))



	


