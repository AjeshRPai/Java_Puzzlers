package chapter2_CharacterPuzzles;

public class WhatsMyClass
{
	public static void main(String[] args)
	{
		System.out.println(WhatsMyClass.class.getName().replaceAll(".", "/") + ".class");


		// Solution

		System.out.println(WhatsMyClass.class.getName().replaceAll("\\.", "/") + ".class");

	}


	/**
	 * The problem is that String.replaceAll takes a regular expression as its first parameter, not a literal sequence of characters.
	 * The regular expression "." matches any single character, and so every character of the class name is replaced by a slash,
	 * producing the output we saw.
	 * */

}
