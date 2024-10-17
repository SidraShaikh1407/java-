/*
 * Aim : Create a class Student with private attributes for name and age.
         Use a constructor to initialize these attributes and provide public getter
         methods to access them.
         In the main method, an instance of Student is created, and the student's
         details are printed.
 * Name : Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;

	// Define the Student class
	class Student1 {
	    // Private attributes
	    private String name;
	    private int age;

	    // Constructor to initialize the attributes
	    public Student1(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Getter method for name
	    public String getName() {
	        return name;
	    }

	    // Getter method for age
	    public int getAge() {
	        return age;
	    }
	}

	// Main class to demonstrate the functionality
	public class Main {
	public static void main(String[] args) {
	// Create an instance of Student
	Student1 student = new Student1("Bob", 21);

    // Print the student's details
	System.out.println("Student Name: " + student.getName());
    System.out.println("Student Age: " + student.getAge());
	        
	        
	System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

	    }
	}

	

	
