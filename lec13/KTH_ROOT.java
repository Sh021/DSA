package lec13;

import java.util.Scanner;

public class KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int T=sc.nextInt();
		for(long i=0;i<T;i++) {
			long n=sc.nextLong();
			int k=sc.nextInt();
			System.out.println(number(n,k));
		}
	}

	public static long number(long n,int k) {
		long ans=0;
		long low=1;
		long high=n;
		for(;high>=low;) {
			long mid= (high+low)/2;
			if(Math.pow(mid, k)==n) {
				ans=mid;
				break;
			}
			else if (Math.pow(mid, k)<n) {
				ans=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		return ans;
	}
}
