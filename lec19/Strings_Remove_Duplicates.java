package lec19;

import java.util.Scanner;

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		remove(s);
	}
	
	public static void remove(String s) {
		String ss=""+s.charAt(0);
		for(int i=1;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=s.charAt(i-1)) {
				ss+=ch;
			}
		}
		System.out.println(ss);
	}
}
