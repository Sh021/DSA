package Lec20;

import java.util.Scanner;

public class recursion_pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(pow(n,m));

	}
	
	public static int pow(int n,int m) {
		if(m==0) {
			return 1;
		}
		
		int ans=pow(n,m-1);
		return ans*n;
		
	}

}
