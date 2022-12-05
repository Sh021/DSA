package Lec2;

import java.util.Scanner;

public class patterntest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int row=1;
		int space=0;
		int star=a;
		while(row<=(a+1)/2) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i=i+1;
			}
			int j=1;
			while(j<=star) {
			System.out.print("* ");
			j=j+1;
			}
			int k=1;
			while(k<=space) {
				System.out.print(" ");
				k++;
			}
			row=row+1;
			star=star-2;
			space=space+1;
			System.out.println();
			
					}
		
	}
}
