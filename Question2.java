class Question2{
	
	static Node head;
	
	static class Node {
		
		int data;
		Node next;
		
		Node(int data) {
			this.data= data;
			next = null;
		}
	}
	
	Node reverse(Node node) {
		
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current != null) {
			
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	
	void PrintList(Node node) {
		
		while(node != null) {
		
			System.out.print(node.data+ " ");
			node = node.next;
		}
	}
	
	public static void main(String[] args){
			
		Question2 list = new Question2();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);

		head = list.reverse(head);
		System.out.println(" ");
		list.PrintList(head);
		
		System.out.println();
		Question2 list1 = new Question2();
		list1.head = new Node(3);
		list1.head.next = new Node(4);
		list1.head.next.next = new Node(2);
		list1.head.next.next.next = new Node(5);

		head = list1.reverse(head);
		System.out.println(" ");
		list1.PrintList(head);
	}
}