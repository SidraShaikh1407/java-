/* Aim : Developing a Simple Inventory Management System for a Store.
* Name : Sidra Shaikh
* UIN : 231P064
* Div : A
*/package skll_oop_B3_odd;
 
class Products {
	String name;
	double price;
	int quantity;
	
	public Products (String name, double price, int quantity) {
		super();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
	}
	void displayInformation() {
		System.out.println("Name:" + name + " Price: " + price + " Quantity: " + quantity);
	}
	void updatedPrice (double price) {
		this.price = price;
	}
	void quantity(int quantity) {
		this.quantity = quantity;
	}
	void stockValue(double price, int quantity) {
		System.out.println("Total stock value= " + price * quantity);
	}
}
public class Object {

	public static void main(String[] args) {
		Products p = new Products ("Hair Care Shampoo", 40.0, 5);
		System.out.println("Details of product:\n");
		p.displayInformation();
		
		System.out.println("\nUpdated price and quantity:\n");
		p.updatedPrice(45.0);
        p.quantity(8);
        p.displayInformation();
        
        p.stockValue(p.price,p.quantity);
        
   	 System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

	}

}
