package lec17;

import java.util.Scanner;

public class Can_you_read_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		canyoureadthis(str);
	}
	
	public static void canyoureadthis(String s) {
		String ans="";
		ans=ans+s.charAt(0);
		for(int i=1;i<s.length();i++) {
			char c=s.charAt(i);
		if(c>='A'&&c<='Z') {
			System.out.println(ans);
			ans="";
			ans+=c;
		}
		else {
			ans+=c;
		}	
		}
		System.out.println(ans);
	}

}
