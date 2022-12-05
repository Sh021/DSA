package Lec27;

import java.util.*;

public class Combination_Sum_III {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		combisum(k,n,0,0,1,ans,ll);
		System.out.println(ans);
	}
	
	public static void combisum(int k,int n,int count,int total,int idx,List<List<Integer>> ans,List<Integer> ll) {
		if(total==n && count==k) {
			//System.out.println(ans);
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=idx;i<10;i++) {
			if((i+total)<=n) {
				ll.add(i);
				combisum(k,n,count+1,total+i,i+1,ans,ll);
				ll.remove(ll.size()-1);
			}
			
		}
		
		
	}

}
