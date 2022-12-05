package hack;

import java.util.Scanner;

public class choclate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		for(long i=0;i<n;i++) {
			long k=sc.nextLong();
			long l=sc.nextLong();
			long ans=0;
				ans=k%l;
				if(ans>l/2) {
					ans=l-ans;
				}
			System.out.println(ans);
			
		}

	}

}
