const prompt = require("prompt-sync")();

console.log("=============================================")

console.log("Welcome to Your EverInteractive Menstrual Cycle App")

startDate = Number(prompt()("What is the Start date of your period")
    
LocalDate now = LocalDate.of(startDate)

LocalDate after = now.plusMonths(1)

length = parseInt(prompt())(What is the average length of your menstrual cycle"))
  
console.log("if your menstrual cycle is" + length)

console.log("Your estimated fertile window is  days)

console.log("Your estimated ovulation date is" + now)

console.log("You are most likely to get pregnant if you have sex without birth control a few days before your ovulation date.")

console.log("===============================================")

