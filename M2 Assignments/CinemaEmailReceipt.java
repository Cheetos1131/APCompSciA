/**
 * Purpose: This program simulates the part of the website where a customer pays with the addition of the electronic receipt at the end
 * @author Iker Perez-Calderon
 * @version 9/12/2021
 */
import java.util.Scanner;
public class CinemaEmailReceipt
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);    

        System.out.println("Welcome to the checkout. Follow the instructions ahead and you'll be finished with your order.");
        System.out.print("Please enter in you name (first last): ");
        String firstName = scan.next(); // gets first name
        String lastName = scan.nextLine(); // gets last name
        lastName = lastName.substring(1); // removes leading space
        String firstInitial = firstName.substring(0, 1); // retrieves initial from first name

        String date = DateFormatter(scan); // date function

        String movie = Movie(scan); // movie function

        String ticketAmount = Ticket(scan);
        String costPerTicket = TicketCost(scan);
        int tickets = Integer.parseInt(ticketAmount); // int parse for tickets
        double price = Double.parseDouble(costPerTicket); // double parse for cost per ticket
        double totalCost = CostCalculator(tickets, price); // totalcost function using ticket and ticket cost for parameters

        String debitNumb = DebitNumberFormatter(scan); // debit number function

        String pinNumb = PIN(scan); // debit PIN function

        // order number taken from name substring and pin number 
        String orderNumber = pinNumb.substring(0, 2) + lastName.substring(1, 3) + pinNumb.substring(2);
        System.out.println();

        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Your electronic receipt:");
        System.out.println();
        System.out.println(date);
        System.out.println("Your order number: " + orderNumber);
        System.out.println();
        System.out.println(firstInitial + ". " + lastName);
        System.out.println("Account #: " + debitNumb);
        System.out.println("Movie name: " + movie);
        System.out.println("Total number of tickets: " + tickets);
        System.out.println("Cost per ticket: " + price);
        System.out.println();
        System.out.println("Amount to be billed to your account: $" + totalCost);
        System.out.println("Thank you for your purchase!");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------");

        scan.close();
    }

    public static String Ticket(Scanner scan) {
        System.out.print("Enter in ticket amount: ");
        String ticketAmount = scan.next(); // ticket number in
        return ticketAmount;
    }

    public static String TicketCost(Scanner scan) {
        System.out.print("Enter the individual price of the ticket: ");
        String costPerTicket = scan.next(); // cost per ticket in
        return costPerTicket;
    }

    public static String PIN(Scanner scan) {
        System.out.print("Enter in PIN (####): ");
        String pin = scan.next();
        return pin;
    }

    public static String DebitNumberFormatter(Scanner scan) {
        System.out.print("Enter in your debit card number (#####-###-####): ");
        String unblockedDebitNumber = scan.next();
        String formattedDebitNumber = "#####-###-" + unblockedDebitNumber.substring(10);
        return formattedDebitNumber;
    }

    public static String DateFormatter(Scanner scan) {
        System.out.print("Enter current date (mm/dd/yyyy): ");
        String rawDate = scan.next(); // gets unformatted date
        String formattedDate = rawDate.replaceAll("/", "-"); // replaces / with -
        return formattedDate;
    }
    
    public static String Movie(Scanner scan) {
        System.out.print("Enter in the movie you are going to watch: ");
        String movieName1 = scan.next();
        String movieName2 = scan.nextLine();
        String movieName = movieName1 + movieName2;
        return movieName;
    }
    
    public static double CostCalculator(int tickets, double price) { // cost function
        return (tickets * price);
    }
}