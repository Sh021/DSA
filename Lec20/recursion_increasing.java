package Lec20;

import java.util.Scanner;

public class recursion_increasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n);

	}
	public static void print(int n) {
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.println(n);
	}

}
