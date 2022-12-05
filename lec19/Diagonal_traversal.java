package lec19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Diagonal_traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] arr=new int [n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();	
			}
		}
		Trav(arr);
	}
	
	public static void Trav(int [][] arr) {
		int n=arr.length;
		int m=arr[0].length;
		int []ans=new int[n*m];
		int j=0;
		for(int i=0;i<n+m-1;i++) {
			int r=0;
			int c=0;
			if(i<m) {
				r=0;
				c=i;
			}
			else {
				r=i-m+1;
				c=m-1;
			}
		ArrayList<Integer> list=new ArrayList<>();
				while(r<n && c>=0) {
					list.add(arr[r][c]);
					r++;
					c--;
				}
			if(i%2==0) {
				Collections.reverse(list);
			}
			for(int val:list) {
				ans[j]=val;
				j++;
			}
			
		}
		for(int i=0;i<n*m;i++) {
			System.out.print(ans[i]);
		}
		
	}

}
