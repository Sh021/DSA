package lec17;

import java.util.Scanner;

public class Strings_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		toggle(st);
	}
	
	public static void toggle(String st) {
		String ans="";
		for(int i=0;i<st.length();i++) {
		
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z') {
				ans=ans+(char)(ch+32);
			}
			else {
				ans=ans+(char)(ch-32);
			}
		}
		System.out.println(ans);
		
		
	}
}
