package lec19;

import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			String s=sc.next();
			longsub(s);
		}

	}
	
	public static void longsub(String s) {
		int ans=0;
		int []arr=new int [256];
		int si=1;
		int ei=1;
		
		while(ei<s.length()) {
			char ch=s.charAt(ei);
			if(ch!=s.charAt(ei-1)) {
				si++;
				ans+=si;
			}
			else {
				si=1;
			}
			ei++;
		}	
		System.out.println(ans);
	}

}
