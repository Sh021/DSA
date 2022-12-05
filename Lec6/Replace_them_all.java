package Lec6;

import java.util.Scanner;

public class Replace_them_all {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long sum=0;
		long a=0;
		long b=1;
		for(long i=1;i>0;i=n) {
			long rem=(n%10);
			if(rem==0) {
				rem=5;
			}
			a=rem*b;
			b*=10;
			n=n/10;
			sum=sum+a;
		}
		System.out.print(sum);

	}

}
