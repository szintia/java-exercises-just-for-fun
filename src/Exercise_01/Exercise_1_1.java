package Exercise_01;

public class Exercise_1_1 {
	
	/**
	 * Task: Implement an algorithm to determine if a string has all unique characters.
	 * Important: is it ASCII or Unicode string?
	 * @author szintia
	 */

	public static void main (String... args) {
		System.out.println(isUniqueCharacters("abcdefghijkabc"));
		System.out.println(isUniqueCharacters("abcdefghij"));
	}
	
	private static boolean isUniqueCharacters(String str) {
		//in case of ASCII
		if(str.length() > 256) {
			return false;
		}
		
		boolean[] flags = new boolean[256];
		for(int i = 0; i < str.length(); i++) {
			if(flags[str.charAt(i)]) {
				return false;
			}
			flags[str.charAt(i)] = true;
		}
		return true;
	}
}
