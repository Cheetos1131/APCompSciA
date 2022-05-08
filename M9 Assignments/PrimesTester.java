/**
 * Purpose: Thinking outside the box
 * @author Iker Perez-Calderon
 * @version 3/27/2022
 */
import java.util.Scanner;
public class PrimesTester {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter in a lower limit: ");
       int low = input.nextInt();
       System.out.println();
       System.out.print("Enter in an upper limit: ");
       int high = input.nextInt();
       System.out.println();

       Primes range = new Primes(low, high);
       range.primeLoop();
       input.close();
    }
}