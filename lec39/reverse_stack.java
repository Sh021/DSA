 package lec39;

import java.util.Stack;

public class reverse_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st =new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		revst(st);
		System.out.println(st);
	}
	
	public static void revst(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		
		int temp =st.pop();
		revst(st);
		pushbottom(st,temp);
		
	}
	
	private static void pushbottom(Stack<Integer>st,int t) {
		if(st.isEmpty()) {
			st.push(t);
			return;
		}
		
		int temp=st.pop();
		pushbottom(st,t);
		st.push(temp);
		
	}

}
