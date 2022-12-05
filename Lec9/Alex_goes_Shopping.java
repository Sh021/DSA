package Lec9;

import java.util.Scanner;

public class Alex_goes_Shopping {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int noi=sc.nextInt();
		for(int j=0;j<noi;j++) {
			check(arr);
		}
	}

	public static void check(int [] arr) {
		int p=sc.nextInt();
		int q=sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(p%arr[i]==0) {
				count++;
			}
		}
		if(count==q) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
	
}
