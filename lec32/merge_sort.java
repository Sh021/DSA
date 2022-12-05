package lec32;

import java.util.Scanner;

public class merge_sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			
		}
		int lo=0;
		int hi=arr.length-1;
		int [] ans=merge_sort(arr,lo,hi);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		
	}
	
	public static int [] merge_sort(int[]arr,int lo,int hi) {
		if(lo==hi) {
			int []a=new int [1];
			a[0]=arr[lo];
			return a;
		}
		
		int mid=(lo+hi)/2;
		int [] fs =merge_sort(arr,lo,mid);
		int	[] ss=merge_sort(arr, mid+1, hi);
		
		return Merge_twosorted_array(fs, ss);	
	}
	
	public static int [] Merge_twosorted_array(int []arr1,int []arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int[]ans=new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n&&j<m) {
			
			if(arr1[i]<arr2[j]) {
				ans[k]=arr1[i];
				i++;
				k++;
			}
			else {
				ans[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<n) {
			ans[k]=arr1[i];
			i++;
			k++;
		}
		while(j<m) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		
		return ans;
	}
}
