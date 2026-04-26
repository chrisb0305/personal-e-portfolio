package new_oop;

/*
 * 4. Create a Java program using arithmetic, relational, logical, and unary operators 
 * that will produce the output: FALSE, TRUE, TRUE, 40, TRUE, FALSE, FALSE, 80.
 */

public class operators3 {
	
		public static void main(String[] args) {
		
		int a = 20;
		int b = 19;
		int c = 40;
		
		boolean result1 = b > a; // 19 > 20 = FALSE
		boolean result2 = (a > b && b < a); // 20 > 19 = TRUE, 19 < 20 = TRUE, THEREFORE = TRUE
		boolean result3 = (c > a & b < a); // 40 > 20 = TRUE, 19 < 20 = TRUE, THEREFORE = TRUE
		int result4 = a++ + b++; // 20 + 19 = 39, but result4 is incremented in result8 = 40
		boolean result5 = result4 < c; // 39 < 40 = TRUE
		boolean result6 = result4 == a || result4 < b; // 39 == 21 = FALSE, 39 < 20 = FALSE, THEREFORE = FALSE
		boolean result7 = (c > a && b > c); // 40 > 21 = TRUE, 20 > 40 = FALSE, THEREFORE = FALSE
		int result8 = ++result4 + c--; // ++result4 = 40 + 40 = 80, afterwards c = 39
		
		System.out.println(String.valueOf(result1).toUpperCase());
		System.out.println(String.valueOf(result2).toUpperCase());
		System.out.println(String.valueOf(result3).toUpperCase());
		System.out.println(result4); // prints 40 because it is incremented
		System.out.println(String.valueOf(result5).toUpperCase());
		System.out.println(String.valueOf(result6).toUpperCase());
		System.out.println(String.valueOf(result7).toUpperCase());
		System.out.println(result8);
		
	}
}