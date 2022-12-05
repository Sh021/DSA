package lec19;

import java.util.Scanner;

public class Subarrays_Having_Product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(subarr(arr,k));
	}
	
	public static int subarr(int []arr,int k) {
		int si=0;
		int ei=0;
		int ans=0;
		int p=1;
		
		while(ei<arr.length) {
			//window grow
			p*=arr[ei];
			
			//window shrink
			while(p>=k) {
				p/=arr[si];
				si++;
			}
			//update ans
			ans=ans+ei-si+1;
			ei++;
			
			
		}
	
		
		
		return ans;
	}

}
