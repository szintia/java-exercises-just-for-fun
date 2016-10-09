package Exercise_01_09;

public class Exercise_1_9 {

	/**
	 * Task: Implement linked list data structure and create a method, which remove duplicates from an unsorted linked list.
	 * @author szintia
	 */
	
	public static void main(String... args) {
		LinkedList<Integer> myLinkedList = new LinkedList<>();
		myLinkedList.add(1);
		myLinkedList.add(1);
		myLinkedList.add(4);
		myLinkedList.add(4);
		myLinkedList.add(3);
		System.out.println("eredeti: " + myLinkedList.toString());
		myLinkedList.removeDuplicateElements();
		System.out.println("result: " + myLinkedList.toString());
	}
}
