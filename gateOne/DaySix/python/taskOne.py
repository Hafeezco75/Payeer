import datetime

def getYears(birth_date, today):

	birth_date = datetime.datetime().("2022-12-11")

	today = datetime.datetime.now()

	year = 60 * 60 * 24 * 365

	years = (today - birth_date) / year

	return years


result = getYears("2022-12-11" , datetime.datetime.now())

print(result)
	

	