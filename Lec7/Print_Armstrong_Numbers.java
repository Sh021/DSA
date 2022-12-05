package Lec7;

import java.util.Scanner;

public class Print_Armstrong_Numbers {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			for(int i=n;i<=m;i++) {
				int pow=power(i);
				boolean arm=armstrong(i,pow);
				if(arm==true) {
					System.out.println(i);;
				}
			}
		}
	}
	
	public static int power(int n) {
		int count=0;
		for(int i=1;i>0;i=n) {
		n/=10;	
		count++;
		}
		return count;
	}
	
	public static Boolean armstrong(int n,int pow) {
		int ans=0; 
		int temp=n;
		for(int i=1;i>0;i=n) {
			int rem=n%10;
			ans=(int)(ans+(Math.pow(rem, pow)));
			n/=10;
		}
		
		if(temp==ans) {
			return true;
		}
		else {
			return false;
		}
	}
}
