/*
 * Aim : Write a program for delete method of StringBuffer class.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A.
 */
package skll_oop_B3_odd;

public class StrBufferDelete {

	public static void main(String[] args) {
		
		   
		StringBuffer sbf = new StringBuffer("Shaikh Sidra Amjad Ali");
		System.out.println("string = " + sbf);
		
		sbf.delete(7, 12);
		//Enter index position range where elements will be deleted
		
		System.out.println("After deletion string is = " + sbf);
		
		System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
		
	}

}






