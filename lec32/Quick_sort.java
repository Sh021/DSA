package lec32;

import java.util.Scanner;

public class Quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		} 
		int lo=0;
    	int hi=arr.length-1;
		QuickSort(arr, lo, hi);
		for (int i = 0; i < arr.length; i++) {
			System.out.print  (arr[i]+" ");
		}
	}
	
	public static void QuickSort(int [] arr,int lo,int hi) {
		if(lo>=hi) {
			return;
		}
		int idx = partition(arr, lo, hi);
		QuickSort(arr, lo, idx - 1);
		QuickSort(arr, idx + 1, hi);
		
	}
	
	public static int partition(int []arr,int lo,int hi) {
		int pivot=arr[hi];
		int idx=lo;
		for (int i = lo; i < hi; i++) {
			if (arr[i]<=pivot) {
				swap(arr, idx, i);
				idx++;
			}
		}
		swap(arr, hi, idx);
		return idx;
		
	}
	
	public static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
