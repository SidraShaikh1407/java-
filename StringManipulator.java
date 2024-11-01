/*
 * Aim : Create a simple Java application that allows users to perform various
         string manipulation operations. The tool should provide a menu-driven
         interface where users can choose from the following functionalities:
         1.Reverse a String 2.Check for Palindrome 3.Count Vowels and Consonants
         4.Convert to Uppercase and Lowercase 5.Find Substring.
 * Name: Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
import java.util.Scanner;
public class StringManipulator { 
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        String inputString;

		        while (true) {
		            System.out.println("String Manipulation Tool");
		            System.out.println("1. Reverse a String");
		            System.out.println("2. Check for Palindrome");
		            System.out.println("3. Count Vowels and Consonants");
		            System.out.println("4. Convert to Uppercase and Lowercase");
		            System.out.println("5. Find Substring");
		            System.out.println("6. Exit");
		            System.out.print("Choose an option (1-6): ");
		            int choice = scanner.nextInt();
		            scanner.nextLine();  // Consume the newline character

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter a string: ");
		                    inputString = scanner.nextLine();
		                    System.out.println("Reversed String: " + reverseString(inputString));
		                    break;
		                case 2:
		                    System.out.print("Enter a string: ");
		                    inputString = scanner.nextLine();
		                    System.out.println("Is Palindrome: " + isPalindrome(inputString));
		                    break;
		                case 3:
		                    System.out.print("Enter a string: ");
		                    inputString = scanner.nextLine();
		                    countVowelsAndConsonants(inputString);
		                    break;
		                case 4:
		                    System.out.print("Enter a string: ");
		                    inputString = scanner.nextLine();
		                    System.out.println("Uppercase: " + inputString.toUpperCase());
		                    System.out.println("Lowercase: " + inputString.toLowerCase());
		                    break;
		                case 5:
		                    System.out.print("Enter the main string: ");
		                    String mainString = scanner.nextLine();
		                    System.out.print("Enter the substring to find: ");
		                    String substring = scanner.nextLine();
		                    System.out.println("Substring exists: " + mainString.contains(substring));
		                    break;
		                case 6:
		                    System.out.println("Exiting...");
		                    
		                    System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
		            		
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("Invalid choice! Please choose a valid option.");
		            }
		            System.out.println();
		        }
		    }

		    private static String reverseString(String str) {
		        return new StringBuilder(str).reverse().toString();
		    }

		    private static boolean isPalindrome(String str) {
		        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		        return cleanedStr.equals(reverseString(cleanedStr));
		    }

		    private static void countVowelsAndConsonants(String str) {
		        int vowels = 0;
		        int consonants = 0;
		        String lowerStr = str.toLowerCase();

		        for (char c : lowerStr.toCharArray()) {
		            if (Character.isLetter(c)) {
		                if ("aeiou".indexOf(c) != -1) {
		                    vowels++;
		                } else {
		                    consonants++;
		                }
		            }
		        }
		        System.out.println("Vowels: " + vowels);
		        System.out.println("Consonants: " + consonants);
		    }
		}

