/*
 * Aim : Write a program to add integer number and string using method overloading.
 * Name :Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
public class AddStringAndInteger {
public static void main(String[] args) {
    StrInt obj = new StrInt();

  
    int sum = obj.add(14, 20);
    System.out.println("Sum of integers: " + sum);

 
    String concatenatedString = obj.add("Hello, ", "World!");
    System.out.println("Concatenated String: " + concatenatedString);
    
    System.out.println("Thank You ");
	
	System.out.println("Name :Sidra Shaikh ");
	System.out.println("UIN : 231P064");
	
	
	}
		}


	class StrInt
	{

		public int add(int a, int b)
		{
			return a + b;
		}
		
		
	public String add(String a, String b) 
	{
		return a + b;
	}
	
	}

	
	
	