
/**
 * This is my own work
 * Jason E. Borum
 * 11/26/2017
 * Programming Exercise 2.1
 * CST-105
 */

//Add scanner utility for user input
import java.util.Scanner;

public class FiveDigitPositiveInteger {

	public static void main(String[] args) {
		// Initialize scanner
		Scanner input = new Scanner(System.in);

		// Prompt user for integer
		System.out.print("Enter 5 digit positive integer : ");

		// Capture user input
		Integer userInteger = input.nextInt();

		// Get the length of the user integer
		int integerLength = (int) Math.log10(userInteger) + 1;

		// Testing if integer length is not equal to 5
		while (integerLength != 5) {
			if (integerLength < 5) {

				// Provide feedback if integer length is less than 5
				System.out.println("<" + integerLength + "> " + "Length is less than 5");

			} else if (integerLength > 5) {
				// Provide feedback if integer length is greater than 5
				System.out.println("<" + integerLength + "> " + "Length is greater than 5");
			}

			// Prompt user to enter a new digit if less than or greater than 5 digits
			System.out.print("Enter new 5 digit integer : ");

			// Capture new integer
			userInteger = input.nextInt();

			// Get the length of the new integer
			integerLength = (int) Math.log10(userInteger) + 1;

		}

		// Calculate the sum of the integers
		userInteger = (userInteger % 10) + (userInteger / 10 % 10) + (userInteger / 100 % 10)
				+ (userInteger / 1000 % 10) + (userInteger / 10000 % 10);

		// Print value to the screen
		System.out.println(userInteger);
	}
}
