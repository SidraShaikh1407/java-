/*
 * Aim :Given a number, and we have to check whether it is Spy number or not using Java program.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A.
 */
package skll_oop_B3_odd;
import java.util.*;
public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n, product = 1, sum = 0, lastdigit;
   
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number to check:");
   n= sc.nextInt();
   int m=n;
    
   while (n>0)   {
	   lastdigit= n % 10;
	   sum= sum + lastdigit;
	   product = product * lastdigit;
	   n=n /10;
   }
   if (sum==product) {
	   System.out.println("Entered number " + m + " is a Spy Number");
   }
   else {
	   System.out.println("Entered Number" + m + " is not a Spy Number");
   }
   System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
	}

}
