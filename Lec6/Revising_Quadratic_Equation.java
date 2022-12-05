package Lec6;

import java.util.Scanner;

public class Revising_Quadratic_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=(b*b)-(4*a*c);
		if(d<0) {
			System.out.println("Imaginary");
		}
		else if(d==0) {
			System.out.println("Real and Equal");
			int r=(int) (((-b)+(Math.sqrt((b*b)-(4*a*c))))/2*a);
			System.out.println(r+" "+r);
		}
		else {
			System.out.println("Real and Distinct");
			int r1=(int) (((-b)-(Math.sqrt((b*b)-(4*a*c))))/2*a);
			int r2=(int) (((-b)+(Math.sqrt((b*b)-(4*a*c))))/2*a);
			System.out.println(r1+" "+r2);
		}
	}

}
