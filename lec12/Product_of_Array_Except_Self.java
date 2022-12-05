package lec12;

import java.util.Scanner;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		fun(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static long[] fun(long[] arr) {
		long[] brr = new long[arr.length];
		long[] crr = new long[arr.length];
		brr[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			brr[i] = brr[i - 1] * arr[i - 1];
		}
		crr[arr.length - 1] = 1;
		for (int i = arr.length - 2; i >= 0; i--) {
			crr[i] = crr[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = brr[i] * crr[i];
		}
		return arr;
	}
}
