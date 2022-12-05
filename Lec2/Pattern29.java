package Lec2;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=1;
		int space=n-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=number) {
				if(j==1||j==number) {
				System.out.print(row+"\t");
				}
				else {
					System.out.print("0\t");
				}
				j++;
			}
			row++;
			number += 2;
			space--;
			System.out.println("\t");
		}

	}

}