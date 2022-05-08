/**
 * This program take in BMR and activity rate from user and computes TDEE and displays it.
 * 
 * @author Iker Perez-Calderon
 * @version 10/6/2021
 */
import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {

        // Input 1
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter in your name: ");
        String fullname = in.nextLine();
        System.out.print("Please enter in your BMR: ");
        String BMR = in.next();
        int bmrFormat = Integer.parseInt(BMR);
        System.out.print("Please enter in your gender: ");
        String gender = in.next();
        // Input 2
        System.out.print("\n\n");
        System.out.println("Please enter in your activity level");
        System.out.println("[A] Resting (Very low activity)");
        System.out.println("[B] Sedentary (Restricted movement)");
        System.out.println("[C] Light (Standing)");
        System.out.println("[D] Moderate (Light Labor)");
        System.out.println("[E] Very Active (Intensive Labor)");
        System.out.println("[F] Extremely Active (Athlete, Strenuous Labor)");
        String activityLetter = in.next();

        // Activity Factor Sort
        double activityNumber = 0.0;
        if ((gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) && activityLetter.equalsIgnoreCase("A")) {
            activityNumber = 1.0;
        }
        else if ((gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F")) && activityLetter.equalsIgnoreCase("B")) {
            activityNumber = 1.3;
        }
        else if (gender.equalsIgnoreCase("M") && activityLetter.equalsIgnoreCase("C")) {
            activityNumber = 1.6;
        }
        else if (gender.equalsIgnoreCase("F") && activityLetter.equalsIgnoreCase("C")) {
            activityNumber = 1.5;
        }
        else if (gender.equalsIgnoreCase("M") && activityLetter.equalsIgnoreCase("D")) {
            activityNumber = 1.7;
        }
        else if (gender.equalsIgnoreCase("F") && activityLetter.equalsIgnoreCase("D")) {
            activityNumber = 1.6;
        }
        else if (gender.equalsIgnoreCase("M") && activityLetter.equalsIgnoreCase("E")) {
            activityNumber = 2.1;
        }
        else if (gender.equalsIgnoreCase("F") && activityLetter.equalsIgnoreCase("E")) {
            activityNumber = 1.9;
        }
        else if (gender.equalsIgnoreCase("M") && activityLetter.equalsIgnoreCase("F")) {
            activityNumber = 2.4;
        }
        else if (gender.equalsIgnoreCase("F") && activityLetter.equalsIgnoreCase("F")) {
            activityNumber = 2.2;
        }
        else {
            System.out.println("You did not enter in a valid entry for gender or activity letter.");
        }

        // Equations
        double TDEE = bmrFormat * activityNumber;
        double tdeeFormat = (int)(TDEE * 10) / 10.0;

        // Output
        System.out.println("Results");
        System.out.println("Name: " + fullname + "\tGender: " + gender);
        System.out.println("BMR: " + BMR + " calories\tActivity Factor: " + activityLetter);
        System.out.println("TDEE: " + tdeeFormat + " calories");
        in.close();

    }
    
}
