package lec42;

import java.util.LinkedList;

public class Linkedlist_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);//add last
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.addFirst(90);//add first
		list.add(2, 90);
		System.out.println(list);
		System.out.println(list.remove());
	}

}
