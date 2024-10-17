/*AIM:Write a program in java to perform (ii) String Buffer
		Functions
		2 * NAME:Sidra Shaikh
		3 * DIV:A
		4 * Roll no:40
		5 * UIN:231P064
		6 */
package skll_oop_B3_odd;
import java.util.*;
public class Palindrome {

		 public static void main(String[] args) {
		 String str,rev;
		 StringBuffer str1=new StringBuffer();
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter string:");
		 str=sc.nextLine();
		 str1.append(str);
		 str1.reverse();
		 rev=str1.toString();
		 if(str.equalsIgnoreCase(rev))
		 System.out.println("\nPalindrome");
		 else
		 System.out.println("\nNot a palindrome");
		 {
			 System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
		 }
		
		
		 }
		
		 }
	


