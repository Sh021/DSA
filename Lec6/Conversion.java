package Lec6;

import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		for(int i=n1;i<=n2;i+=n3) {
			int c=(5*(i-32)/9);
			System.out.println(i+"\t"+c);
		}

	}

}
