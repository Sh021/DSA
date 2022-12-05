package Lec27;

import java.util.*;

public class coin_combination_return_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int t=sc.nextInt();
		coin_permutation(arr,t,ll,0,ans);
		System.out.println(ans);
		
	}
	
	public static void coin_permutation(int []coin,int total,List<Integer> ll,int idx,List<List<Integer>> ans) {
		if(total==0) {
			//System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		
		for(int i=idx;i<coin.length;i++) {
		if(total>=coin[i]) {
			ll.add(coin[i]);
			coin_permutation(coin,total-coin[i],ll,i,ans);
			ll.remove(ll.size()-1);
		}
			
		}
		
	}

}