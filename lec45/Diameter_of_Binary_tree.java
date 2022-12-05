package lec45;

import lec45.diameter_of_tree_optimize.TreeNode;
import lec45.traversal.Node;

public class Diameter_of_Binary_tree {

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
		    public int diameterOfBinaryTree(TreeNode root) {
		    		if(root==null) {
		    			return 0;
		    		}
		    	int lt=diameterOfBinaryTree(root.left);
		    	int rt=diameterOfBinaryTree(root.right);
		    	int sd=ht(root.left)+ht(root.right)+2;
		    	return Math.max(lt, Math.max(rt, sd));
		    	
		    }
	    
		    public  int ht(TreeNode nn) {
		    	if(nn==null) {
		    		return -1;
		    	}
		    	
		    	int lt=ht(nn.left);
		    	int rt=ht(nn.right);
		    	return Math.max(lt, rt)+1;
		    	
		    }

	 }
