package Lec7;

import java.util.Scanner;

public class Conversion_Any_to_Any {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int sourcebase=sc.nextInt();
			int destinationbase=sc.nextInt();
			int number=sc.nextInt();
			int d=(decimal(number,sourcebase));
			System.out.println(conversion(d,destinationbase));
		}
	}
	
	public static int decimal(int n,int base) {
		int ans=0;
		int mul=0;
		for(int i=1;i>0;i=n) {
			int rem=n%10;
			ans=(int)(ans+rem*(Math.pow(base, mul)));
			mul++;
			n=n/10;
		}
		return ans;
	}
	
	public static int conversion(int dec,int base) {
		int ans=0;
		int mul=1;
		for(int i=1;i>0;i=dec) {
			int rem=dec%base;
			ans=ans+(rem*mul);
			mul*=10;
			dec=dec/base;
		}
		return ans;
	}
}
