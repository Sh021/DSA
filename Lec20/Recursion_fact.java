package Lec20;

import java.util.Scanner;

public class Recursion_fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	
	public static long fact(int n) {
		if(n==0) {
			return 1;
		}
		long k=fact(n-1);
		return k*n;	
	}

}
