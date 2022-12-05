package Lec27;

import java.util.*;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		boolean [] board=new boolean [n];
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		combination(board,k,ll,0,ans,0);
		System.out.println(ans);
	}
	
	public static void combination(boolean [] board,int k,List<Integer> ll,int idx,List<List<Integer>> ans,int total) {
		if(k==total) {
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=idx;i<board.length;i++) {
			if(board[i]==false) {
				ll.add(i+1);
				board[i]=true;
			combination(board,k,ll,i+1,ans,total+1);
			board[i]=false;
			   ll.remove(ll.size()-1);
			}
		}
		
	}

}
