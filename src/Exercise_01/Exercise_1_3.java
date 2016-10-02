package Exercise_01;

import java.util.Arrays;

public class Exercise_1_3 {
	
	/**
	 * Task: Implement an algorithm to determine if a string is a permutation of the other string.
	 * Important: is it case sensitive? Is the whitespace significant?
	 * @author szintia
	 */

	public static void main(String... args) {
		System.out.println(isPermutation("abc", "bcd"));
		System.out.println(isPermutation("omg", "omg"));
		System.out.println(isAnagram("efg", "gfeh"));
		System.out.println(isAnagram("blablabla", "blablabla"));
	}
	
	//Efficient way
	// Are they ASCII or Unicode strings?
	// if not case sensitive : string.toLowerCase() 
 	private static boolean isPermutation(String str1, String str2) {
		isTheSameCharacterCount(str1, str2);
		
		int[] values = new int[256];
		char[] characters = str1.toCharArray();
		for(char c : characters) {
			values[c]++;
		}
		
		for(int i = 0; i < str2.length(); i++) {
			int c = str2.charAt(i);
			if(--values[c] < 0) {
				return false;
			}
		}
		return true;
	}
	
	//Clearer way
	private static boolean isAnagram(String str1, String str2) {
		isTheSameCharacterCount(str1, str2);
		return sort(str1).equals(sort(str2));
	}

	private static boolean isTheSameCharacterCount(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		return true;
	}

	private static String sort(String str1) {
		char[] characters = str1.toCharArray();
		Arrays.sort(characters);
		return new String(characters);
	}
}
