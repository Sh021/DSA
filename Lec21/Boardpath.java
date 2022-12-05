package Lec21;

import java.util.Scanner;

public class Boardpath {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boardpath(n,m,"");
		System.out.println("\n"+count);
	}

	public static void boardpath(int n,int m,String ans) {
		if(n==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(n<0) {
			return;
		}
		
		for(int i=1;i<=m;i++) {
			boardpath(n-i,m,ans+i);
		}
		
	}
}
