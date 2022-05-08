/**
 * Purpose: To read a file with info on family members and display the statistics of the child groupings by gender.
 * @author Iker Perez-Calderon
 * @version 11/16/2021
 * 
 */

import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class familyPercentagesResub {
    public static void main(String[] args) throws IOException {
        String token = "";
        File fileName = new File("familyMembers.txt");
        Scanner inFile = new Scanner(fileName);

        // Variable declaration
        int BGCounter = 0;
        int BBCounter = 0;
        int GGCounter = 0;
        int familyTotal = 0;

        // While loop seracher
        while (inFile.hasNext()) {
            token = inFile.nextLine();

            if (token.equals("BB")) {
                BBCounter++;
                familyTotal++;
            }

            else if (token.equals("BG") || token.equals("GB")) {
                BGCounter++;
                familyTotal++;
            }

            else if (token.equals("GG")) {
                GGCounter++;
                familyTotal++;
            }

        }

        // Percent formatters
        double percentBB = (int)((double)BBCounter / familyTotal * 10000) / 100.0;
        double percentBG = (int)((double)BGCounter / familyTotal * 10000) / 100.0;
        double percentGG = (int)((double)GGCounter / familyTotal * 10000) / 100.0;

        // Output
        System.out.println("Family Statistics");
        System.out.println();
        System.out.println("Family number total: " + familyTotal);
        System.out.println();
        System.out.println("Families with:");
        System.out.println("\tTwo Boys: " + BBCounter + " which is " + percentBB + "% of the familes.");
        System.out.println("\tTwo Girls: " + GGCounter + " which is " + percentGG + "% of the familes.");
        System.out.println("\tOne Boy and one Girl: " + BGCounter + " which is " + percentBG + "% of the familes.");

        // Closes the Scanner
        inFile.close();
    }
    
}
