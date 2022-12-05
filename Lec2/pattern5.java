package Lec2;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=0;
		int row=1;
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			
			}
			
			space++;
			star--;
			row++;
			System.out.println();
		}

	}

}
