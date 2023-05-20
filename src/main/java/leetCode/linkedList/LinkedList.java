package leetCode.linkedList;

public class LinkedList {
	
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	public static LinkedList insert(LinkedList list, int data) {
		
		Node new_node = new Node(data);
		
		if(list.head == null) {
			list.head = new_node;
		}else {
			Node last = list.head;
			while (last.next != null) {
				last = last.next;
			}
			
			last.next = new_node;
		}
		
		return list;
	}
	
	
	public static LinkedList delete(LinkedList list,int data) {
	
		if(list.head.data == data) {
			list.head = list.head.next;
			return list;
		}else {
			Node prev = list.head ;
			Node current = list.head.next;
			
			while (current.data != data && current.next != null) {
				prev = current;
				current = current.next;
			}
			if(current.next != null) {
				prev.next = current.next;
			}else {
				prev.next = null;
			}
			
			
		}
		
		return list;
	}
	
	
	public static LinkedList reverse(LinkedList list) {
		
		Node next = null,prev = null,current = null;
		
		if(list.head.next == null) {
			return list;
		}else {
			current = list.head;			
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
		}
		
		list.head = prev;
		return list;
	}
	
	public static void printList(LinkedList list) {
		
		if(list.head.next == null) {
			System.out.println(list.head.data);
		}else {
			Node current = list.head;
			while(current != null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
		
	}
	
}
