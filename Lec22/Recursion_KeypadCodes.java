package Lec22;

import java.util.Scanner;

public class Recursion_KeypadCodes {
	
	static int count=0;
	static String [] key= {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Keycode(str,"");
		System.out.println("\n"+count);
	}
	
	public static void Keycode(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		
		
		char ch=ques.charAt(0);
		String presskey=key[ch-48];
		
		for(int i=0;i<presskey.length();i++) {
			Keycode(ques.substring(1),ans+presskey.charAt(i));
		}
		
		
	}

}
