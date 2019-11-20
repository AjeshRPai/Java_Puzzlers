package chapter1;

public class Oddity {

	public static void main(String[] args) {
		System.out.println("is odd  Problem "+isOdd(-1));
		System.out.println("is odd  Solution "+isOddSolution(-1));
	}


	/**
	 * Problem
	 * Check correctness
	 * */

	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}

	/**
	 * when the remainder operation returns a nonzero result,
	 * it has the same sign as its left operand.
	 * Solution
	 */

	public static boolean isOddSolution(int i) {
		return i % 2 != 0;
	}

	/**
	 * iff you are using the isOdd method in a performance-critical setting,
	 * you would be better off using the bitwise AND operator (&) in place of the remainder operator:
	 *
	 *
	 * As a general rule, the divide and remainder operations are slow compared to other arithmetic and logical operations
	 *
	 * */


	public static boolean isOddBitwise(int i) {
	         return (i & 1) != 0;
	 }


	 /**Summary
	  *
	  * Think about the signs of the operands and of the result whenever you use the remainder operator.
	  *
	  * */



}
