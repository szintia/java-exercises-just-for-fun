package Exercise_01;

public class Exercise_1_2 {
	
	/**
	 * Task: Implement a function, which reverses a string.
	 * Using iterative solution
	 * Important: is it ASCII or Unicode string?
	 * @author szintia
	 */
	
	public static void main(String... args) {
		System.out.println(reverse("ab"));
		System.out.println(reverse("abcdefg"));
	}
	
	private static String reverse(String str) {
		// abc --> cba
		if(str.length() < 2) {
			return str;
		}
		char[] characters = str.toCharArray();
		StringBuilder reversed = new StringBuilder();
		
		for(int i = str.length()-1; i >= 0; i--) {
			reversed.append(characters[i]);
		}
		return reversed.toString();
	}
}
