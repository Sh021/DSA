package Lec6;

import java.util.Scanner;

public class Chewbacca_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long ans=0;
		long mul=1;
		for( long i=n;i>9;i=n) {
			long rem=n%10;
			if(rem>=5) {
				long t=9-rem;
				ans=ans+(t*mul);
			}
			else {
				ans=ans+(rem*mul);
			}
			mul=mul*10;
			n=n/10;
		}
		if(n==9||n<5) {
			ans=ans+(n*mul);
		}
		else {
				n=(9-n);
				ans=ans+(n*mul);	
		}
		System.out.println(ans);
	}
} 
