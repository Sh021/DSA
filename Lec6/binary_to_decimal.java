package Lec6;

import java.util.Scanner;

public class binary_to_decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int a=0;
		int x=0;
		int c=0;
		for(int i=1;i>0;i=n) {
			int rem=n%10;
			c=(int)Math.pow(2, x);
			a=rem*c;
			x++;
			n=n/10;
			sum=sum+a;
		}
		System.out.print(sum);
	}
}
