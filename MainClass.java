/*AIM:Write a program to implement interface demonstrating the concept of multiple inheritance.
* NAME:Sidra Shaikh
* DIV:A
* Roll no:40
* UIN:231P064
*/
package skll_oop_B3_odd;
import java.util.Scanner;

class Student11 {
    int rollNumber;

    void getNumber(int n) {
        rollNumber = n;
    }

    void printNumber() {
        System.out.println("Roll Number is " + rollNumber);
    }
}

class Test extends Student11 {
    float part1, part2;

    void getMarks(float a, float b) {
        part1 = a;
        part2 = b;
    }

    void putMarks() {
        System.out.println("Marks Part 1: " + part1);
        System.out.println("Marks Part 2: " + part2);
    }
}

interface Sports {
    void putwt();
}

class Results extends Test implements Sports {
    float sportwt; // Changed from constant to a variable to take input dynamically
    float total;

    void getSportsMarks(float sportMarks) {
        sportwt = sportMarks;
    }

    public void putwt() {
        System.out.println("Sports Marks: " + sportwt);
    }

    void display() {
        total = part1 + part2 + sportwt;
        System.out.println("Total marks of Roll Number " + rollNumber + " is " + total);
        
		System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

    }
}

public class MainClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of the Results class
        Results student = new Results();

        // Taking input for the roll number
        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        // Taking input for the marks
        System.out.print("Enter marks for Part 1: ");
        float part1Marks = sc.nextFloat();

        System.out.print("Enter marks for Part 2: ");
        float part2Marks = sc.nextFloat();

        // Taking input for sports marks
        System.out.print("Enter Sports Marks: ");
        float sportsMarks = sc.nextFloat();

        // Setting the roll number, academic marks, and sports marks
        student.getNumber(rollNumber);
        student.getMarks(part1Marks, part2Marks);
        student.getSportsMarks(sportsMarks);

        // Displaying the roll number, marks, and sports weight
        student.printNumber();
        student.putMarks();
        student.putwt();
        student.display();

        // Closing the scanner
        sc.close();
    }
}
