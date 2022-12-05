package Lec6;

import java.util.Scanner;

public class Decimal_to_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int b=1;
		for(int i=1;i>0;i=n) {
			int rem=n%8;
			sum=sum+rem*b;
			b*=10;
			n=n/8;
		}
		System.out.print(sum);

	}

}
