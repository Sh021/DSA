package lec46;



public class Sum_Root_to_Leaf_Numbers {

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
			    public int sumNumbers(TreeNode root) {
			     
			        return sum(root, 0);
			    }
			    public int sum(TreeNode nn,int n) {
			    	if(nn==null) {
			    		return 0;
			    	}
			    	if(nn.left==null&&nn.right==null) {
			    		return n*10+nn.val;
			    	}
			    	int a=sum(nn.left, n*10+nn.val );
			    	int b=sum(nn.right, n*10+nn.val);
			    	return a+b;
			    }
			    
			}

}
