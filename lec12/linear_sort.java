package lec12;

import java.util.Scanner;

public class linear_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		linear(arr);
		for(int i=0;i<n;i++) {
		System.out.print(arr[i]);
		}
	}
	
	public static void linear(int[]arr) 
	{
		int min=arr[0];
		for(int i=1;i<arr.length-1;i++) 
		{
			if(min<arr[i]) 
			{
				min=arr[i];
			}
		}
	}
}
