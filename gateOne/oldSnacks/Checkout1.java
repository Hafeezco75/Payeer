import java.util.ArrayList;

import java.util.Scanner;

import java.util.Date;

public class Checkout1 {

public static void main(String... args) {

int counter = 0;

     ArrayList<String> items = new ArrayList<String>();

     ArrayList<Integer> price = new ArrayList<Integer>();

     ArrayList<Integer> quantity = new ArrayList<Integer>();

     ArrayList<Double> totals = new ArrayList<Double>();

     Scanner input = new Scanner(System.in);
     
      Date displays = new Date();

String Prompt = """
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 03293828343
""";

int number = 0;

int unit = 0;

int discount = 0;

String itemname = null;

String itemset = null;
double subTotal = 0;


System.out.println("What is the customer's Name ");
     String customerName = input.nextLine();

 do {
     System.out.println("What did the user buy? ");
       itemname = input.nextLine();

   System.out.println("How many pieces? ");
       number = input.nextInt();

    System.out.println("How much per unit? ");
        unit = input.nextInt();

       double total =  number * unit;

      items.add(itemname);

      price.add(unit);

      quantity.add(number);

      totals.add(total);
      
     System.out.println("Add more items? ");
      input.nextLine();
      itemset = input.nextLine(); 

       if (itemset.equals("no")) {  
        } 
   } 
     while (itemset.equals("yes")); 
 
     System.out.println("What is your name? ");
       String name = input.nextLine();
   
   System.out.println("How much discount will he get: ");
         discount = input.nextInt();

   System.out.println("How much did the customer give to you? ");
         int amountPaid = input.nextInt();

     System.out.println(Prompt);

     System.out.println(displays);

    System.out.println("Cashier: " + name);

    System.out.println("Customer Name: " + customerName);

       

System.out.println("===========================================================");

System.out.println("ITEM		QTY	PRICE	TOTAL(NGN)");
  
System.out.println("-----------------------------------------------------------");

for (counter = 0; counter < items.size(); counter++) {
   System.out.println(items.get(counter) + "\t"+ "\t" + quantity.get(counter) + "\t" + price.get(counter) + "\t" + "\t" + totals.get(counter));
   subTotal += totals.get(counter);  
   }
 
     double costDiscount = discount * subTotal / 100;

     double vat = 17.50 / 100 * subTotal;

     double billTotal = subTotal + vat - costDiscount;
     
     double balance = billTotal - amountPaid;
   System.out.println("------------------------------------------------------------");

  System.out.printf("\t\tSub Total: \t\t%.2f%n", subTotal);

  System.out.printf("\t\tDiscount: \t\t%.2f%n", costDiscount);

  System.out.printf("\t\tVAT at 17.50 : \t\t%.2f%n", vat);

System.out.println("============================================================");

  System.out.printf("\t\tBill Total:          \t%.2f%n", billTotal);

  System.out.printf("\t\tAmount Paid:          \t%d%n",amountPaid);

  System.out.printf("\t\tBalance:               \t%.2f%n",balance);

System.out.println("============================================================");

System.out.printf("\t THANK YOU FOR YOUR PATRONAGE %n");

 System.out.println("============================================================");



}

}