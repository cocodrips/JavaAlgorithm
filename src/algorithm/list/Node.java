package algorithm.list;

public class Node {
	public Node next;
	public Object data;
	
	public Node (Object d){
		data = d;
	}
	
	void appendToTail(Object d){
		Node end = new Node(d);
		Node n = this;
		while(n != null){
			n = n.next;
		}
		n = end;
	}

}
