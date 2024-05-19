const prompt = require("prompt-sync")();

console.log("=============================================")

console.log("Welcome to Your EverInteractive Menstrual Cycle App")

lastDate = prompt("What is  date of your period,Enter in the format:(dd/MM/yyyy) ");

startDate = prompt("What is the start date of your period,Enter in the format:(dd/MM/yyyy) ")
    
const startDay = new Date(startDate);

const lastDay = new Date(lastDate);
    
length = prompt("What is the average length of your menstrual cycle");
   
let ovulationTime = length / 2;

const ovulationLength = lastDay.getDate() + ovulationTime;

const fertile = ovulationLength - 6;

const safetime = lastDay.getDate() + 9;

const safeLength = startDay.getDate() + 10;

lastDay.setTime(ovulationLength);

lastDay.setTime(fertile);

lastDay.setTime(safetime);

startDay.setTime(safeLength);

console.log("if your menstrual cycle is " + length + "\n");

console.log("Your estimated fertile window is " + lastDay.setTime(fertile) + " to " + lastDay.setTime(ovulationLength) + "\n");

console.log("Your Estimated Ovulation date is " + ovulationLength + "\n");

console.log("Your Safe period is " + lastDay + " to " + safetime + " and " + safeLength + " to " + startDay);

console.log("\n\n");

console.log("You are most likely to get pregnant if you have sex without birth control a few days before your ovulation date.")

console.log("===============================================")

