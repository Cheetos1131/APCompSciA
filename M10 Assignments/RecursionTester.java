/**
 * Purpose: Recursion Algorithmn
 * @author Iker Perez-Calderon
 * @version 4/5/2022
 */
import java.util.Scanner;
public class RecursionTester {
    public static void main(String[] args) {
        boolean choice = true;
        //Max value 46 as 47 will overflow into the negatives
        Scanner in = new Scanner(System.in);
        while(choice) {
            int nValue = 0;
            String answer = " ";
            System.out.print("Enter in a value from 0 - 46: ");
            nValue = in.nextInt();
            if((nValue >= 0) && (nValue <= 46)) {
                System.out.println("The fibonacci number at the entered value is: " + Recursion.fibonacciAlgorithmn(nValue));
                System.out.print("Would you like to quit?: ");
                answer = in.next();
                if(answer.toLowerCase().substring(0, 1).equals("y")) {
                    choice = false;
                }
            }
        }
        in.close();
    }
}