import java.util.Scanner;

public class CheckOutSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cstName = "";
        String item = "";
        int quantity = 0;
        double unitPrice = 0.0;
        String request = "";
        String item2 = "";
        int quantity2 = 0;
        double unitPrice2 = 0.0;
        String cashiersName = "";
        double discount = 0.0;
        double amountPaid = 0.0;

        try {
            System.out.print("What is the customer's name?: ");
            cstName = input.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid name input.");
            return;
        }

        try {
            System.out.print("What did the user buy?: ");
            item = input.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid item input.");
            return;
        }

        try {
            System.out.print("How many pieces?: ");
            quantity = input.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid quantity. Please enter a whole number.");
            return;
        }

        try {
            System.out.print("How much per unit?: ");
            unitPrice = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid unit price. Please enter a number.");
            return;
        }

        input.nextLine(); // consume leftover newline

        try {
            System.out.print("Add more items?: ");
            request = input.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input.");
            return;
        }

        if (request.equalsIgnoreCase("yes")) {
            try {
                System.out.print("What did the user buy?: ");
                item2 = input.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid item input.");
                return;
            }

            try {
                System.out.print("How many pieces?: ");
                quantity2 = input.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid quantity. Please enter a whole number.");
                return;
            }

            try {
                System.out.print("How much per unit?: ");
                unitPrice2 = input.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid unit price. Please enter a number.");
                return;
            }

            input.nextLine(); // consume newline
        }

        try {
            System.out.print("What is your name?: ");
            cashiersName = input.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid name input.");
            return;
        }

        try {
            System.out.print("How much discount will he get?: ");
            discount = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid discount. Please enter a number.");
            return;
        }

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

        if (request.equalsIgnoreCase("yes")) {
            double itemTotal2 = quantity2 * unitPrice2;
            itemTotal += itemTotal2;
            discountAmount = itemTotal * (discount / 100);
            subtotal = itemTotal - discountAmount;
            vat = subtotal * 0.075;
            billTotal = subtotal + vat;

            System.out.println(item2 + "\t\t" + quantity2 + "\t" + unitPrice2 + "\t\t" + itemTotal2);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("\t\t\tSub Total:\t" + itemTotal);
        System.out.println("\t\t\tDiscount:\t" + discountAmount);
        System.out.println("\t\t\tVAT @ 7.50%:\t" + vat);
        System.out.println("====================================================");
        System.out.println("\t\t\tBill Total:\t" + billTotal);
        System.out.println("====================================================");
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + billTotal);
        System.out.println("====================================================");

        try {
            System.out.print("How much did the customer give to you?: ");
            amountPaid = input.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid amount. Please enter a number.");
            return;
        }

        double change = amountPaid - billTotal;
        System.out.println("Amount Paid: " + amountPaid);
        System.out.println("Balance: " + change);
    }
}
