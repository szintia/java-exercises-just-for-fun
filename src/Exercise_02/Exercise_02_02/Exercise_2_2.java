package Exercise_02.Exercise_02_02;

import java.util.Arrays;

/**
 * Task: Implement linkedlist data structure and create a method,
 * 		 which remove all even number from a given linkedlist
 * @author szintia
 */

public class Exercise_2_2 {
	
	public static void main(String... args) {
		LinkedList list = new LinkedList();
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(6);
		list.add(7);
		list.add(4);
		System.out.println("original: " + list.toString());
		LinkedListNode oddListHead = list.removeEven(list.first);
		System.out.println("head of odd list is : " + oddListHead.data);
		oddListHead.printRest();
	}
}
