package new_oop;

/*
 * 1. Create a Java program using bitwise operators 
 * that will produce the output: true, 10, false, 15.
 */

public class operators {
	
		public static void main(String[] args) {
		
		int a = 2;
		int b = 8;
		int c = 15;
		
		System.out.println(a < b && b > a);  // Logical AND: true if both conditions are true
		System.out.println(a | b);  // Bitwise OR: compares bits of a and b
		System.out.println(a > b & b > a); // Bitwise AND (single &): evaluates both sides fully
		System.out.println(b | c);  // Bitwise OR between b and c
		
	}
}