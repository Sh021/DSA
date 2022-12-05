package Lec4;

import java.util.Scanner;

public class Nth_Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=(a+b);
			a=b;
			b=sum;
		}
		System.out.println(a);

	}

}
