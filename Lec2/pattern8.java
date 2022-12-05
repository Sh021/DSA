package Lec2;

import java.util.Scanner;

public class pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int space=n-2;
		int space2=0;
		for(int i=0;i<n;i++) {
			int m=0;
			while(m<space2) {
				System.out.print("  ");
				m++;
			}
			int j=0;
			while(j<star) {
				System.out.print("* ");
				j++;
			}
			int k=0;
			while(k<space) {
				System.out.print("  ");
				k++;
			}			
			int l=0;
			if(i==(n/2)) {
				l++;
			}
			while(l<star) {
				System.out.print("* ");
				l++;
			}
			if(i<(n/2)) {
			space-=2;
			space2++;
			}
			else {
				space+=2;
				space2--;
			}
			System.out.println();
		}
	}
}
