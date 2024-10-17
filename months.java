/* Name:Sidra Shaikh
* Aim:WAP to disaplay month using number(1-12)
* UIN:231P064
* DIV:A
*/
package skll_oop_B3_odd;
import java.util.*;

public class months {
   

		public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		
		 int n;
		 System.out.println("\nMonth no:");
		 n=sc.nextInt();
		 switch(n)
		 {
		 case 1:
		 System.out.println("\nJanuary");
		 break;
		 case 2:
	     System.out.println("\nFebruary");
		 break;
		 case 3:
		 System.out.println("\nMarch");
		 break;
		 case 4:
		 System.out.println("\nApril");
		 break;
		 case 5:
		 System.out.println("\nMay");
		 break;
		 case 6:
		 System.out.println("\nJune");
		 break;
		 case 7:
		 System.out.println("\nJuly");
		 break;
		 case 8:
		 System.out.println("\nAugust");
		 break;
		 case 9:
		 System.out.println("\nSetember");
		 break;
		 case 10:
		 System.out.println("\nOctober");
		 break;
		 case 11:
		 System.out.println("\nNovember");
		 break;
		 case 12:
	   	 System.out.println("\nDecember");
	     break;
		 default:
		 System.out.println("\nInvalid Month number\nPlease try again...\n");
		 break;
		 }
		 System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
		}
	}




