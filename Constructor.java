/*AIM:WAP TO CALCULATE AREA OF CIRCLE,TRIANGLE,RECTANGLE USING CONSTRUCTOR
	  OVERLOAD.
*NAME:SIDRA SHAIKH
*UIN:231P064
*ROLL NO:40
*DIV:A
*/
package skll_oop_B3_odd;
import java.util.*;
public class Constructor {
		
		 public static void main(String[] args) {
		
		
		 Scanner sc =new Scanner(System.in);
		
		 int length, breath;
		 double height, base;
		 int radius;
		
		 System.out.println("Start the program : ");
		
		
		 System.out.println("Enter length : ");
		 length = sc.nextInt();
		 System.out.println("Enter breath : ");
		 breath = sc.nextInt();
		
		 ConsOf a1=new ConsOf(length, breath );
		
		
		 System.out.println("Enter height: ");
		 height = sc.nextDouble();
		 System.out.println("Enter base : ");
		 base = sc.nextDouble();
		
		 ConsOf b1=new ConsOf (height, base );
		
		
		 System.out.println("Enter radius : ");
		 radius = sc.nextInt();
		
		 ConsOf c1=new ConsOf (radius );
		
		 a1.display();
		 b1.display();
		 c1.display();
		
		 System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
		
		 }
		 }
		
		
		 class ConsOf {
		
		 double result1;
		 double result2;
		 double result3;
		
		 // method for rectangle
		 ConsOf(int length , int breath)
		 {
		 result1 = (length * breath);
		 }
		
		 // method for triangle
		 ConsOf( double height, double base)
		 {
		 result2 = (height * base)/2;
		
		 }
		
		 // method for circle
		 ConsOf( int radius)
		 {
		 result3 = 3.14*radius*radius;
		
		 }
		
		 void display()
		 {
	     System.out.println("The area of the rectangle is :"+result1);
		 System.out.println("The area of the triangle is : "+result2);
		 System.out.println("The area of the circle is : "+result3);
		 }

		 }
	


