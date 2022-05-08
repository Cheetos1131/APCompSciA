/**
 * 
 * This program will generate 2 random sides on a triangle and use
 * the pythagorean theorem to find the hypotenuse and display it.
 * 
 * @author Iker Perez-Calderon
 * @version 9/4/2021
 */
public class PyTheorem 
{
    public static void main(String[] args) 
    {
        // Variables Area
        int min = 5;
        int max = 23;
        int range = max - min;
        int sideA1 = min + (int)(Math.random() * ((range) + 1));
        int sideB1 = min + (int)(Math.random() * ((range) + 1));
        int sideA2 = min + (int)(Math.random() * ((range) + 1));
        int sideB2 = min + (int)(Math.random() * ((range) + 1));
        // Equations
        double hypotenuse1 = Math.sqrt(Math.pow(sideA1, 2) + Math.pow(sideB1, 2));
        double hypotenuse2 = Math.sqrt(Math.pow(sideA2, 2) + Math.pow(sideB2, 2));

        // Print statements
        System.out.println("First Triangle\tSide A1: " + sideA1 + "\tSide B1: " + sideB1 + "\tHypotenuse: " + hypotenuse1);
        System.out.println("Second Triangle\tSide A2: " + sideA2 + "\tSide B2: " + sideB2 + "\tHypotenuse: " + hypotenuse2);

    }   
}
