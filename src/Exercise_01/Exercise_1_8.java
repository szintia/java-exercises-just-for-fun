package Exercise_01;

public class Exercise_1_8 {
	
	/**
	 * Task: Implement a method, which checks if one string is a rotation of another.
	 * Important: check the length of the strings!
	 * 
	 * @author szintia
	 */

	public static void main(String... args) {
		System.out.println(isRotation("waterpolo", "erpolowat"));
	}
	
	private static boolean isRotation(String s1, String s2) {
		if(s1.length() == s2.length() && s1.length() > 0) {
			String s1s1 = s1.concat(s1);
			
			// Returns the index within this string of the first occurrence of the specified substring.
			// s1s1.indexOf(s2);  returns with the index or -1 if there is not occurrence
			if( s1s1.toLowerCase().contains(s2.toLowerCase())) {
				return true;
			}
		}
		return false;
	}
}
