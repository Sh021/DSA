package Lec3;

import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		int val=1;
		int row=1;		
		while(row<=n) {
			int i=1;
			while(i<=num) {
				System.out.print(val+"\t");
				i++;
				val++;
			}
			num++;
			row++;
			System.out.println();
		}
			
	}

}
