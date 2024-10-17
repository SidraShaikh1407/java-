/*AIM:Write a program to implement single and multilevel inheritance using
      super keyword.
* NAME:Sidra Shaikh
* DIV:A
* Roll no:40
* UIN:231P064
*/
package skll_oop_B3_odd;
import java.util.Scanner;

class Account1 {
    String cust_name;
    int acc_no;

    Account1(String a, int b) {
        cust_name = a;
        acc_no = b;
    }

    void display() {
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Account No: " + acc_no);
    }
}

class Online extends Account1 {
    Online(String a, int b) {
        super(a, b);
    }

    void display() {
        System.out.println("Customer-Id: " + (cust_name + acc_no % 10));
        System.out.println("Customer Password: " + (acc_no / 10 + 8));
        
		System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

    }
}

class Saving_Acc extends Account1 {
    int min_bal, saving_bal;

    Saving_Acc(String a, int b, int c, int d) {
        super(a, b);
        min_bal = c;
        saving_bal = d;
    }

    void display() {
        super.display();
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Saving Balance: " + saving_bal);
    }
}

class Acct_Details extends Saving_Acc {
    int deposits, withdrawals;

    Acct_Details(String a, int b, int c, int d, int e, int f) {
        super(a, b, c, d);
        deposits = e;
        withdrawals = f;
    }

    void display() {
        super.display();
        System.out.println("Deposit: " + deposits);
        System.out.println("Withdrawals: " + withdrawals);
    }
}

public class Single_Multilevel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for Account details
        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        System.out.print("Enter minimum balance: ");
        int minBalance = sc.nextInt();

        System.out.print("Enter saving balance: ");
        int savingBalance = sc.nextInt();

        System.out.print("Enter deposits: ");
        int deposits = sc.nextInt();

        System.out.print("Enter withdrawals: ");
        int withdrawals = sc.nextInt();

        // Creating objects
        Acct_Details A = new Acct_Details(name, accNo, minBalance, savingBalance, deposits, withdrawals);
        Online ol = new Online(name, accNo);

        // Displaying the details
        A.display();
        ol.display();

        sc.close();
    }
}
