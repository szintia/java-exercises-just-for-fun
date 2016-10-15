package Exercise_02;

public class Exercise_02_03 {

	/**
	 * Task: Implement a method, which split a string into tokens. Make sure that any other special characters, whitespace will be removed.
	 * 
	 * Range: 0 < x < 1000
	 * @author szintia
	 */
	
	public static void main(String... args) {
		String test = "This is a text wich contains English alphabetic letters and special characters like , or _. Are you sure about removing them?";
		
		splitIntoTokens(test);
	}
	
	private static void splitIntoTokens(String str) {
		final String REGULAR_EXPRESSION = "[ !,?.\\_'@]+";
		int length = str.length();
		
		String[] result = new String[length];
		
		if(length < 0 || length > 1000) {
			return;
		}
		
		if (length == 1) {
			System.out.println(str);
			return;
		}
		
		result = str.trim().split(REGULAR_EXPRESSION);
		
		for(String s : result) {
			System.out.println(s);
		}
	}
}
