package Lec4;

import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit=sc.nextInt();
		int count=0;
		for(;n>0;) {
			int rem=n%10;
			n /=10;
			if(rem==digit) {
				count++;
			}
		}
		System.out.println(count);

	}

}
