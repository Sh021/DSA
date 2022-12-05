package Lec27;

import java.util.ArrayList;
import java.util.List;

public class Subsets_return_in_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3};
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		subset(arr,ll,ans,0);
		System.out.println(ans);
		

	}
	
	public static void subset(int [] arr,List<Integer> ll,List<List<Integer>> ans,int i) {
		if(i==arr.length) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		subset(arr,ll,ans,i+1);
		ll.add(arr[i]);
		subset(arr,ll,ans,i+1);
		ll.remove(ll.size()-1);
		
		
	}

}
