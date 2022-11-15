package lec46;

import java.util.*;

public class Path_sum2 {

	
	// Definition for a binary tree node.
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }
	 
	 
	class Solution {
	    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> ans=new ArrayList<>();
	        List<Integer> curr=new ArrayList<>();
	        path(root, targetSum, ans,curr);
	        return ans;
	        }
	    
	    public void path(TreeNode nn,int target,List<List<Integer>> ans,List<Integer> curr) {
	    	
	    	if(nn==null) {
	    		return;
	    	}
	    	if(nn.left==null&&nn.right==null&&target-nn.val==0) {
	    		curr.add(nn.val);
		    	ans.add(new ArrayList<Integer>(curr));
		    	curr.remove(curr.size()-1);
	    	}
	    	curr.add(nn.val);
	    	path(nn.left, target-nn.val, ans, curr);
	    	path(nn.right, target-nn.val, ans, curr);
	    	curr.remove(curr.size()-1);
	    	
	    }
	}
}
