class Stack	{
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	boolean isEmpty(){
		if(head == null)
			return true;
		return false;
	}
	
	void Push(int data){
		
		Node newNode = new Node(data);
		
		if(isEmpty()) {	
			head = newNode;
			System.out.println("1st Element is inserted in stack ");
		}
		else{
			Node temp = head;
			head = newNode;
			newNode.next = temp;
			System.out.println(data+" Push in stack");
		}
	}
	
	void Pop(){
		
		int data = Integer.MIN_VALUE;
		if(isEmpty())
			System.out.println("Stack is Empty / Underflow condition occure");
		else{
			data = head.data;
			head = head.next;
			System.out.println(data+" Pop from stack");
		}
	}
	
	void Peek(){
		if(isEmpty())
			System.out.println("Stack is Empty");
		else{ 
			System.out.println("Top element in stack is: "+head.data);
		}
	}
	
	void Display(){
		
		System.out.println("\nElement in stack is : ");
		Node current = head;
		System.out.print("Top -> ");
		while(current != null){
			System.out.print(current.data+" ");
			System.out.print(" -> ");
			current = current.next;
		}
		System.out.println("first");
	}
}

class StackDemo	{
	
	public static void main(String[] args) {
		
		Stack s1 = new Stack();

		s1.Push(10);
		s1.Push(20);
		s1.Push(30);
		s1.Display();
		
		s1.Pop();
		s1.Pop();
		s1.Pop();
		s1.Pop();
		s1.Display();
		

	}
}