/*Aim:WAP to display pattern using for loop
* Name:Sidra Shaikh
* UIN:231P064
* DIV:A
*/
package skll_oop_B3_odd;
import java.util.*;
public class Pattern1 {
		 
		  public static void main(String[] args) {
		 int n,i,j;
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter number of row/column");
		 n=sc.nextInt();
		
		 for (i=1;i<=n;i++)
		 {
		 for(j=1;j<=i;j++)
		 {
		 System.out.print("*");
		 }
		 System.out.println();
		 }
	       System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

	}

}







