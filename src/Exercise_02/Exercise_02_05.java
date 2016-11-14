package Exercise_02;

public class Exercise_02_05 {
	
	/**
	 * Task: Sorting algorithms : rearrange items in ascending order
	 * 
	 * 1.QUICK: partitioning + recursion + time comp: O(n*log(n))
	 * 2.MERGE: divide + conquer + time comp: O(n*log(n))
	 * 3.INSERTION: insert + sub-list + in-place comparison + time comp: O(n2)
	 * 4.SELECTION: divide + lowest + in-place comparison + time comp: O(n2)
	 * 5.BUBBLE: compare/swap actual + next + time comp: O(n2)
	 * 6.SHELL: compare/swap far apart from each other + time comp: O(n*(log(n))2)
	 * 
	 * @author szintia
	 */

	public static void main(String... args) {
		int[] elements = new int[] {22, 89, 2, 45, 0, 2};
		insertionSort(elements);
		// selectionSort(elements);
		// bubbleSort(elements);
		
		for(int i = 0; i < elements.length; i++) {
			System.out.print(elements[i] + " ");
		}
	}
	
	public static int[] insertionSort(int[] elements) {
		int temp = 0; 
		for(int i = 0; i < elements.length; i++) {
			//compare with the previous elements
			for(int j = i; j > 0; j--) {
				if(elements[j] < elements[j-1]) {
					temp = elements[j];
					elements[j] = elements[j-1];
					elements[j-1] = temp;
				}
			}
		}
		return elements;
	}
	
	public static int[] selectionSort(int[] elements) {
		for(int i = 0; i < elements.length; i++) {
			int index = i;
			for(int j = i+1; j < elements.length; j++) {
				//check whether the next element is smaller or not
				if(elements[j] < elements[index]) {
					index = j;
				}
			}
			//swapping
			int smaller = elements[index];
			elements[index] = elements[i];
			elements[i] = smaller;
		}
		return elements;
	}
	
	public static int[] bubbleSort(int[] elements) {
		int length = elements.length;
		int temp = 0;
		
		for(int i = 0; i < length; i++) {
			for(int j = 1; j < (length - i); j++) {
				//compare adjacent elements
				if(elements[j-1] > elements[j]) {
					temp = elements[j-1];
					elements[j-1] = elements[j];
					elements[j] = temp;
				}
			}
		}
		return elements;
	}
}
