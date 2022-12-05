package Lec27;

import java.util.*;

public class Combination_sum_ii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,1,2,7,6,1,5};
		int target=8;
		Arrays.sort(arr);
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		combisum(arr,target,0,ans,ll,0);
		System.out.println(ans);
	}
	
	public static void combisum(int [] arr,int t,int total,List<List<Integer>> ans,List<Integer> ll,int idx) {
		if(total==t) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=idx;i<arr.length;i++) {
			if(i!=idx && arr[i]==arr[i-1]) {
				continue;
			}
			if((arr[i]+total)<=t) {
				ll.add(arr[i]);
				combisum(arr,t,total+arr[i],ans,ll,i+1);
				ll.remove(ll.size()-1);
			}
		}
		
	}

}
