package Lec4;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0;
		for(int i=1;n>0;n/=10) {
			int rem=n%10;
			j=rem;
			System.out.print(j);
		}
		

	}

}
