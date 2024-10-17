/*
 * Aim : Write a program for replace method of StringBuffer class.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A.
 */
package skll_oop_B3_odd;

public class StrBufferReplace {

	public static void main(String[] args) {
      
	StringBuffer sbf = new StringBuffer("Shaikh Sidra Amjad Ali");
	System.out.println("string = " + sbf);
	
	sbf.replace(7, 12,"Bushra");
	//Enter index position range and string using which need to replace
	
	System.out.println("After replace string is = " + sbf);
	
	System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
	
	}

}





