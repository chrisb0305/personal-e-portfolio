package new_oop;

/*
 * 2. Create a Java program using the ternary operator 
 * that will produce the output: true, false, 25, 30.
 */

public class operators1 {
	
		public static void main(String[] args) {
		
		int a = 30;
		int b = 25;

		
		boolean trueorFalse1 = (a > b) ? true : false; // Ternary operator: returns true if a > b
		boolean trueorFalse2 = (a < b) ? true : false; // Ternary operator: returns true if a < b
		int num1 = (a < b) ? a : b; // Ternary operator: picks smaller value between a and b
		int num2 = (a > b) ? a : b; // Ternary operator: picks larger value between a and b
				
		System.out.println(trueorFalse1);
		System.out.println(trueorFalse2);
		System.out.println(num1);
		System.out.println(num2);
		
	}
}