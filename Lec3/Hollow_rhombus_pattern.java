package Lec3;

import java.util.Scanner;

public class Hollow_rhombus_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=n-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			if(row==1||row==n) {
				int j=1;
				while(j<=star) {
				System.out.print("*");
				j++;
				}
			}
			else {
				System.out.print("*");
				int k=1;
				while(k<=n-2) {
					System.out.print(" ");
					k++;
				}
				System.out.print("*");
			}
			row++;
			space--;
			System.out.println();
		}
		
	}
}

	



