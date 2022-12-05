package Lec26;

import java.util.Scanner;

public class coin_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		coin_permutation(arr,t,"");

	}
	
	public static void coin_permutation(int []coin,int total,String ans) {
		if(total==0) {
			System.out.println(ans);
			return;
		}
		
		
		for(int i=0;i<coin.length;i++) {
		if(total>=coin[i]) {
			
			coin_permutation(coin,total-coin[i],ans+coin[i]+" ");
			
		}
			
		}
		
	}

}
