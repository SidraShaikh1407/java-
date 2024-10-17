/*Aim :Write an object oriented program to make a class called as circle. It should have three
	   methods namely: accept radius, calculate area and display area.
* Name:Sidra Shaikh
* UIN:231P064
* Roll no:40
* Div:A
*/
package skll_oop_B3_odd;
import java.util.*;
public class CirclePost {

	   public static void main(String[] args) {
			
			float r;
			float area;
			double pi=3.142;
			
			Circleobject obj3 = new Circleobject();
			obj3.acceptRadius();
			obj3.calculateArea();
			obj3.display();

		}

	}

		class Circleobject{
			
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
			    System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

			}
		}



