/*AIM:WAP to count character in given string.
*NAME:SIDRA SHAIKH
*UIN:231P064
*ROLL NO:40
*/
package skll_oop_B3_odd;
import java.util.*;
public class Frequency {

	 public static void main(String[]args) {
		
		 Scanner sc = new Scanner(System.in);
		 String str = new String();
		 char ch ='a';
		 int len,count=0;
		
		 System.out.println("Enter String: ");

	
		 str = sc.nextLine();
		
		 System.out.println("Enter a character to be searched ");
		 ch = sc.next().charAt(0);
		 System.out.println("String is "+str);
		
		 len = str.length();
		 for(int i=0;i<=len-1;i++)
		 if(ch==str.charAt(i))
		 count++;
		 System.out.println("Frequency of character '"+ch+"' in string is "+count);
		 sc.close();
		
	     System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
		
		 }
		          
		 }
	  


