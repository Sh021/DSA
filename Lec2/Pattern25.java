package Lec2;

import java.util.Scanner;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int one=1;
		int space=n-1;
		int row=1;
		int count=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=one) {
				System.out.print(count+"\t");
				count++;
				j++;
			}
			row++;
			space--;
			one=one+2;
			System.out.println("\t");
		}
	}

}