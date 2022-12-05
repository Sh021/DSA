package Lec3;

import java.util.Scanner;

public class Pattern_Double_sided_Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int space2=-1;
		int row=1;
		int irr=1;
		int num=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int val=irr;
			while(j<=num) {
				System.out.print(val+" ");
				val--;
				j++;
				}
			int k=1;
			while(k<=space2) {
				System.out.print("  ");
				k++;
			}
			int l=1;
			if(row==1||row==n) {
				l=2;
			}
			while(l<=num) {
				val++;
				System.out.print(val+" ");
				l++;
			}
			
			
			if(row<(n/2)+1) {
			space=space-2;
			num++;
			irr++;
			space2=space2+2;
			}
			else {
				space=space+2;
				num--;
				irr--;
				space2=space2-2;
			}
			row++;
			System.out.println();
		}

	}

}
