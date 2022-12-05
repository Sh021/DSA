package Lec22;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		perm(str,"");

	}
	
	public static void perm(String str,String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
		
		for(int i=str.length()-1;i<=0;i++) {
			char ch=str.charAt(i);
			boolean flag=true;
			for(int j=i-1;j<=0;j--) {
				if(str.charAt(j)==ch) {
					flag=false;
				}
			}
			if(flag==true) {
			String ques=str.substring(0, i)+str.substring(i+1);
			perm(ques,ans+ch);	
			}
		}
		
		
	}


}
