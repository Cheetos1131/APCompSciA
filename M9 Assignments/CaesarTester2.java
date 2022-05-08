/**
 * Purpose: Encrpyt and Decrypt text
 * @author Iker Perez-Calderon
 * @version 3/27/2022
 */
import java.util.Scanner;
public class CaesarTester2 {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        while(loop) {
            int key = 0;
            String message = "";
            String message2 = "";
            String message3 = "";
            String answer = "";
            String choice = "";

            System.out.print("Enter in a shift key 0-25: ");
            key = input.nextInt();
            System.out.println();
            while(!((key >= 0) && (key <=25))) {
                System.out.print("Enter in a shift key 0-25: ");
                key = input.nextInt();
                System.out.println();
            }

            System.out.print("Do you want to encrypt or decrypt a message: ");
            choice = input2.next();
            if(choice.equalsIgnoreCase("encrypt")) {
                System.out.print("Enter in plaintext message: ");
                message = input2.next();
                message2 = input2.nextLine();
                message3 = message + message2;
                System.out.println();
                System.out.println("Message before " + message3.toUpperCase());
                System.out.println("Encrypted message: " + Encryption.encryptMessage(message3.toUpperCase(), key));
            }
            else {
                System.out.print("Enter in ciphertext: ");
                message = input2.next();
                message2 = input2.nextLine();
                message3 = message + message2;
                System.out.println();
                System.out.println("Message before: " + message3.toUpperCase());
                System.out.println("Decrypted message: " + Decryption.decryptMessage(message3.toUpperCase(), key));
            }

            System.out.print("Do you want to continue (y/n): ");
            answer = input3.next();
            System.out.println();
            if(answer.equals("n")) {
                loop = false;
            }
        }
        input.close();
        input2.close();
        input3.close();
    }
}