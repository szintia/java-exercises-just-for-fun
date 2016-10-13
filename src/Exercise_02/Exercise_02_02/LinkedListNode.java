package Exercise_02.Exercise_02_02;

public class LinkedListNode {
	
	int data;
	LinkedListNode next;
	
	public LinkedListNode(int data) {
		this.data = data;
	}
	
	public void printRest() {
		LinkedListNode cursor = this;
		while(cursor != null) {
			System.out.println(cursor.data);
			cursor = cursor.next;
		}
	}
}
