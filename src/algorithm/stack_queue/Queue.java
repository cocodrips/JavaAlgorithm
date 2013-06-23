package algorithm.stack_queue;

import algorithm.list.Node;

public class Queue {
	Node first, last;
	
	public void enqueue(Object item){
		if(first == null){
			first = new Node(item);
			last = first;
		}else{
			last.next = new Node(item);
			last = last.next;
		}
	}
	
	public Object dequeue(){
		if(first == null) return null;
		Object item = first;
		first.next = first;
		return item;
	}
}
