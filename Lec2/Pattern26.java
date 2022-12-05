package Lec2;

import java.util.Scanner;

public class Pattern26 {

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
			int count=1;
			while(j<=number) {
				System.out.print(count+"\t");
				count++;
				j++;
			}
			row++;
			number += 2;
			space--;
			System.out.println("\t");
		}

	}

}
