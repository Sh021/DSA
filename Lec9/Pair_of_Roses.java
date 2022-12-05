package Lec9;

import java.util.Scanner;

public class Pair_of_Roses {

	public static void main(String[] args) 
	{
		 try (Scanner sc = new Scanner(System.in)) {
			int t=sc.nextInt();	
			for(int k=1;k<=t;k++)
			{
				int n=sc.nextInt();
				int arr[]=new int[n];
	            for(int i=0;i<n;i++)
			    {
	            	arr[i]=sc.nextInt();
			    }
				int m=sc.nextInt();
				buying(arr,m);
			}
		}
	}
	
	public static void buying(int [] arr, int price) {
		int mindiff=Integer.MAX_VALUE;
		int temp=0;
		int temp1=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) 
			{
				if((arr[i]+arr[j]==price) && (Math.abs(arr[i]-arr[j])<mindiff))
				{
					temp=arr[i];
					temp1=arr[j];
					mindiff=Math.abs(arr[i]-arr[j]);
				}
			}
		}
		print(Math.min(temp, temp1),Math.max(temp, temp1));
	}
	
	public static void print(int temp1, int temp2) {
		System.out.println("Deepak should buy roses whose prices are "+temp1+" and "+temp2+".");
	}
}
