package Lec21;

import java.util.Scanner;

public class recursion_subsequence {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str = sc.next() ;
		String s="";
		subseq(str, s);
		System.out.println("\n"+count);

	}
	
	public static void subseq(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return ;
			}
		char ch=ques.charAt(0);
		subseq(ques.substring(1),ans);
		subseq(ques.substring(1),ans+ch);
		
	}

}
