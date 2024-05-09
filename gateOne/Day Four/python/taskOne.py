array = [3][3]

for count in range(len(array)):

	for counter in range(len(array)):
        	
		array[count][counter] = int(input("Enter either X or O "))
        
	if (array[0][0] == 1):

       		print("X")
	else:

		print("O")
    
	if (array[0][1] == 2 ):

		print("X")
	else:

        	print("O")

	if (array[0][2] == 3):

		print("X")
	else:
		print("O")

	if (array[1][0] == 4):

		print("X")
	else:
        
		print("O")
	if (array[1][1] == 5):

		print("X")
	else:
        
		print("O")
	if (array[1][2] == 6): 
 
		print("X")
	else:

        	print("O")

	if (array[2][0] == 7):

		print("X")

	else:

        	print("O")
	if (array[2][1] == 8):

		print("X")
	else:
        
		print("O")
	if (array[2][2] == 9):

		print("X")
	else:

		print("O")
   
