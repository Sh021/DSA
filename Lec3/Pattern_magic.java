package Lec3;

import java.util.Scanner;

public class Pattern_magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space= -1;
		int row=1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			
			int k=1;
			if(row==1 || row==2*n-1) {
			k=2;
			}
			while(k<=star) {
				System.out.print("*");
				k++;
			}
			if(row<n) {
			star=star-1;
			space=space+2;
			}
			else {
				star=star+1;
				space=space-2;
			}
			row++;
			System.out.println();
		}

	}

}
