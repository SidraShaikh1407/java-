/*
 * Aim : Write an object oriented program in java that uses Euclid's algorithm to display Greatest
         common divisor of two integers. Use a default constructor to initialize two numbers. The
         calculate () method to calculate the GCD and display () method to display the same.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
public class EuclidAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GCD obj = new GCD();

     
        obj.GCD();
        obj.display();
        
        System.out.println("Thank You ");
    	
        System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
	}

}

class GCD
{
	 int number1;
	 int number2;
   	  int gcd;
    {

 
        this.number1 = 20; 
        this.number2 = 14;
        
        
    }
	public void GCD() {
        int a = number1;
        int b = number2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        gcd = a; 
    }

  
    public void display() {
        System.out.println("The GCD of " + number1 + " and " + number2 + " is: " + gcd);
    }
}

