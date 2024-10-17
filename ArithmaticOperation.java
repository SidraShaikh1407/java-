/* Aim :WAP to display arithmatic operations.
* Name : Sidra Shaikh
* UIN : 231P064
* Div : A
*/
package skll_oop_B3_odd;
import java.util.*;
public class ArithmaticOperation {
	
			public static void main(String[] args) {
				int choice,x,y;
				Scanner sc=new Scanner(System.in);
				
				do {
				System.out.println("MENU");
				System.out.println("1.Addition");
				System.out.println("2.Subtraction");
				System.out.println("3.Multiplication");
				System.out.println("4.Division");
				System.out.println("5.Modulus");
				System.out.println("6.Exit");
				 
				
				System.out.println("Enter Your choice:-");
				choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:System.out.println("Addition");
				       System.out.println("Enter First number:");
				       x=sc.nextInt();
				       System.out.println("Enter second number:");
				       y=sc.nextInt();
				       
				       System.out.println("x+y:"+(x+y));
				       break;
				       
				case 2:System.out.println("Subtraction");
			           System.out.println("Enter First number:");
			           x=sc.nextInt();
			           System.out.println("Enter second number:");
			            y=sc.nextInt();
			       
			           System.out.println("x-y:"+(x-y));
			           break;
			           
				case 3:System.out.println("Multiplication");
			           System.out.println("Enter First number:");
			           x=sc.nextInt();
			           System.out.println("Enter second number:");
			           y=sc.nextInt();
			       
			           System.out.println("x*y:"+(x*y));
			           break;
			           
				case 4:System.out.println("Division");
			           System.out.println("Enter First number:");
			           x=sc.nextInt();
			           System.out.println("Enter second number:");
			           y=sc.nextInt();
			       
			           System.out.println("x/y:"+(x/y));
			           break;
			           
				case 5:System.out.println("Modulus");
			           System.out.println("Enter First number:");
			           x=sc.nextInt();
			           System.out.println("Enter second number:");
			           y=sc.nextInt();
			       
			           System.out.println("x%y:"+(x%y));
			           break;
			           
				case 6:System.out.println(" Thank you");
				       System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
				       System.exit(0);
				       
				default:System.out.println("Wrong choice !!");
				}
				}while(choice!=6);
				


	}

}



