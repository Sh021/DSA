package lec17;

import java.util.Scanner;

public class playing_with_good_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(goodstring(str));
	}
	
	public static int goodstring(String str) {
		int ans=0;
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(isvowel(str.charAt(i))==true) {
				count++;
			}
			else {
				ans=Math.max(ans, count);
				count=0;
			}
		}
		ans=Math.max(ans, count);
		return ans;
	}
	
	public static boolean isvowel(char c) {
		if(c=='a'||c=='i'||c=='o'||c=='e'||c=='u') {
			return true;
		}
		else {
			return false;
		}
	}
}
