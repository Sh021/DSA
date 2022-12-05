package Lec7;

import java.util.Scanner;

public class Is_Armstrong_Number {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int pow=power(n);
			System.out.println(armstrong(n,pow));
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
