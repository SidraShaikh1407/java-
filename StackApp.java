/*
 * Aim : Create a simple Java application that implements a stack data structure
         using an array. The stack should support the following operations:
         1.Push 2.Pop 3.Peek 4.isEmpty 5.Display
 * Name: Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
import java.util.Scanner;

		class Stack {
		    private int[] stack;
		    private int top;
		    private int maxSize;

		    // Constructor to initialize the stack
		    public Stack(int size) {
		        maxSize = size;
		        stack = new int[maxSize];
		        top = -1; // Indicates that the stack is empty
		    }

		    // Push operation to add an element to the top of the stack
		    public void push(int value) {
		        if (top == maxSize - 1) {
		            System.out.println("Stack is full! Cannot push " + value);
		        } else {
		            stack[++top] = value;
		            System.out.println(value + " pushed to stack.");
		        }
		    }

		    // Pop operation to remove and return the top element
		    public int pop() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty! Cannot pop.");
		            return -1; // Return -1 as an error code
		        } else {
		            return stack[top--];
		        }
		    }

		    // Peek operation to return the top element without removing it
		    public int peek() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty! Cannot peek.");
		            return -1; // Return -1 as an error code
		        } else {
		            return stack[top];
		        }
		    }

		    // Check if the stack is empty
		    public boolean isEmpty() {
		        return top == -1;
		    }

		    // Display all elements in the stack
		    public void display() {
		        if (isEmpty()) {
		            System.out.println("Stack is empty.");
		        } else {
		            System.out.print("Stack elements: ");
		            for (int i = top; i >= 0; i--) {
		                System.out.print(stack[i] + " ");
		            }
		            System.out.println();
		        }
		    }
		}

		public class StackApp {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter stack size: ");
		        int size = scanner.nextInt();
		        Stack stack = new Stack(size);

		        while (true) {
		            System.out.println("\nStack Operations Menu");
		            System.out.println("1. Push");
		            System.out.println("2. Pop");
		            System.out.println("3. Peek");
		            System.out.println("4. Check if Empty");
		            System.out.println("5. Display Stack");
		            System.out.println("6. Exit");
		            System.out.print("Choose an option (1-6): ");
		            int choice = scanner.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter a number to push: ");
		                    int value = scanner.nextInt();
		                    stack.push(value);
		                    break;
		                case 2:
		                    int poppedValue = stack.pop();
		                    if (poppedValue != -1) {
		                        System.out.println("Popped value: " + poppedValue);
		                    }
		                    break;
		                case 3:
		                    int topValue = stack.peek();
		                    if (topValue != -1) {
		                        System.out.println("Top value: " + topValue);
		                    }
		                    break;
		                case 4:
		                    System.out.println("Is stack empty? " + stack.isEmpty());
		                    break;
		                case 5:
		                    stack.display();
		                    break;
		                case 6:
		                    System.out.println("Exiting...");
		                    
		    				System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Invalid choice! Please choose a valid option.");
		            }
		        }
		    }
		}
	
