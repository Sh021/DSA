package Lec4;

import java.util.Scanner;

public class Print_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n2=sc.nextInt();
		int n1=sc.nextInt();
		int n=1;
		int n0=1;
		for(;true;) {
			int sum=3*n+2;
			if(sum%n1!=0) {
				System.out.println(sum);
				if(n0>=n2) {
					break;
				}
				n0++;
			}
			n++;
		}
	}

}
