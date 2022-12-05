package Lec4;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int divident=sc.nextInt();
		int a=divisor;
		int b=divident;
		for(;a%b!=0;) {
			int rem=a%b;
			a=b;
			b=rem;
		}
		int lcm=(divisor*divident)/b;
		System.out.println(lcm);
	}

}
