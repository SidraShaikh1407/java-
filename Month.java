/*Aim:Program to implement user defined exception in java
 *NAME:Sidra Shaikh
 *UIN:231P064
 *ROLL NO:40
 *DIV:A*/
package skll_oop_B3_odd;
import java.util.Scanner;
public class Month {
	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the month number:");
		n=sc.nextInt();
		try		{
		if(n>12||n<1)
		throw new ArithmeticException();
		System.out.println("Month number entered is="+n);}
		catch(ArithmeticException ae){
		System.out.println("Invalid Number!");}
		System.out.println("\nThank You \nName: Sidra Shaikh \nUIN:231P064 \nRoll no:40 \n ");}}
