package Lec20;

import java.util.Scanner;

public class recursion_number_downward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		print(n);
		
	}
	
	public static void print(int n) {
		if(n==0) {
			return ;
		}
		System.out.println(n);
		print(n-1);
	}

}
