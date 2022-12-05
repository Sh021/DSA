package lec18;

import java.util.Scanner;

public class book_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			int [] arr = new int [n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(maxnoofpages(arr,m));
		}		

	}
	public static int maxnoofpages(int []arr,int m) {
		int lo=0;
		int hi=0;
		for(int i=0;i<arr.length;i++) {
			hi+=arr[i];
		}
		int ans=0;
		while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(isitpossible(arr,mid,m)==true) {
			ans=mid;
			hi=mid-1;
		}
		else {
			lo=mid+1;
		}
		}
		return ans;
	}
	
	public static boolean isitpossible(int[]arr,int mid,int m) {
		int student=1;
		int page_read=0;
		for(int i=0;i<arr.length;) {
			if(page_read+arr[i]<=mid) {
				page_read+=arr[i];
				i++;
			}
			else {
				student++;
				page_read=0;
			}
			if(student>m) {
				return false;
			}
		}
		
		return true;
	}

}
