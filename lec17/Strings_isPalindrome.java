package lec17;

import java.util.Scanner;

public class Strings_isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(substring(str));
		}
	
	public static int substring(String str) {
		int count=0;
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			String s=str.substring(i, j);
			if(ispalindrom(s)==true) {
				count++;
			}
		}
	}
		return count;
	}
	
	public static boolean ispalindrom(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
