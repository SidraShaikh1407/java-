/*
 * Aim :Write an object oriented program to make a class called as circle. It should have three
   methods namely: accept radius, calculate area and display area.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
import java.util.*;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float r;
		float area;
		double pi=3.142;
		
		CIRCLE obj3 = new CIRCLE();
		 
		obj3.acceptRadius();
		
		obj3.calculateArea();
		
		obj3.display();

	}

}

	class CIRCLE{
		
		float r;
		float area;
		double pi=3.142;
		
		
		Scanner sc = new Scanner(System.in);
		
		
		void acceptRadius()
		{
			System.out.println("Enter a radius : ");
			r=sc.nextFloat();
		}
		
		double calculateArea()
		{
			return pi*r*r;
			
			
		}
		
		
		void display()
		{
			System.out.println("The entered radius is : "+r);
			System.out.println("The value of the calculated area of the circle is : "+calculateArea());
		}
	}


