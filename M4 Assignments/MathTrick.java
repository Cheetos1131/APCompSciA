/**
 * Purpose: This program is a math trick that take 2 numbers in which the first and last digits differ by more than one,
 * and performs calculations on it before it is converted to test and reversed to give you APRILFOOL every time.
 * @author Iker Perez-Calderon
 * @version 12/9/2021
 * 
 * 
 *
 */
import java.lang.Math;

public class MathTrick {

	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;
		do {
			num = 100 + (int)(Math.random() * ((999 - 100) + 1));
			lastDigit = num % 10;
			firstDigit = num / 100;
		}while(Math.abs(lastDigit - firstDigit) < 2);	

		return num;
	}

	public static int reverseDigits (int num) {
		int reversedNumber = 0;
		while(num != 0) {
			int remainder = num % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			num /= 10;
		}
		return reversedNumber;
	}
	
	public static String replaceLtr(String replaceString) {
		String finalString = "";
		for (int i = 0; i < replaceString.length(); i++) {
			if (replaceString.substring(i, i + 1).equalsIgnoreCase("0")) {
				finalString += "Y";
			}
			else if (replaceString.substring(i, i + 1).equalsIgnoreCase("1")) {
				finalString += "M";
			}
			else if (replaceString.substring(i, i + 1).equalsIgnoreCase("2")) {
				finalString += "P";
			}
			else if (replaceString.substring(i, i + 1).equalsIgnoreCase("3")) {
				finalString += "L";
			}
			else if (replaceString.substring(i, i + 1).equalsIgnoreCase("4")) {
				finalString += "R";
			}
			else if (replaceString.substring(i, i + 1).equalsIgnoreCase("5")) {
				finalString += "O";
			}
			else if (replaceString.substring(i, i + 1).equalsIgnoreCase("6")) {
				finalString += "F";
			}
			else if (replaceString.substring(i, i + 1).equalsIgnoreCase("7")) {
				finalString += "A";
			}
			else if (replaceString.substring(i, i + 1).equalsIgnoreCase("8")) {
				finalString += "I";
			}
			else {
				finalString += "B";
			}
		}
		return finalString;	
	}
	
	public static String reverseString(String str) {
		String reversedLetters = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			if (i == 9) {
				reversedLetters += str.substring(i);
			}
			else {
				reversedLetters += str.substring(i, i + 1);
			}
		}
		return reversedLetters;
	}
		
	public static void main(String[] args) 
	{
		int num = getRandomNum();
		System.out.println("Starting number: " + num);
		int reverse = reverseDigits(num);
		System.out.println("Reverse number: " + reverse);
		int differenceNumber = Math.abs(num - reverse);
		System.out.println("Number difference: " + differenceNumber);
		num = reverseDigits(differenceNumber);
		num += differenceNumber;
		System.out.println("Reversed added to difference: " + num);
		num *= 1000000;
		System.out.println("Number * 1000000: " + num);
		num -= 733361573;
		System.out.println("Number after -733361573: " + num);
		String numString = String.valueOf(num);
		System.out.println("Number converted to String: " + numString);
		String convertedString = replaceLtr(numString);
		System.out.println("Numbers converted to letters: " + convertedString);
		String finalOutput = reverseString(convertedString);
		System.out.println("Letters reversed: " + finalOutput);

	}
}