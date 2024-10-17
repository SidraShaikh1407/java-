/* Aim :Create a Java program to manage a simple student management system using classes and objects.
* Name : Sidra Shaikh
* UIN : 231P064
* Div : A
*/
package skll_oop_B3_odd;
 
class Student {
	int studentId;
	String name;
	int age;
	char grade;
	
	void insertRecord(int s, String n, int a , char g) {
		studentId=s;
		name=n;
		age=a;
		grade=g;
	}
	void displayInformation() {
		
		System.out.println("Id:"+ studentId+" Name: "+name+" Age:"+age+" Grade: "+grade);
	}
	
}
public class StudentManagementSystem {

	public static void main(String[] args) {
		System.out.println("Details of each Studenta are:\n");
		Student s1=new Student();
		s1.insertRecord(40,"Sidra",19,'A');
        s1.displayInformation();
        
        s1.insertRecord(3,"Bushra",18,'B');
        s1.displayInformation();
        
        s1.insertRecord(75,"Rumaan",17,'C');
        s1.displayInformation();
        
        System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

	}

}
