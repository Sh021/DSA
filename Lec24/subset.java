package Lec24;

import java.util.Scanner;

public class subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr =new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		subset(arr,0,"");
	}
	
	public static void subset(int []arr,int i,String ans) {
		if(i==arr.length) {
			System.out.println(ans);
			return;
		}
		
		
		subset(arr,i+1,ans);
		subset(arr,i+1,ans+arr[i]+" ");
	}

}
