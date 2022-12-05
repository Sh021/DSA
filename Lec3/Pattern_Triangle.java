package Lec3;

import java.util.Scanner;

public class Pattern_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int space=n-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			int val=row;
			while(j<=num) {
				System.out.print(val+"\t");
				if(j<row) {
					val++;
				}
				else {
					val--;
				}
				j++;
			}
			num=num+2;
			row++;
			space--;
			System.out.println();
			
		}

	}

}
