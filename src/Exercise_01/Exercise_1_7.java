package Exercise_01;

public class Exercise_1_7 {
	
	/**
	 * Task: Implement a method, which perform string compression using the counts of
	 * repeated characters. If the compressed string would not smaller than the original
	 * string, return the original string.
	 * Important: check whether a string is null or empty
	 *  abbccc --> a1b2c3
	 * @author szintia
	 */
	
	public static void main(String... args) {
		System.out.println("Simply compress: " + compressWithoutCheckSize("abbccc"));
		System.out.println("The size of the compressed string is not bigger than the original: " + compress("abbccc"));
		System.out.println("The size of the compressed is bigger than the original: " + compress("abbcccc"));
	}
	
	private static String compressWithoutCheckSize(String str) {
		char checked = str.charAt(0);
		int count = 1;
		StringBuilder compressed = new StringBuilder();
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == checked) {
				count++;
			} else {
				compressed.append(checked);
				compressed.append(count);
				count = 1;
				checked = str.charAt(i);
			}
		}
		compressed.append(checked);
		compressed.append(count);
		
		return compressed.toString();
	}
	
	private static String compress(String str) {
		//get the size of the compressed string
		int size = countCompression(str);
		
		if(size >= str.length()) {
			return str;
		}
		
		StringBuilder compressed = new StringBuilder();
		char checked = str.charAt(0);
		int count = 1;
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == checked) {
				count++;
			} else {
				compressed.append(checked);
				compressed.append(count);
				checked = str.charAt(i);
				count = 1;
			}
		}
		compressed.append(checked);
		compressed.append(count);
		
		return compressed.toString();
	}
	
	private static int countCompression(String str) {
		if(str == null || str.isEmpty()) {
			return 0;
		}
		
		int count = 1, size = 0;
		char checked = str.charAt(0);
		
		for(int i = 1; i < str.length(); i++) {
			if( str.charAt(i) == checked) {
				count++;
			} else {
				checked = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 1;
			}
		}
		size += 1 + String.valueOf(count).length();
		
		return size;
	}
}
