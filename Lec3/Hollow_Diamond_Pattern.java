package Lec3;

import java.util.Scanner;

public class Hollow_Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=n;
		int space=-1;
		int row=1;
		while(row<=n) {
			int i=1;
			while(i<=(star/2)+1) {
				System.out.print("*"+"\t");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("\t");
				j++;
			}
			
			int k=1;
			if(row==1 || row==n) {
			k=2;
			}
			while(k<=(star/2)+1) {
				System.out.print("*"+"\t");
				k++;
			}
			if(row<(n/2)+1) {
			star=star-2;
			space=space+2;
			}
			else {
				star=star+2;
				space=space-2;
			}
			row++;
			System.out.println();
		}

	}

}