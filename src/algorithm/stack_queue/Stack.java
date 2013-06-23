package algorithm.stack_queue;

import algorithm.list.Node;

public class Stack {
	Node top;
	
	public Object pop(){
		if(top != null){
			Object item = top.data;
			top = top.next;
			return item;
		}
		return null;
	}
	
	public void push(Object d){
		Node node = new Node(d);
		node.next = top;
		top = node;
	}
	
	public Object peek() {
		return top.data;
	}
	
}
