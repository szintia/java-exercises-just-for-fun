package Exercise_01_09;

import java.util.NoSuchElementException;

public class LinkedList<T> {
	
	private Node<T> head;
	private Node<T> first;
	
	//add the element to the end of the list
	public void add(T data) {
		if(head == null) {
			head = new Node<T>(data);
			first = head;
			return;
		}
		
		while(head.next != null) {
			head = head.next;
		}
		head.next = new Node<T>(data);
		//head will be the last element
		head = head.next;
	}
	
	public void removeDuplicateElements() {
		if(first == null) {
			return;
		}
		
		Node<T> current = first;
		while(current != null) {
			Node<T> cursor = current;
			while(cursor.next != null) {
				if(current.data.equals(cursor.next.data)) {
					cursor.next = cursor.next.next;
				} else {
					cursor = cursor.next;
				}
			}
			current = current.next;
		}
	}
	
	public Object getFirst() {
		if(first == null) {
			throw new NoSuchElementException();
		} 
		return first.data;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node<T> cursor = first;
		while(cursor != null) {
			sb.append(cursor.data + " ");
			cursor = cursor.next;
		}
		return sb.toString();
	}
}
