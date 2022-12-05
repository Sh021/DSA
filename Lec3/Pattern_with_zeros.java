package Lec3;

import java.util.Scanner;

public class Pattern_with_zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=num) {
				if(i==1||i==num) {
				System.out.print(row+"\t");
				}
				else {
					System.out.print("0"+"\t");
				}
				i++;
			}
			num++;
			row++;
			System.out.println();
		}

	}

}
