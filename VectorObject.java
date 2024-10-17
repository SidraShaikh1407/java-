/*
 * Aim : Write a program to create vector objects with student name. Program should perform following
         operations based on choice:
         (i) Add student name
         (ii) Remove student name
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
import java.util.*;
import java.util.Enumeration;
public class VectorObject {

	public static void main(String[] args) {
		
		int input;
		Vector<String> v = new Vector<>();
		do {
			System.out.println("Menu \n1.Add a name \n2.Remove a name \n3.Exit");
			Scanner sc = new Scanner(System.in);
			input =sc.nextInt();
			
			if (input == 1) {
				System.out.println("enter your name");
				String name = sc.next();
				v.add(name);
				System.out.println("The Vector elements are: ");
				Enumeration e =v.elements();
				while (e.hasMoreElements())  {
					System.out.println(e.nextElement());
					}
				System.out.println(" ");
				
		} else if (input==2)  {
			
			System.out.println("Enter name to be removed");
			String name = sc.next();
			
			int index = v.indexOf(name);
			v.remove(index);
			System.out.println("The Vector elements are:");
			Enumeration e = v.elements();
			while(e.hasMoreElements())  {
				System.out.println(e.nextElement());
			}System.out.println(" ");
			
		}
		
}while (input != 3);

System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

}
}





