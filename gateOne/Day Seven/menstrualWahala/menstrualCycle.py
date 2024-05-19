from datetime import datetime

from datetime import timedelta

from dateutil.relativedelta import relativedelta

print("=============================================")

print("Welcome to Your EverInteractive Menstrual Cycle App")

last_period = str(input("What day did you have your last period "))

format_date = '%d/%m/%Y'

lastDay = datetime.strptime(last_period, format_date)

start_Date = str(input("Enter the start date of your new period "))

startDay = datetime.strptime(start_Date, format_date)

length = int(input("What is the average length of your menstrual cycle  "))

length_to_ovulation = length / 2

ovulation_length = lastDay + timedelta(length_to_ovulation)

length_to_fertility = ovulation_length - timedelta(days=6)

length_to_safeday = lastDay + timedelta(days=9)

length_safetime = startDay - timedelta(days=10)
  
print(f'if your menstrual cycle is {length} days')

print(f'Your estimated fertile window is {length_to_fertility} to {ovulation_length}')

print(f'Your estimated ovulation date is {ovulation_length}')

print(f'Your safe period starts {lastDay} to {length_to_safeday} and {length_safetime} to {startDay}')

print("You are most likely to get pregnant if you have sex without birth control a few days before your ovulation date.")

print("===============================================")

