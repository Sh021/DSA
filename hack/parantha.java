package hack;

import java.util.*;

public class parantha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int l=sc.nextInt();
		int [] arr= new int [l];
		for( int i=0;i<l;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(paratha(arr,p));
	}
	public static int paratha(int []arr,int p) {
		int lo=0;
		int hi=0;
		hi+=(arr[arr.length-1]*(p*(p+1)))/2;
		int time=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(arr,mid,p)==true) {
				time=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
			
		}
		return time;
		
	}
	public static boolean isitpossible(int [] arr,int mid,int p) {
		int chef=0;
		int paratha=1;
		int total_paratha=0;
		int time=0;
		while(chef<arr.length) {
			time+=arr[chef]*paratha;
			if(time<=mid) {
				paratha++; 
				total_paratha++;
			}
			else {
				paratha=1;
				chef++;
				time=0;
			}
		}
			if(total_paratha>=p) {
				return true;
			}
			else 
			{
			return false;
			}
		}
		
}
