/*
 * Aim :Given a number, and we have to check whether it is Neon number or not using Java program.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A.
 */
package skll_oop_B3_odd;
import java.util.*;
public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int n, sum = 0, lastdigit;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a number to check:");
		   n= sc.nextInt();
		   int Square = n * n;
		   while(Square != 0)  {
			   lastdigit= Square % 10;
			   sum= sum + lastdigit;
			   Square=Square /10;
		   }
		   if (n == sum) {
			   System.out.println("Entered number " + n + " is a Neon Number");
		   }
		   else {
			   System.out.println("Entered Number" + n + " is not a Neon Number");
		   }
		   System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
			}
	}


