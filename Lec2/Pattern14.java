package Lec2;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n-1;
		int row=1;
		while(row<=2*n-1) {
			int h=1;
			while(h<=space) {
				System.out.print("  ");
				h++;
			}
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			if(row<n) {
				space--;
				star++;
			}
			else {
				space++;
				star--;
			}
			row++;
			System.out.println();
		}
	}

}
