package Exercise_01;

import java.util.regex.Pattern;

public class Exercise_1_5 {

	/**
	 * Task: Implement an algorithm to replace a substring.
	 * Important: is it case sensitive? Is the whitespace significant?
	 * @author szintia
	 */
	
	public static void main(String... args) {
		System.out.println(replace("blablabla"));
		System.out.println(usingRegex("a12bbaa99bba2"));
		System.out.println(usingPattern("blablaBlaBB"));
	}
	
	private static String replace(String str) {
		//it returns a new string object
		return str.replace("bla", "hey");
	}
	
	private static String usingRegex(String str) {
		//it returns a new string object
		return str.replaceAll("[0-9]", "x");
	}
	
	private static String usingPattern(String str) {
		return Pattern.compile("blablaBlaBB").matcher(str).replaceAll("bb");
	}
}
