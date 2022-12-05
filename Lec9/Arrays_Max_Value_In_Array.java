package Lec9;

import java.util.Scanner;

public class Arrays_Max_Value_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int  [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(max(arr));

	}

	
	public static int max(int [] arr) {
		int max=arr[0];
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>max) {
				max=arr[k];
			}
		}
		return max;
	}
}
