package Lec24;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		solution(n);
		
	}
	public static int[] solution(int limit) {
		int [] result = new int [limit];
		
		for(int i =0;i<limit;i++) {
			fib(limit);
		}
		int r=fib(limit);
		for(int i =0;i<limit;i++) {
			result[i]=r;
			System.out.println(result[i]);
		}
		return result;
	}
	
	public static int fib(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		int ans=fib(n-1)+fib(n-2);
		return ans;
		
	}

}
