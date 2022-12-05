package Lec6;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a=1;
		for(int i=1;i>0;i=n) {
			int rem=n%10;
			sum=(int)(sum+a*(Math.pow(10, rem-1)));
			n=n/10;
			a++;
		}
		System.out.println(sum);
	}

}
