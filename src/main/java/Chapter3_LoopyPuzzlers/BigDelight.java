package Chapter3_LoopyPuzzlers;

public class BigDelight
{

	private static final byte TARGET = (byte)0x90;

	public static void main(String[] args)
	{
		for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
			if (b == 0x90)
				System.out.print("Joy!");
		}

		//solution

		for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
			if (b == TARGET)
				System.out.print("Joy! on Solution");
		}

	}


	/**
	 *
	 * Simply put, 0x90 is an int constant that is outside the range of byte values.
	 * This is counterintuitive because 0x90 is a two-digit hexadecimal literal.
	 * Each hex digit takes up 4 bits, so the entire value takes up 8 bits, or 1 byte.
	 * The problem is that byte is a signed type.
	 * The constant 0x90 is a positive int value of 8 bits with the highest bit set.
	 * Legal byte values range from  128 to +127, but the int constant 0x90 is equal to +144.
	 *
	 *
	 * Avoid mixed-type comparisons, because they are inherently confusing (Puzzle 5).
	 * To help achieve this goal, use declared constants in place of “magic numbers.”
	 *
	 *
	 * */
}
