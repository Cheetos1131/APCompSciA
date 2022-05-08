/**
 * Purpose: To ask the user whether or not they want a randomly generated password and based on the choice write it to a file, continue looping, and at termination display passwords from file.
 * @author Iker Perez-Calderon
 * @version 11/28/2021
 * 
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class SecretPasscode {
    public static void main(String[] args) throws IOException {

        // Variable initialization
        int passwordLength = 0;
        int randNumber = 0;
        File fileName = new File("passwords.txt");
        String userChoice = ""; 
        String password = "";
        Random randomList = new Random();
        boolean continueProgram = true;
        boolean continueChoice = false;
        boolean continueLength = false;

	    // initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        Scanner passFile = new Scanner(fileName);
        PrintWriter outFile = new PrintWriter(fileName);

        System.out.println("-----------------------------------------------------");
        System.out.println("Welcome to the simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
        
        //Numbers in ASCII are encoded to 48 to 57 included
        //Lowercase letters in ASCII are encoded to 97 to 122 included
        //Upercase letters in ASCII are encoded to 65 to 90 included
        System.out.println();
        System.out.println();
        System.out.print("Would you like to generate a password. (y/n): ");
        userChoice = in.next();
        //Outer loop to loop for another password generation
        while(continueProgram) {
            if (userChoice.equalsIgnoreCase("n")) {
                System.out.println("Thank you the program will now quit.");
                continueProgram = false;
                continueChoice = false;
            }
            else if (userChoice.equalsIgnoreCase("y")) {
                System.out.println("You have chosen to generate a password.");
                //Inner loop to continue looping until characters entered are at minimum of above
                while (!continueLength) {
                    System.out.print("How many characters would you like your password to be. (6 or more): ");
                    passwordLength = in.nextInt();
                    if (passwordLength < 6) {
                        System.out.println("Password is too small. Try again.");
                    }
                    else if (passwordLength >= 6) {
                        continueLength = true;
                        continueChoice = true;
                    }
                }
            }
            // IF statement to run if user chose to continue with another password
            if (continueChoice) {
                for (int i = 1; i <= passwordLength; i++) {
                    randNumber = 0;
                    while (!((randNumber >= 48 && randNumber <= 57) || (randNumber >= 65 && randNumber <= 90) || (randNumber >= 97 && randNumber <= 122))) {
                        randNumber = randomList.nextInt(127);
                    }
                    password += (char)randNumber;
                }
                System.out.println();
                System.out.println("Password has been writted to the text file.");
                outFile.println(password);
                password = "";
                System.out.println();
                System.out.print("Would you like another password?: ");
                userChoice = in.next();
                if (userChoice.equalsIgnoreCase("n")) {
                    System.out.println("Thank you. The program will now close and display your passwords.");
                    continueChoice = false;
                    continueProgram = false;
                }
                else if (userChoice.equalsIgnoreCase("y")) {
                    continueChoice = false;
                    continueProgram = true;
                    continueLength = false;
                }
            }
        }
        outFile.close();
        System.out.println();
        System.out.println("Your passwords:");
        int count = 1;
        // Loop to display file contents
        while (passFile.hasNext()) {
            String token = passFile.nextLine();
            System.out.println("\t" + count + ": " + token);
            count++;
        }
        passFile.close();
        in.close();
    }
}