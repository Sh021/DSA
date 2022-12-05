package Lec21;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
	
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		int ans=fib(n-1)+fib(n-2);
		return ans;
		
	}

}
