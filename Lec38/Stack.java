package Lec38;

public class Stack {
	
	private int [] data;
	private int top=0;
	public Stack() {
		this.data=new int [5];
	}
	public Stack(int cap) {
		this.data=new int[cap];
	}
	public boolean isEmpty() {
		return this.top==0;
	}
	
	public boolean isFull() {
		return this.top==this.data.length;
	}
	
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("StackOverflow");
		}
		
			this.data[this.top]=item;
			this.top++;			
		
		
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("StackUnderflow");
		}
		this.top--;
		return this.data[this.top]; 
		
	}
	public int peek() throws Exception {
		if(isEmpty()) { 
			throw new Exception("StackUnderflow");
		}
		return this.data[this.top-1];
	}
	
	public int size() {
		return this.top;
	}
	
	public void display() {
		for(int i=0;i<this.top;i++) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println();
	}
}
