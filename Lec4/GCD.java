package Lec4;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int divisor=sc.nextInt();
		int divident=sc.nextInt();
		for(;divisor%divident!=0;) {
			int rem=divisor%divident;
			divisor=divident;
			divident=rem;
		}
		System.out.println(divident);

	}

}
