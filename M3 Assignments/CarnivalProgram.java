import java.util.Scanner;
/**
 * The purpose of this program is to facilitate booth personnel
 * in deciding and giving out correct ticket price and apply discounts if needed.
 * 
 * @author Iker Perez-Calderon
 * @version 10/19/2021
 */
public class CarnivalProgram {
    public static void main(String[] args) {
        // Maing group to get name and splice it up
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your first and last name? ");
        String fullName = scan.nextLine();
        String firstInitial = fullName.substring(0, 1);
        int spacePosition = fullName.indexOf(" ");
        String lastName = fullName.substring(spacePosition + 1);

        // Group to get user age
        System.out.print("What is your age? ");
        int userAge = scan.nextInt();

        // Group to decide whether user is elegible for the discount
        System.out.print("Are you a first responder?(over 18) (y/n): ");
        String answer1 = scan.next();
        System.out.print("Are you a veteran?(over 18) (y/n): ");
        String answer2 = scan.next();

        // Group to test the discount
        boolean discount = false;
        double ticketPrice = 0.0;
        if (answer1.equalsIgnoreCase("y") || answer2.equalsIgnoreCase("y")) {
            discount = true;
        }

        // If statement group to decide ticket price and apply discount if needed
        if (userAge < 3) {
            ticketPrice = 2.0;
        }
        else if (userAge >= 3 && userAge <= 5) {
            ticketPrice = 9.0;
        }
        else if (userAge >= 6 && userAge <= 18) {
            ticketPrice = 11.0;
            if (userAge == 18 && discount == true) {
                ticketPrice = 11.0 / 2.0;
            }
        }
        else if (userAge > 18) {
            ticketPrice = 12.0;
            if (discount == true) {
                ticketPrice = 6.0;
            }
        }

        // Generates a random number between 1 and 1000
        int randomNumber = (int)(Math.random() * (1000 - 1)) + 1;

        // Creates the unique ID
        String id = firstInitial + lastName + randomNumber;

        // Display ticket
        System.out.println("\n\n");
        System.out.println("Welcome to the APCS Carnival, " + fullName + "!");
        System.out.println("Your user ID is " + id);
        System.out.println("The cost of your ticket is $" + ticketPrice + ".");
        System.out.println("Have a great time at the APCS Carnival today!");

        // Closes scanner
        scan.close();

    }
}
