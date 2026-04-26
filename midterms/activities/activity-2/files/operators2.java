package new_oop;

/*
 * 3. Create a Java program using assignment operators 
 * that will produce the output: Addition: 120, Subtraction: 70, Multiplication: 144, Division: 16.
 */

public class operators2 {
	
		public static void main(String[] args) {
		
		int a = 20;
		int b = 100;
		int c = 36;
		int d = 112;
		
		int add = a += 100; // a = a + 100 (a = 20 + 100) = 120
		int subtract = b -= 30; // b = b - 30 (b = 100 - 30) = 70
		int multip = c *= 4; // c = c * 4 (c = 36 * 4) = 144
		int divide = d /= 7; // d = d / 7 (d = 112 / 7) = 16
		
		System.out.println("Addition: " + add);
		System.out.println("Subtraction: " + subtract);
		System.out.println("Multiplication: " + multip);
		System.out.println("Division: " + divide);
		
	}
}