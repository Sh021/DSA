package Lec9;

import java.util.Scanner;

public class Help_ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-->0) {
			int [] arr=new int[4];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
				int n=sc.nextInt();
				int m=sc.nextInt();
				int [] brr=new int[n];
				int [] crr=new int[m];
			for(int i=0;i<n;i++) {
				brr[i]=sc.nextInt();
			}
			for(int i=0;i<m;i++) {
				crr[i]=sc.nextInt();
				System.out.println(minrupee(arr,brr,crr));
			}
			
		}

	}
	
	public static int minrupee(int[]arr,int[]brr,int[]crr) {
		int ans=0;
		
		
		
		
		return ans;
	}

}
