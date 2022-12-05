package Lec2;

import java.util.Scanner;

public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int one=1;
		int space=n-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=one) {
				System.out.print("1 ");
				j++;
			}
			row++;
			space--;
			one=one+2;
			System.out.println();
		}
	}

}
