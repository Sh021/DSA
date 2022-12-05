package lec18;

import java.util.Arrays;
import java.util.Scanner;

public class Painter_partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(mintime(arr,k));
	}
	
	public static int mintime(int []arr,int k) {
		int lo=0;
		int hi=0;
		for(int i=0;i<arr.length;i++) {
			hi+=arr[i];	
		}
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(arr,k,mid)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	
	public static boolean isitpossible(int[]arr,int k,int mid) {
		int painter=1;
		int time=0;
		int i=0;
		while(i<arr.length) {
			if(time+arr[i]<=mid) {
				time+=arr[i];
				i++;
			}
			else {
				painter++;
				time=0;
			
			if(painter>k) {
				return false;
			}
			}
		}
		return true;		
	}

}
