/*
 * Aim : Write a Java program and compute the sum of an integer's digits.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);

          // Prompt user for input
          System.out.print("Enter an integer: ");
          int number = scanner.nextInt();

	  	  // Initialize sum variable
          int sum = 0;

	 	  // Compute the sum of the digits
          while (number != 0) {
		  sum += number % 10; // Add the last digit to the sum
          number /= 10;       // Remove the last digit from the number
		        }

          // Output the result
          System.out.println("The sum of the digits is: " + sum);
		        
	   	  System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

		        scanner.close();
		    }
		}
	
