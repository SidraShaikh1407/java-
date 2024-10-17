	/*AIM:Write a program to override area () method of Shape class into its subclasses Rectangle and
	Square. Shape is an abstract class.
	*NAME:Sidra Shaikh
	*UIN:231P064
	*ROLL NO:40
	*Div:A */
    package skll_oop_B3_odd;
	import java.util.Scanner;
	abstract class Shape1 {
	abstract double area();
	}
	class Rectangle1 extends Shape1 {
	private double width;
	private double height;
	Rectangle1() {
	Scanner sc=new Scanner(System.in);
	System.out.println("***Rectangle***");
	System.out.println("Enter width and height of Rectangle:");
	width=sc.nextDouble();
	height=sc.nextDouble();
	}
	@Override
	double area() {
	System.out.println("Area of rectngle:"+width * height);
	return width * height;
	}
	}
	class Square extends Shape1 {
	private double sideLength;
	Square() {
	Scanner sc=new Scanner(System.in);
	System.out.println("\n");
	System.out.println("***Square***");
	System.out.println("Enter sideLength of square:");
	sideLength=sc.nextDouble();
	}
	@Override
	double area() {
	System.out.println("Area of square:"+sideLength * sideLength);
	return sideLength * sideLength;
	}
	}
	public class Main1 {
	public static void main(String[] args) {
	Rectangle1 r = new Rectangle1();
	r.area();
	Square s = new Square();
	s.area();
	System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
	}
	}
	