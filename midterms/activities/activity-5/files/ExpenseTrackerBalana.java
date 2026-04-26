package midterm;

import java.util.Scanner;

public class ExpenseTrackerBalana {
	
	// Void method that displays program title
	static void displayProgramTitle() {
		System.out.println("====================== EXPENSE TRACKER ===========================");
	}
	
	// Non-void method that calculates expenses
	public static double calculateExpenses(double food, double transpo, double internet, double other) {
		return food + transpo + internet + other;
	}
	
	// Non-void method that checks budget status
	public static String checkBudget(double expenses, double budget) {
		if (expenses > budget) {
            return "Over budget! You exceeded your budget by ₱" + String.format("%.2f", (expenses - budget));
        } else {
            return "Within budget! You have ₱" + String.format("%.2f", (budget - expenses)) + " remaining.";
        }
	}
	
	// Void method that display expenses result
	public static void displayResults(double totalExpenses, String budgetStatus) {
		System.out.println();
        System.out.println("====================== EXPENSE TRACKER ===========================");
        System.out.println();
        System.out.printf("  Total Expenses: ₱%.2f%n", totalExpenses);
        System.out.println("  Budget Status:  " + budgetStatus);
        System.out.println();
        System.out.println("==================================================================");
    }
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Calls void method that displays program title
		displayProgramTitle();
		
		System.out.println("\n  Enter your expenses below:");
		System.out.println();
		
		// Get user input for expenses and budget
		System.out.print("  Your budget: ₱");
        double budget = input.nextDouble();
		
        System.out.print("  Food expenses: ₱");
        double food = input.nextDouble();

        System.out.print("  Transportation expenses: ₱");
        double transportation = input.nextDouble();
        
        System.out.print("  Internet expenses: ₱");
        double internet = input.nextDouble();

        System.out.print("  Other expenses: ₱");
        double otherExpenses = input.nextDouble();
        
        // Calls non-void method that calculates all expenses
        double totalExpenses = calculateExpenses(food, transportation, internet, otherExpenses);
        
        // Calls non-void method that checks budget and display budget status
        String budgetStatus = checkBudget(totalExpenses, budget);

        // Calls void method that that display expenses result
        displayResults(totalExpenses, budgetStatus);

        // Close scanner to avoid memory leak
        input.close();
		
	}

}