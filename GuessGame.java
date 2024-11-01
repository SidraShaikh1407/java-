/* Aim : The program should generate a random number between 1 and 100,
         Sand the user should have up to 10 attempts to guess the number.
* Name : Sidra Shaikh
* UIN : 231P064
* Div : A
*/
package skll_oop_B3_odd;
import java.util.*;
public class GuessGame {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	Random random =new Random();
	int targetNumber = random.nextInt(100)+1;
	
	int numberOfAttempts = 0;
	System.out.println("Enter a number between 1 to 100");
	 
	do {
		System.out.println(" guess number " + (numberOfAttempts + 1) + ":");
		
		int guess = sc.nextInt();
		if(guess==targetNumber)  {
			System.out.println("" + "Congratulations! You guessed " + "the number in " + numberOfAttempts + " tries.");
			break;
		}
		else if(guess < targetNumber) {
			System.out.println("Your guess is too low. Try again.");
		}
		else {
			System.out.println("Your guess is too high. Try again.");
		}
		numberOfAttempts++;
	}while (numberOfAttempts < 10);
	
	if (numberOfAttempts==10)  {
		System.out.println("You are out of 10 attempts, correct number was:"+targetNumber);
	}
	 System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");
}

}