package Lec24;

import java.util.Scanner;

public class Lexico_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		lexi(0,n);

	}

	public static void lexi(int curr, int end) {
		// TODO Auto-generated method stub
		if(curr>end) {
			return;
		}
		System.out.println(curr);
		int i=0;
		if(curr==0) {
			i=1;
		}
		for(;i<=9;i++) {
			lexi(curr*10+i,end);
		}
		
	}

}
