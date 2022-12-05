package Lec7;

import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			while(n>0) {
				int i=sc.nextInt();
				System.out.println(decimal_number(i));
				n--;
			}
		}
	}
	public static int decimal_number(int n) {
		int ans=0;
		int mul=0;
		for(int i=1;i>0;i=n) {
		int rem=n%10;
		ans=(int) (ans+(rem*Math.pow(2, mul)));
		mul++;
		n=n/10;
		}
		return ans;
	}
}
