package Lec3;

import java.util.Scanner;

public class Pattern_Inverted_Hour_Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int space=(2*n)-1;
		int row=1;
		while(row<=(2*n)+1) {
			int i=1;
			int val=n;
			while(i<=num) {
				System.out.print(val+" ");
				i++;
				val--;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==n+1) {
				val++;
				k=2;
			}
			while(k<=num) {
				val++;
				System.out.print(val+" ");
				k++;
			}
			if(row<n+1) {
				space=space-2;
				num++;
			}
			else {
				space=space+2;
				num--;
			}
			row++;
			System.out.println();
		}

	}

}
