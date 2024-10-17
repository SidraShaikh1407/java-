/*Aim:Write a program to perform division of two numbers accepted from user. Handle the
      NumberFormatException and also handle the divide by exception using nested try catch block.
*NAME:Sidra Shaikh
*UIN:231P064
*ROLL NO:40
*DIV:A*/
package skll_oop_B3_odd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class NestedDivisionCalculator {
	public static void main(String[] args) {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 try {
	            System.out.print("Enter the first number (dividend): ");
	            String input1 = reader.readLine();
	            double dividend = Double.parseDouble(input1); 
	           try {
	                System.out.print("Enter the second number (divisor): ");
	                String input2 = reader.readLine();
	                double divisor = Double.parseDouble(input2); 
	                try {
	                    double result = dividend / divisor; 
	                    System.out.println("Result: " + result);
	                } catch (ArithmeticException e) {
	                    System.out.println("Error: Division by zero is not allowed."); }
	            } catch (NumberFormatException e) {
	                System.out.println("Error: Invalid input for the divisor. Please enter a numeric value.");   }
	        } catch (IOException e) {
	            System.out.println("Error: An input/output error occurred.");
	        } catch (NumberFormatException e) {
	            System.out.println("Error: Invalid input for the dividend. Please enter a numeric value."); }
    		    System.out.println("\nThank You \nName: Sidra Shaikh \nUIN:231P064 \nRoll no:40 \n ");
			}
	}

