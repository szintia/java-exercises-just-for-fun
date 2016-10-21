package Exercise_02;

import java.util.Random;

public class Exercise_02_04 {
	/**
	 * Task: Count the sum of the hourglasses. Use 2D array.
	 * At least 3*3 and at most 6*6 array
	 * @author szintia
	 */

	public static void main(String... args) {
		int[][] array = new int[6][6];
		Random random = new Random();
		
		for(int i =0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = random.nextInt(10);
			}
		}
		
		System.out.println("Max hourglass: " + maxSumOfHourglasses(array));
	}
	
	public static int maxSumOfHourglasses(int[][] array) {
		int length = array.length;
		int maxSum = 0;
		
		for(int i = 0; i < length-2; i++) {
			for(int j = 0; j < length-2; j++) {
				int calculateSum = array[i][j] + array[i][j+1] + array[i][j+2] 
								   + array[i+1][j+1] 
								   + array[i+2][j] + array[i+2][j+1] + array[i+2][j+2];
				
				if(maxSum < calculateSum) {
					maxSum = calculateSum;
				}
				
			}
		}
		
		return maxSum;
	}
}
