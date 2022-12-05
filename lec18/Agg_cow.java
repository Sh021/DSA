package lec18;

import java.util.Arrays;
import java.util.Scanner;

public class Agg_cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	//	int test=sc.nextInt();
		//for(int i=0;i<test;i++) {
			int t=sc.nextInt();
			int c=sc.nextInt();
			int [] stall=new int [t];
			for(int j=0;j<t;j++) {
				stall[j]=sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(largestmindis(stall,c));	
		
		//}

	}
	
	public static int largestmindis(int []arr,int c) {
		int ans=0;
		int low=arr[0];
		int high=arr[arr.length-1];
		while(high>=low) {
			int mid=(high+low)/2;
			if(isitpossible(arr,c,mid)==true) {
				ans=mid;
				low=mid+1;
			}
			else {
				high=mid-1;
			}	
		}
		return ans;		
	}

	public static boolean isitpossible(int[] arr, int c, int mid) {
		// TODO Auto-generated method stub
		int cow=1;
		int position=arr[0];
		for(int i=1;i<arr.length;) {
			if(arr[i]-position>=mid) {
				cow++;
				position=arr[i];
			}
			if(cow==c) {
				return true;
			}
			i++;
		}
		return false;
	}
}
