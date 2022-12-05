package Lec6;

import java.util.Scanner;

public class Lower_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char input=sc.next().charAt(0);
		int n=(char) input;
		if(n<=91&&n>=65) {
			System.out.println("UPPERCASE");
		}
		else if(n>=97&&n<=126) {
			System.out.println("lowercase");
		}
		else {
			System.out.println("Invalid");
		}
	}

}
