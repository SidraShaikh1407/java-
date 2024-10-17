/*Aim:WAP to display pattern using label
* Name:Sidra Shaikh
* UIN:231P064
* DIV:A
*/
package skll_oop_B3_odd;
import java.util.*;
public class Pattern5 {

		 public static void main(String[] args) {
		 int i,j,n;
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("Enter number of row/column");
		 n=sc.nextInt();
		 stop:{
		 nextRow:
		 for(i=1;i<=7;i++)
		 {
		 if(i==6)
		 break stop;
		 System.out.println("");
		 for(j=1;j<=10;j++)
		 {
		 if(j>i)
		 continue nextRow;
		 System.out.print("*");
		 
		 }
		 }
		
		 }
	       System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

		 }
		
		 }
	

