import java.util.*;

class Stack{
	
	int arr[];
	int size;
	int top1, top2;
	
	Stack(int n){
		this.size = n;
		arr = new int [n];		
		top1 = n/2 *1;
		top2 = n /2;
	}
	
	void push1(int x){
		
		if(top1 > 0) {
			top1--;
			arr[top1] = x;
		} else {
			return;
		}
	}
	
	void push2(int x){
		
		if(top2 < size-1)	{
			top2++;
			arr[top2] = x;
		} else {
			return;
		}
	}
	
	int pop1(){
		
		if(top1 <= size/2) {
			int x = arr[top1];
			top1++;
			System.out.println("Popped element from stack1 is "+x);
			return x;
		} else {
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		
		if(top2 >= size/2  +1) {
			int x = arr[top2];
			top2--;
			System.out.println("Popped element from stack2 is "+x);
			return x;
		} else {
			System.out.println("Underflow");
			System.exit(1);
		}
		return 0;
	}
}

class Question3{

	public static void main(String[]args){
		Stack s1 = new Stack(10);
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		
		s1.pop1();
		s1.pop2();
		
	}
}