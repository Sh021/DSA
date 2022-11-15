package lec46;



public class balanced_tree_opti {

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
	 public class diapair{
		 boolean f=true;
		 int h=-1;
	 }
	 
	class Solution {
	    public boolean isBalanced(TreeNode root) {
	      
	      return check(root).f;
	    	
	    }
	    
	    public diapair check(TreeNode nn) {
	    	if(nn==null) {
	    		return new diapair();	    	
	    		}
	    	
	    	diapair lt=check(nn.left);
	    	diapair rt=check(nn.right);
	    	diapair sdp=new diapair();
	    	sdp.h=Math.max(lt.h, rt.h)+1;
	    	int a=Math.abs(lt.h-rt.h);
	    	if(lt.f&&rt.f&&a<=1) {
	    		sdp.f=true;
	    	}
	    	else {
	    		sdp.f=false;
	    	}
	    	return sdp;
	    }
	}

}
