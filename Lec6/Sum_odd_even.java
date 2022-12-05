package Lec6;

import java.util.Scanner;

public class Sum_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1;
		int sum=0;
		int sum2=0;
		for(int i=1;i>0;i=n) {
			int rem=n%10;
			if(count%2!=0) {
				sum=sum+rem;
			}
			else {
				sum2=sum2+rem;
			}
			n=n/10;
			count++;
		}
		System.out.println(sum);
		System.out.println(sum2);
	}

}
