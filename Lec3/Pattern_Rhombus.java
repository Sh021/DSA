package Lec3;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int space=n-1;
		int irr=1;
		int row=1;
		while(row<=(2*n)-1) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			int val=irr;
			while(j<=num) {
				System.out.print(val+"\t");
				if(j<(num/2)+1)
				val++;
				else {
				val--;
				}
				j++;
			}
			if(row<n) {
			num=num+2;
			space--;
			irr++;
			}
			else {
				num=num-2;
				space++;
				irr--;
			}
			row++;
			System.out.println();
		}

	}

}
