package Exercise_02.Exercise_02_02;

public class LinkedList {
	
	LinkedListNode head;
	LinkedListNode first;
	
	public void add(int data) {
		if(head == null) {
			head = new LinkedListNode(data);
			first = head;
			return;
		}
		
		head.next = new LinkedListNode(data);
		head = head.next;
	}
	
	public LinkedListNode removeEven(LinkedListNode node) {

		LinkedListNode firstOdd = cutEven(node);
		LinkedListNode next = firstOdd;
		while(next != null) {
			next = bridgeOdd(next); 
		}
		return firstOdd;
	}

	private LinkedListNode bridgeOdd(LinkedListNode oddNode) {
		LinkedListNode current = oddNode;
		LinkedListNode next = oddNode;
		while(isOdd(next)) {
			current = next;
			next = next.next;
		}

		LinkedListNode nextOdd = cutEven(next);
		if(current == null) {
			return null;
		}
		current.next = nextOdd;
		
		return nextOdd;
	}
	
	public boolean isOdd(LinkedListNode node) {
		return node != null && node.data%2 != 0;
	}
	
	public LinkedListNode cutEven(LinkedListNode evenNode) {
		LinkedListNode next = evenNode;
		LinkedListNode cursor = evenNode;
		while(isEven(next)) {
			cursor = next;
			next = next.next;
		}
		
		if(cursor == null) {
			return null;
		}
		cursor.next = null;
		return next;
	}
	
	public boolean isEven(LinkedListNode node) {
		return node != null && node.data%2 == 0;
	}
	
	public void remove(LinkedListNode node) {
		LinkedListNode cursor = head;
		while(cursor != null) {
			if(cursor == head) {
				head = head.next;
			} 
			cursor = cursor.next;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		LinkedListNode head = first;
		while(head != null) {
			sb.append(head.data + "");
			head = head.next;
		}
		return sb.toString();
	}
}
