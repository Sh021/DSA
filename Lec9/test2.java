package Lec9;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
	
	public static int fact(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(n*i);
		}
		return sum;
	}

}
