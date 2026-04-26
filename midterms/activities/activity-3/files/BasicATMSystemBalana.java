package midterm;

import java.util.Scanner;

public class BasicATMSystemBalana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;

		// Initial account values
		float initial_balance = 5000;
		float withdraw = 0;
		float deposit = 0;
		float allowed_withdraw_amount = 2000;
		
		do {
			
			// Prints the ATM Menu
			System.out.println("===== ATM MENU =====");
			System.out.println("");
			System.out.println("1. Check Balance");
			System.out.println("");
			System.out.println("2. Deposit");
			System.out.println("");
			System.out.println("3. Withdraw");
			System.out.println("");
			System.out.println("4. Exit");
			System.out.println("");
			
			// Get user menu choice
			System.out.print("Enter choice [1-4]: ");
			choice = sc.nextInt();
			
			// Execute action based on choice
			switch (choice) {
			case 1:
				// Display current balance
				System.out.println("");
				System.out.println("Your balance is: ₱" + String.format("%.2f", initial_balance));
				System.out.println("");
				break;
				
			case 2:
				// Get deposit amount and update balance
				System.out.print("Enter amount: ₱");
				deposit = sc.nextFloat();
				System.out.println("");
				System.out.println("You deposit: ₱" + String.format("%.2f", deposit));
				initial_balance += deposit;
				System.out.println("Your new balance is: ₱" + String.format("%.2f", initial_balance));
				System.out.println("");
				break;
				
			case 3:
				// Get withdraw amount
				System.out.print("Enter amount: ₱");
				withdraw = sc.nextFloat();
				
				// Validate withdraw amount
				if (withdraw > initial_balance) {
					// Balance is not enough
			        System.out.println("Insufficient balance!");
			        System.out.println("");
			    } else if (withdraw > allowed_withdraw_amount) {
			    	// Exceeds transaction limit
			        System.out.println("Maximum withdraw per transaction: ₱2,000");
			        System.out.println("");
			    } else {
			    	// Deduct and display new balance
			    	System.out.println("");
			        System.out.println("You withdraw: ₱" + String.format("%.2f", withdraw));
			        initial_balance -= withdraw;
			        System.out.println("Your new balance is: ₱" + String.format("%.2f", initial_balance));
			        System.out.println("");
			    }
				break;
				
			case 4:
				// Exit the program
				System.out.print("Exiting program...");
				
				break;
				
			default:
				// Invalid choice
				System.out.println("Invalid choice");
				System.out.println("");
			
			}
		} while (choice != 4); // Loops until user exit
		
		sc.close(); // Closing to avoid memory leak
		
	}

}