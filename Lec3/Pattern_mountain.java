package Lec3;

import java.util.Scanner;

public class Pattern_mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int space=2*n-3;
		int row=1;
		while(row<=n) {
			int i=1;
			int val=1;
			while(i<=num) {
				System.out.print(val+"\t");
				i++;
				val++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			int k=1;
			if(row==n) {
				k=2;
				val--;
			}
			while(k<=num) {
				val--;
				System.out.print(val+"\t");
				k++;
			}
			row++;
			space=space-2;
			num++;
			System.out.println();
		}

	}

}
