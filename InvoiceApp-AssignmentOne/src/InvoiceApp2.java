/*
Description :   App that calculates invoice discounts
Programmer’s name : Richard Boamah
Date Written : 01/31/2023
GitHub repository URL: https://github.com/8thrichard/Java_Assignments.git
 */

import java.util.Scanner;

public class InvoiceApp2 {

    public static void main(String[] args) {

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // initialize variables for use in calculating averages
        int invoiceCount = 0;
        int numLineItems = 0;

        double invoiceTotal = 0.0;
        double discountTotal = 0.0;
        double discountPercent = 0.0;
        double total = 0.0;
        double discountAmount = 0;
        double subtotal = 0;

        // perform invoice calculations until choice is "n" or "N"
        String choice = "y";
        String input = "?";

        // welcome the user to the program
        System.out.println("==========================================");
        System.out.println("Welcome to the Invoice Total Calculator V2");
        System.out.println("=========================================="); // print a blank line

        // perform invoice calculations until choice is "n" or "N"
        choice = "y";
        while (!choice.equalsIgnoreCase("n")) {
            // get the invoice subtotal from the user
            System.out.print("Please Enter the number of line items:   ");
            numLineItems = sc.nextInt();
            System.out.println("==========================================");

            for (int i = 0; i < numLineItems; i++) {
                // Get Invoice number of line items
                System.out.print("Enter amount for line item " + (i + 1) + ": ");
                subtotal += sc.nextDouble();
            }
            System.out.println("=========================================="); // GUI Purposes
            // calculate the discount amount and total
            if (subtotal >= 500) {
                discountPercent = 0.25;
            } else if (subtotal >= 200) {
                discountPercent = 0.2;
            } else if (subtotal >= 100) {
                discountPercent = 0.1;
            } else {
                discountPercent = 0.0;
            }
            discountAmount = subtotal * discountPercent;
            total = subtotal - discountAmount;

            // accumulate the invoice count and invoice total
            invoiceTotal = invoiceTotal + total;
            discountTotal = discountTotal + discountAmount;
            invoiceCount = invoiceCount + 1;

            // display the discount amount and total
           /*
            * String message = "Discount percent: " + discountPercent + "\n"
            * + "Discount amount:  " + discountAmount + "\n"
            * + "Invoice total:    " + total + "\n";
            */

           // Display Formatted Discount and Total
            System.out.printf("%20s:%,10.2f\n", "Subtotal", subtotal);
            System.out.printf("%20s:%,10.2f\n", "Discount Percent:", discountPercent);
            System.out.printf("%20s:%,10.2f\n","Discount Amount", discountAmount);
            System.out.printf("%20s:%,10.2f\n", "Invoice Total", total);

            sc.nextLine(); // Clear the input buffer

            // see if the user wants to continue
            System.out.println("==========================================");
            System.out.print("Continue? (Y/N): ");
            choice = sc.nextLine();
            System.out.println("==========================================");
            // System.out.println(""); ########
        }

        // calculate and display invoice count, average invoice, and average discount
        /* String message = "Number of invoices: " + invoiceCount + "\n"
                + "Average invoice:    " + invoiceTotal / invoiceCount + "\n"
                + "Average discount:   " + discountTotal / invoiceCount + "\n";
         System.out.println(message); */


         // calculate and display Formatted invoice count, average invoice, and average discount
         System.out.printf("%20s:%,10d\n", "Number of invoices", invoiceCount);
        System.out.printf("%20s:%,10.2f\n" , "Average invoice", invoiceTotal / invoiceCount);
        System.out.printf("%20s:%,10.2f\n" , "Average discount", discountTotal / invoiceCount);

        // Footer Message
        System.out.println("==========================================");
        System.out.println("   Thank You, I hope to see you Again!");
        System.out.println("==========================================");
    }
}
// End of InvoiceApp