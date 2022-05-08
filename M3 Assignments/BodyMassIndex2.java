/**
 *  Based on user input, funnel data through an equation and return the BMI as well as the BMI category which is taken from logical conditions based on results.
 * 
 * @author Iker Perez-Calderon
 * @version September 29, 2021
 */

import java.util.Scanner;
import java.lang.Math;
public class BodyMassIndex2 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in your name (First Last): ");
        String fullname = in.nextLine();

        System.out.print("Enter in your weight in pounds: ");
        String weight = in.next();

        System.out.print("Enter in your height in feet and inches (ex: 6 1): ");
        String feetString = in.next();
        String inchesString = in.nextLine();
        String inchesStringFormat = inchesString.substring(1);
        

        // Equations
        int feet = Integer.parseInt(feetString);
        int inches = Integer.parseInt(inchesStringFormat);
        int totalInches = (feet * 12) + inches;
        int weightLbs = Integer.parseInt(weight);
        double meters = totalInches / 39.37;
        double kilograms = weightLbs / 2.205;
        double bmi = kilograms / Math.pow(meters, 2);
        double bmiFormat = (int)(bmi * 10) / 10.0;
        double meterFormat = (int)(meters * 10) / 10.0;
        double kilogramsFormat = (int)(kilograms * 10) / 10.0;
        String category;

        // Test conditions
        if (bmiFormat < 18.5) {
            category = "Underweight";
        }
        else if (bmiFormat < 25.0) {
            category = "Normal";
        }
        else if (bmiFormat < 30.0) {
            category = "Overweight";
        }
        else {
            category = "Obese";
        }

        // Output
        System.out.println("\n\n");
        System.out.println("BMI Calculator");
        System.out.println("--------------");
        System.out.println("Name: " + fullname);
        System.out.println("Height in meters: " + meterFormat);
        System.out.println("Weight in kilograms: " + kilogramsFormat);
        System.out.println("BMI: " + bmiFormat);
        System.out.println("Category: " + category);

        in.close();
    }
}
