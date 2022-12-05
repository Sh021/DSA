package Lec21;

import java.util.Scanner;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Parenthesis(n,0,0,"");

	}
	public static void Parenthesis(int n,int op,int cl,String ans) {
		if(op==n && cl==n) {
			System.out.println(ans);
			return;
		}
		
		if(op<n) {
		Parenthesis(n,op+1,cl,ans+"(");
	}
		if(op>cl) {
		Parenthesis(n,op,cl+1,ans+")");
		}
	}

}
