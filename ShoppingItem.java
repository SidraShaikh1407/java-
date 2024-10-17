/*AIM:Write a program in java to perform (i) Vector operations
		2 * NAME:Sidra Shaikh
		3 * DIV:A
		4 * Roll no:40
		5 * UIN:231P064
		6 */
package skll_oop_B3_odd;
import java.util.*;
public class ShoppingItem {

	     public static void main(String args[])
		 {
		 Vector list = new Vector();
		 int len=args.length;
		 for(int i=0;i<len;i++)
		 {
		 list.addElement(args[i]);
		 }
		 int size=list.size();
		 String str[]= new String[size];
		 list.copyInto(str);
		 for(int i=0;i<size;i++)
	      {
		 System.out.println ("Element of Vector at position"+i+":"+str[i]);
		 }
		 {
		 System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

		 }
		
		 }
		 }
	


