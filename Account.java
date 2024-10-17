/* Name:Sidra Shaikh
* Aim:WAP to perform account transaction
* UIN:231P064
* DIV:A
*/
package skll_oop_B3_odd;
import java.util.*;
public class Account {


	      public static void main(String[] args) {  
		 // TODO Auto-generated method stub
		 int acc_no;
		 String name;
		 float amount;
		
		 Scanner sc=new Scanner(System.in);
		
		 System.out.println("\nEnter account number:");
		 acc_no=sc.nextInt();
		
		 System.out.println("\nEnter customer name:");
		 name=sc.next();
		
		 System.out.println("\nEnter customer amount:");
		 amount=sc.nextFloat();
		
		 AccountHelp obj1=new AccountHelp();
		 obj1.insert(acc_no,name,amount);
		 obj1.display();
		 obj1.checkBalance();
		
		 System.out.println("\nEnter Amount to be deposited:");
		 float dep_amount=sc.nextFloat();
		 obj1.deposit(dep_amount);
		 obj1.checkBalance();
		
		 System.out.println("\nEnter Amount to be withdrawn:");
		 float wit_amount=sc.nextFloat();
	     obj1.withdrawn(wit_amount);
	     obj1.checkBalance();
		 System.out.println("\nTHANK YOU");
	     System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

		 }
		 }
		 class AccountHelp
		 {
		 int acc_no;
		 String name;
		 float amount;
		
		 float radius , area;
		 void insert(int a,String n,float amt)
		 {
	     acc_no=a;
		 name=n;
		 amount=amt;
		 }
		 void deposit(float amt)
		 {
		 amount=amount+amt;
		 System.out.println(amt+"deposited");
		 }
		 void withdrawn(float amt)
		 {
		 if(amount<amt)
		 {
		
		 System.out.println("Insufficient Balance");
		
		 }
		 else
		 {
		 amount=amount-amt;
		 System.out.println(amt+"withdrawn");
		
		
		 }
		 }
		 void display()
		 {
		 System.out.println("Account number:"+acc_no);
		 System.out.println("Customer name:"+name);
		 System.out.println("Customer amount:"+amount);


		 }
		
		 void checkBalance()
		 {
		 System.out.println("Balance is:"+amount);

		 }
		 
		 }
		 
	