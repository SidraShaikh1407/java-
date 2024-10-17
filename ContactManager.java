/*
 * Aim : Create a simple Java application to manage a contact list using the
         Vector class. The application should allow users to perform the
         following operations: 1.Add a Contact 2. Remove A contact 
         3.Display all contact 4.Search for contact
 * Name: Sidra Shaikh
 * UIN : 231P064
 * Div : A
 */
package skll_oop_B3_odd;
import java.util.Scanner;
import java.util.Vector;

		class Contact {
		    private String name;
		    private String phoneNumber;

		    public Contact(String name, String phoneNumber) {
		        this.name = name;
		        this.phoneNumber = phoneNumber;
		    }

		    public String getName() {
		        return name;
		    }

		    public String getPhoneNumber() {
		        return phoneNumber;
		    }

		    @Override
		    public String toString() {
		        return "Name: " + name + ", Phone Number: " + phoneNumber;
		    }
		}

		public class ContactManager {
		    private Vector<Contact> contacts;

		    public ContactManager() {
		        contacts = new Vector<>();
		    }

		    public void addContact(String name, String phoneNumber) {
		        contacts.add(new Contact(name, phoneNumber));
		        System.out.println("Contact added: " + name);
		    }

		    public void removeContact(String name) {
		        for (int i = 0; i < contacts.size(); i++) {
		            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
		                contacts.remove(i);
		                System.out.println("Contact removed: " + name);
		                return;
		            }
		        }
		        System.out.println("Contact not found: " + name);
		    }

		    public void displayAllContacts() {
		        if (contacts.isEmpty()) {
		            System.out.println("Contact list is empty.");
		        } else {
		            System.out.println("Contacts:");
		            for (Contact contact : contacts) {
		                System.out.println(contact);
		            }
		        }
		    }

		    public void searchContact(String name) {
		        for (Contact contact : contacts) {
		            if (contact.getName().equalsIgnoreCase(name)) {
		                System.out.println("Contact found: " + contact);
		                return;
		            }
		        }
		        System.out.println("Contact not found: " + name);
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        ContactManager manager = new ContactManager();
		        int choice;

		        do {
		            System.out.println("\nContact Manager Menu:");
		            System.out.println("1. Add a Contact");
		            System.out.println("2. Remove a Contact");
		            System.out.println("3. Display All Contacts");
		            System.out.println("4. Search for a Contact");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();
		            scanner.nextLine(); // Consume newline

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter contact name: ");
		                    String nameToAdd = scanner.nextLine();
		                    System.out.print("Enter phone number: ");
		                    String phoneToAdd = scanner.nextLine();
		                    manager.addContact(nameToAdd, phoneToAdd);
		                    break;
		                case 2:
		                    System.out.print("Enter contact name to remove: ");
		                    String nameToRemove = scanner.nextLine();
		                    manager.removeContact(nameToRemove);
		                    break;
		                case 3:
		                    manager.displayAllContacts();
		                    break;
		                case 4:
		                    System.out.print("Enter contact name to search: ");
		                    String nameToSearch = scanner.nextLine();
		                    manager.searchContact(nameToSearch);
		                    break;
		                case 5:
		                    System.out.println("Exiting...");
		                    
		                    System.out.println("\nName:Sidra Shaikh \nRoll no:40 \nUIN:231P064 \nDiv:A ");

		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 5);
		        scanner.close();
		    }
		}
