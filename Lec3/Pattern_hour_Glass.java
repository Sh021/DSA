package Lec3;

import java.util.Scanner;

public class Pattern_hour_Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=(2*n)+1;
		int space=0;
		int val=n;
		int row=1;
		while(row<=(2*n)+1) {
			int h=1;
			while(h<=space) {
				System.out.print("  ");
				h++;
			}
			int i=1;
			int irr=val;
			while(i<=num){
				if(i<(num/2)+1) {
					System.out.print(irr+" ");
					irr--;
				}
				else {
					System.out.print(irr+" ");
					irr++;
				}
				i++;
			}
			if(row<n+1) {
			num=num-2;
			space++;
			val--;
			}
			else {
				num=num+2;
				space--;
				val++;
			}
			row++;
			System.out.println();
		}
	}

}
