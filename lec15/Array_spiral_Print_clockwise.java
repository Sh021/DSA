package lec15;

import java.util.Scanner;

public class Array_spiral_Print_clockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int m=sc.nextInt();
		int [][]arr=new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		spiralclock(arr);	
		System.out.println("END");
	}

	public static void spiralclock(int[][] arr) {
		// TODO Auto-generated method stub
		int min_row=0;
		int count=0;
		int max_row=arr.length-1;
		int min_col=0;
		int max_col=arr[0].length-1;
		int  total=arr.length*arr[0].length;
		while(count<total){
		for(int i=min_col;i<=max_col && count<total;i++) {
			System.out.print(arr[min_col][i]+", ");
			count++;
		}
		min_row++;
		for(int i=min_row;i<=max_row && count<total;i++) {
			System.out.print(arr[i][max_col]+", ");
			count++;
		}
		max_col--;
		for(int i=max_col;i>=min_col && count<total;i--) {
			System.out.print(arr[max_row][i]+", ");
			count++;
		}
		max_row--;
		for(int i=max_row;i>=min_row && count<total;i--) {
			System.out.print(arr[i][min_col]+", ");
			count++;
		}
		min_col++;
		}
	}
	

}
