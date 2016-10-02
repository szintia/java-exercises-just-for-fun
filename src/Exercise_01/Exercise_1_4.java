package Exercise_01;

public class Exercise_1_4 {

	/**
	 * Task: Implement an algorithm to determine if strings are equal.
	 * Important: is it case sensitive? Is the whitespace significant?
	 * @author szintia
	 */
	
	public static void main(String... args) {
		
		String str1 = "Blablabla";
		String str2 = null;
		
		//return false
		System.out.println("Will not generate if only y is null: " + str1.equals(str2));
		//return true
		System.out.println("Without case sensitivity: " + str1.equalsIgnoreCase("blablabla"));
		System.out.println("x.equals(y) will generate a NullPointerException if x is null: " + str2.equals(str1));
	}
}
