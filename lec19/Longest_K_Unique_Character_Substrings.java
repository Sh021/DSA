package lec19;

import java.util.Scanner;

public class Longest_K_Unique_Character_Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		for(int i=0;i<test;i++) {
			String str=sc.next();
			int k=sc.nextInt();
			System.out.println(substring(str,k)); 
		}
	}

	public static int substring(String str, int k) {
		// TODO Auto-generated method stub
		int freq []=new int [256];
		int ans=-1;
		int si=0;
		int ei=0;
		int uniq=0;
		while(ei<str.length()) {
			char ch=str.charAt(ei);
		if(freq[ch]==0) {
			uniq++;
		}
		freq[ch]=freq[ch]+1;
		while(uniq>k && ei>=si) {
			char c=str.charAt(si);
			freq[c]-=1;
			if(freq[c]==0) {
				uniq--;
			}
			si++;
		}
		if(uniq==k) {
		ans=Math.max(ans, ei-si+1);	
		}
		ei++;
		}
		return ans;
	}
	
}
