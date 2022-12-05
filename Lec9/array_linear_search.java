package Lec9;

import java.util.Scanner;

public class array_linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		System.out.println(linearsearch(arr,m));
	}
	
	public static int linearsearch(int []arr,int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}
	

}
