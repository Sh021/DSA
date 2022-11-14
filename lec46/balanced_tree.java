package lec46;

public class balanced_tree {

	
	 //Definition for a binary tree node.
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
	    public boolean isBalanced(TreeNode root) {
	        if(root==null){
	            return true;
	        }
	        boolean a=isBalanced(root.left);
	        boolean b=isBalanced(root.right);
	        int sd=ht(root.left)-ht(root.right);
	        boolean sdf;
	        if(sd==(-1)|| sd==0||sd==1){
	          sdf = true;
	        }else{
	           sdf= false;
	        }
	        if(a&&b&&sdf){
	            return true;
	        }
	        return false;
	        
	    }
	    
	    public int ht(TreeNode nn){
	        if(nn==null){
	            return -1;
	        }
	        int lt=ht(nn.left);
	        int rt=ht(nn.right);
	        return Math.max(lt,rt)+1;
	    }
	}

}
