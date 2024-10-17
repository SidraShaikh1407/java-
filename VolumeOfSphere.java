
	/*Aim:Write a program to calculate volume of sphere using multilevel inheritance demonstrating
	method overriding.
	*NAME:Sidra Shaikh
	*UIN:231P064
	*ROLL NO:40
	*DIV:A*/
    package skll_oop_B3_odd;
	import java.util.Scanner;
	class RadiusTwo{
	float radius;
	public RadiusTwo(float r) {
	radius = r;
	}
	void display() {
	System.out.println(radius);
	}
	}
	
	class AreaOfCircleTwo extends RadiusTwo{
	public AreaOfCircleTwo(float r) {
	super(r);
	}
	void findArea() {
	float area = (float) (3.14 * radius * radius);
	System.out.println("Area of cirlce: "+area);
	}
	}
	class VolumeSphereTwo extends AreaOfCircleTwo{
	public VolumeSphereTwo(float r) {
	super(r);
	}
	void findVolume (){
	float volume = (float) ((4 / 3) * 3.14 * (radius * radius * radius));
	System.out.println("volume of sphere: "+volume);
	}
	}
	public class VolumeOfSphere {
	public static void main(String[] args) {
	System.out.println("Enter radius: ");
	Scanner sc = new Scanner(System.in);
	float in = sc.nextFloat();
	VolumeSphereTwo volumeOfSphere = new VolumeSphereTwo(in);
	volumeOfSphere.findVolume();
	System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

	}
	}

	