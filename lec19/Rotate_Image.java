package lec19;

import java.util.Scanner;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][]arr=new int [n][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {				
				arr[i][j]=sc.nextInt();
			}
		}
		rotate(arr,n);
		
	}
	
	public static void rotate(int [][]arr,int n){
		int [][]brr=new int [n][n];		
		
		
		
	}
	
	

}
