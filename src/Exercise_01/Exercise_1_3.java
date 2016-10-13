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
		System.out.println(isCaseSensitiveAnagram("efg", "gfe"));
		System.out.println(isCaseSensitiveAnagram("blablAbla", "BlablablA"));
		System.out.println(isCaseInsensitiveAnagram("blablAbla", "BlablAbla"));
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
	
	//Clearer way + it is not case sensitive
 	private static boolean isCaseInsensitiveAnagram(String str1, String str2) {
 		isTheSameCharacterCount(str1, str2);
 		
 		//equalsIgnoreCase is not a solution, because the sort is case sensitive
 		return CaseInsensitiveSort(str1).equals(CaseInsensitiveSort(str2));
 	}
 	
 	
	private static boolean isCaseSensitiveAnagram(String str1, String str2) {
		isTheSameCharacterCount(str1, str2);
		
		return CaseSensitiveSort(str1).equals(CaseSensitiveSort(str2));
	}

	private static boolean isTheSameCharacterCount(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		return true;
	}

	private static String CaseSensitiveSort(String str) {
		char[] characters = str.toCharArray();
		Arrays.sort(characters);
		return Arrays.toString(characters);
	}
	
	private static String CaseInsensitiveSort(String str) {
		String lowerCaseString = str.toLowerCase();
		System.out.println(lowerCaseString);
		char[] characters = lowerCaseString.toCharArray();
		Arrays.sort(characters);
		
		return Arrays.toString(characters);
	}
}
