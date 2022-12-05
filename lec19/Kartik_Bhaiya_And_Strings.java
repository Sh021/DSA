package lec19;

import java.util.Scanner;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		int flipa=bigstr(str,'a',n);
		int flipb=bigstr(str,'b',n);
		System.out.println(Math.max(flipa, flipb));
	}

	public static int bigstr(String str,char ch,int n) {
		// TODO Auto-generated method stub
		int ans=0;
		int si=0;
		int ei=0;
		int count=0;
		int unique=0;
		while(ei<str.length()) {
			if(str.charAt(ei)==ch) {
				unique++;
			}
			count++;
			while(unique>n && ei>=si) {
				if(str.charAt(si)==ch) {
					unique--;
				}
				count--;
				si++;
			}
			ans=Math.max(ans, count);
			ei++;
			
		}
		
		
		
		return ans;
	}

	
}
