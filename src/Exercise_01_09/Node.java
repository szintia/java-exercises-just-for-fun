package Exercise_01_09;

public class Node<T> {
	//Each node in the list stores the contents of the node and a pointer/reference to the next node in the list.
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}
