/**
 * This is my own work Jason E. Borum 11/26/2017 Programming Exercise 2.2
 * CST-105
 */

// Add scanner utility for user input
import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {

		// Initilize scanner for user input
		Scanner TempInput = new Scanner(System.in);

		// Prompt user for temperature in Fahrenheit
		System.out.print("Enter a Fahrenheit Temperature: ");

		// Capture user input
		double fahrenheitInput = TempInput.nextDouble();

		// Convert Fahrenheit to Celsius
		double celsius = (5.0 / 9.0) * (fahrenheitInput - 32.0);

		// Print results to screen
		System.out.println(fahrenheitInput + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");

		// Prompt user ford temperature in Celsius
		System.out.print("Enter a Celsius Temperature: ");

		// Capture user input
		double celsiusInput = TempInput.nextDouble();

		// Convert Celsius to Fahrenheit
		double fahrenheit = (celsiusInput * (9.0 / 5.0) + 32.0);

		// Print results to screen
		System.out.println(celsiusInput + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit");
	}
}
