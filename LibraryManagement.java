/* Aim : Create a Java program to manage a simple library book management system using classes and objects
* Name : Sidra Shaikh
* UIN : 231P064
* Div : A
*/
package skll_oop_B3_odd;

class Book {
	int BookId;
	String Title;
	String Author;
	double Price;
	
	void insertRecord(int b, String T, String A, double P) {
		BookId = b;
		Title = T;
		Author = A;
		Price = P;
		
	}
	
	void  displayInformation() {
		System.out.println("Id: " + BookId + " Title: " + Title + " Author: " + Author + " Price: " + Price);
	}
}
public final class LibraryManagement {

	public static void main(String[] args) {
		Book b1 = new Book();
		System.out.println("Details of each book:\n");
		b1.insertRecord(55, "Atomic Habits","James Clear", 400.0);
        b1.displayInformation();
        
        b1.insertRecord(67, "Psychology of Money ","Morgan Housel", 150.0);
        b1.displayInformation();
        
        b1.insertRecord(75, "Power of Subconcious Mind","Joseph Murphy", 300.0);
        b1.displayInformation();
        
        System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

        
	}

}
