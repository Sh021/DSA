package Lec24;

import java.util.Scanner;

public class Nth_Triangle_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(tri(n));
	}
	 public static int tri(int n) {
		 if(n==0) {
			 return 0;
		 }
		 
		int sum=tri(n-1);
		 return n+sum;
	 }

}
