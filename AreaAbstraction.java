     /*Aim:Write a program to calculate volume of sphere using multilevel inheritance.
	*NAME:Sidra Shaikh
	*UIN:231P064
	*ROLL NO:40
	*DIV:A*/
    package skll_oop_B3_odd;
	import java.io.*;
	abstract class Shape
	{
	abstract void draw();
	}
	//In real scenario, implementation is provided by others i.e. unknown by end user
	class Rectangle extends Shape
	{ int l,w;
	Rectangle() throws IOException
	{ DataInputStream in=new DataInputStream(System.in);
	System.out.println("\n\n\n");
	System.out.println("******Rectangle******");
	System.out.println("Enter Length and width of Rectangle");
	l=Integer.parseInt(in.readLine());
	w=Integer.parseInt(in.readLine());
	}

	void draw()
	{
	System.out.println("Area of Rectangle = "+(l*w));
	
	System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

	}

	public void area() {
		// TODO Auto-generated method stub
		
	}
	}

	class Circle1 extends Shape
	{ double r;
	Circle1() throws IOException
	{
	DataInputStream in=new DataInputStream(System.in);
	System.out.println("******Circle******");
	System.out.println("Enter Radius of a Circle");
	r=Double.parseDouble(in.readLine());
	}
	void draw()
	{
	System.out.println("Area of Circle = "+(0.5*r*r));
	}
	}

	//In real scenario, method is called by programmer or user
	public class AreaAbstraction
	{
	public static void main(String args[]) throws IOException
	{
	Circle1 c=new Circle1();
	c.draw();
	Rectangle d=new Rectangle();

	d.draw();
	}
	}

