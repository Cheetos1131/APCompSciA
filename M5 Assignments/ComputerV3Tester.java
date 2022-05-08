/**
 * Purpose: To use OOP to send data to another class to then be invoked by dot notation to be outputted at the end
 * @author Iker Perez-Calderon
 * @version 1/2/2022
 */

import java.util.Scanner;

public class ComputerV3Tester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ComputerV3 test = new ComputerV3();
        System.out.println("What is your Graphics card model?");
        String answer1 = in.nextLine();
        System.out.println("What is your CPU model?");
        String answer2 = in.nextLine();
        System.out.println("What is your RAM model?");
        String answer3 = in.nextLine();
        System.out.println();

        System.out.println("Your system is comprised of:");
        System.out.println("GPU\t\tCPU\t\tRAM");
        System.out.println("---------------------------------------------");
        test.computer(answer1, answer2, answer3);
        in.close();
    }
}
