package Lec3;

import java.util.Scanner;

public class Pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		for(int row=0;row<n;row++) {
			 int ncr=1;
			for(int i=0;i<num;i++) {
				System.out.print(ncr+" ");
				ncr=(ncr*(row-i))/(i+1);
			}
			num++;
			System.out.println();
		}
	}

}
