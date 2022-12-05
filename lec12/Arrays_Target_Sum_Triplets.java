package lec12;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Target_Sum_Triplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		Arrays.sort(arr);
		print(arr,x);
	}
	
	public static void print(int[]arr,int x) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						System.out.print(arr[i]+", "+arr[j]+" and "+arr[k]);
						System.out.println();
					}
				}
			}
		}
	}
}
