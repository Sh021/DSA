package Lec9;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			int x = sc.nextInt();
			int[] brr = new int[n];
			for (int i = 0; i < x; i++) {
				int a = sc.nextInt();
				int b=a%n;
				sum(arr, b, brr);
			}
			System.out.println(sum1(arr));
			
		}
	}
	public static int sum1(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		int mod=(int) (sum%((Math.pow(10, 9))+7));
		
		return mod;
	}

	public static void sum(int[] arr, int a, int[] brr) {
		for(int i=0;i<arr.length;i++) {
			int r=i-a;
			if(r<0) {
				r=r+arr.length;
			}
			brr[i]=arr[i]+arr[r];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=brr[i];
		}
	}
}
