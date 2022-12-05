package Lec4;

import java.util.Scanner;

public class Print_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=2;i<=n;i++) {
			int fact=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					fact++;
				}
			}
				if(fact<1) {
					System.out.println(i);
			}
		}
		
	}

}
