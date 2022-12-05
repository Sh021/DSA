package Lec22;

import java.util.Scanner;

public class Tricy_Permutation {

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
		
		
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<str.length();j++) {
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
