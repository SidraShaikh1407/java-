/* Aim :WAP to display arithmatic operations.
* Name : Sidra Shaikh
* UIN : 231P064
* Div : A
*/
package skll_oop_B3_odd;
import java.util.*;
public class ArithmaticOperation_2 {
    
	public static void main(String[] args) {
				char ch;
				int x,y;
				Scanner sc=new Scanner(System.in);
			
				do {
				System.out.println("MENU");
				System.out.println("+");
				System.out.println("-");
				System.out.println("*");
				System.out.println("/");
				System.out.println("%");
				System.out.println("&");
				 
				
				System.out.println("Enter Your choice");
				ch=sc.next().charAt(0);
				
				switch(ch)
				{
				case '+':System.out.println("+");
			             System.out.println("Enter First number:");
				         x=sc.nextInt();
				         System.out.println("Enter second number:");
				         y=sc.nextInt();
				       
				         System.out.println("x+y:"+(x+y));
				         break;
				       
				case '-':System.out.println("-");
			            System.out.println("Enter First number:");
			            x=sc.nextInt();
			            System.out.println("Enter second number:");
			            y=sc.nextInt();
			       
			           System.out.println("x-y:"+(x-y));
			           break;
			           
				case '*':System.out.println("*");
			           System.out.println("Enter First number:");
			           x=sc.nextInt();
			           System.out.println("Enter second number:");
			           y=sc.nextInt();
			       
			           System.out.println("x*y:"+(x*y));
			           break;
			           
				case '/':System.out.println("/");
			           System.out.println("Enter First number:");
			           x=sc.nextInt();
			           System.out.println("Enter second number:");
			           y=sc.nextInt();
			       
			           System.out.println("x/y:"+(x/y));
			           break;
			           
				case '%' :System.out.println("%");
			           System.out.println("Enter First number:");
			           x=sc.nextInt();
			           System.out.println("Enter second number:");
			           y=sc.nextInt();
			       
			           System.out.println("x%y:"+(x%y));
			           break;
			           
				case '&':System.out.println("&");
			             System.out.println(" Thank you");
			             System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
				         System.exit(0);
				       
				default:System.out.println("Wrong choice !!");
				}
				}while(ch!=6);
				

			}
		}
	
