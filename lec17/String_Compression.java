package lec17;

import java.util.Scanner;

public class String_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		compress(st);
	}
	
	public static void compress(String st) {
		String ans=""+st.charAt(0);
		 int count=1;
		for(int i=1;i<st.length();) {
			char ch=st.charAt(i);
			if(ch==st.charAt(i-1)) {
				i++;
				count++;
			}
			else {
				if(count!=1) {
					ans+=count;
					count=1;					
				}
				ans+=ch;
				i++;
			}
			
		}
		if(count>1) {
			ans+=count;
		}
		
		System.out.println(ans);
		
	}

}
