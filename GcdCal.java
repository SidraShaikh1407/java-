/* Aim : Write an object oriented program in java that uses Euclid’s algorithm to display Greatest
common divisor of two integer
* Name : Sidra Shaikh
* UIN : 231P064
* Div : A
*/
package skll_oop_B3_odd;
import java.util.Scanner;

public class GcdCal {

 public int calculateGCD(int a, int b) {
       
       if (b > a) {
           int temp = a;
           a = b;
           b = temp;
       }
       
       
       while (b != 0) {
           int remainder = a % b;
           a = b;
           b = remainder;
       }
       
       return a;     }

   
   public static void main(String[] args) {
   
       Scanner scanner = new Scanner(System.in);
       
       
       GcdCal gcdCal = new GcdCal();
       
      
       System.out.print("Enter the first integer: ");
       int num1 = scanner.nextInt();
       
       System.out.print("Enter the second integer: ");
       int num2 = scanner.nextInt();
       
       // Calculate GCD
       int gcd = gcdCal.calculateGCD(num1, num2);
       
     
       System.out.println("The Greatest Common Divisor of " + num1 + " and " + num2 + " is: " + gcd);
       
       System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
   }
}


