package Lec9;

import java.util.Scanner;

public class Inverse_of_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr= new int [n];
		for(int j=0;j<arr.length;j++) {
			arr[j]=sc.nextInt();
		}
		int [] brr=new int [n];
		inverse(arr,brr);

	}
	
	
	public static void inverse(int [] arr,int [] brr) {
		for(int i=0;i<arr.length;i++) {
			brr[arr[i]]=i;
		}
		for(int k=0;k<brr.length;k++) {
			System.out.print(brr[k]+" ");
		}
	}

}
