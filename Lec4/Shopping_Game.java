package Lec4;

import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			int ayush = sc.nextInt();
			int harshit = sc.nextInt();

			int sum1 = 0;
			int sum2 = 0;
		
		for (int j = 1;true; j += 1) {
			if(j%2!=0) {
				if((sum1+j)<=ayush) {
					sum1=sum1+j;
				}
				else {
					break;
				}
			}else {
				if((sum2+j)<=harshit) {
					sum2=sum2+j;
				}
				else {
					break;
				}
			}
		
		}
		if (sum1 > sum2) {
			System.out.println("Aayush");
		} else {
			System.out.println("Harshit");
		}
	}
	}
	
}
