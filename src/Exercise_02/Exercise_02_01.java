package Exercise_02;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Exercise_02_01 {

	/**
	 * Task: Byte encodings and Strings
	 * Unicode character table: http://unicode-table.com
	 * 
	 * U+00FC U+0064 U+0076 U+2713
	 * 
	 * Important: the length of the original might not be the same as the length of the converted.
	 * 
	 * UnsupportedEncodingException
	 * 
	 * @author szintia
	 */
	
	public static void main(String... args) {
		String stringWithUnicodeCharacters = new String("\u00FC" + "\u0064" + "\u0076" + "\u2713" + "C");
		System.out.println("String with Unicode characters: " + stringWithUnicodeCharacters + " Length: " + stringWithUnicodeCharacters.length());
		converter(stringWithUnicodeCharacters);
	}
	
	private static void converter(String str) {
		try {
			byte[] bytes = str.getBytes("UTF8");
			System.out.println("UFT8 byte array: " + bytes + " Length: " + bytes.length);
			
			byte[] withoutUTF8Bytes = str.getBytes();
			System.out.println("Default byte array: " + withoutUTF8Bytes + " Length: " + withoutUTF8Bytes.length);
			
			String convertBack = new String(bytes, "UTF-8");
			System.out.println("String from UTF-8 bytes: " + convertBack);
			System.out.println("Convert byte array to String: " + Arrays.toString(bytes));
		} catch (UnsupportedEncodingException e) {
			//The Character Encoding is not supported.
			e.printStackTrace();
		}
	}
}
