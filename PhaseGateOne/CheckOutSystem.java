import java.util.Scanner;

public class CheckOutSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is the customer's name?: ");
        String cstName = input.nextLine();
        
        System.out.print("What did the user buy?: ");
        String item = input.nextLine();
        
        System.out.print("How many pieces?: ");
        int quantity = input.nextInt();
        
        System.out.print("How much per unit?: ");
        double unitPrice = input.nextDouble();
        
        input.nextLine(); 

        System.out.print("Add more items?: ");
        String request = input.nextLine();
        
 
        if (request.equals("yes")) {
            System.out.print("What did the user buy?: ");
            String item2 = input.nextLine();
            
            System.out.print("How many pieces?: ");
            int quantity2 = input.nextInt();
            
            System.out.print("How much per unit?: ");
            double unitPrice2 = input.nextDouble();
            
            input.nextLine(); 
        }
        
        System.out.print("What is your name?: ");
        String cashiersName = input.nextLine();
        
        System.out.print("How much discount will he get?: ");
        double discount = input.nextDouble();
        
      
        double itemTotal = quantity * unitPrice;
        double discountAmount = itemTotal * (discount / 100);
        double subtotal = itemTotal - discountAmount;
        double vat = subtotal * 0.075;
        double billTotal = subtotal + vat;
       
        System.out.println("\nSEMICOLON STORES");
        System.out.println("MAIN BRANCH");
        System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
        System.out.println("TEL: 03293828343");
        System.out.println("Date: 18-Dec-22 8:48:11 pm");
        System.out.println("Cashier: " + cashiersName);
        System.out.println("Customer Name: " + cstName);
        System.out.println("====================================================");
        System.out.println("ITEM\t\tQTY\tPRICE\t\tTOTAL(NGN)");
        System.out.println("----------------------------------------------------");
        System.out.println(item + "\t\t" + quantity + "\t" + unitPrice + "\t\t" + itemTotal);
        System.out.println("----------------------------------------------------");
        System.out.println("\t\t\tSub Total:\t" + itemTotal);
        System.out.println("\t\t\tDiscount:\t" + discountAmount);
        System.out.println("\t\t\tVAT @ 7.50%:\t" + vat);
        System.out.println("====================================================");
        System.out.println("\t\t\tBill Total:\t" + billTotal);
        System.out.println("====================================================");
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
        System.out.println("====================================================");
        
        System.out.print("How much did the customer give to you?: ");
        double amountPaid = input.nextDouble();
        
        double change = amountPaid - billTotal;
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Balance: " + change);
        
        input.close();
    }
}