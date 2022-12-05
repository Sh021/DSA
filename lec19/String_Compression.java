package lec19;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		compress(s);

	}
	
	public static void compress(String s) {
		String ans=""+s.charAt(0);
		int count=1;
		for(int i=1;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==s.charAt(i-1)) {
				count++;
			}
			else {
				ans+=count;
				count=1;
				ans+=s.charAt(i);
			}
		}
		ans+=count;
		System.out.println(ans);
	}

}
