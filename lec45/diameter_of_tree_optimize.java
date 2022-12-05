package lec45;

public class diameter_of_tree_optimize {

	
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
	 
		public class diapair {
				int d = 0;
				int h = -1;
			}
		  				
		class Solution {
		    public int diameterOfBinaryTree(TreeNode root) {
		    		
		    	return diameter(root).d;
		    	
		    }
		    
		    public diapair diameter(TreeNode nn) {
		    	if(nn==null) {
		    		return new diapair();
		    	}
		    	
		    	diapair ldp=diameter(nn.left);
		    	diapair rdp=diameter(nn.right);
		    	diapair sdp=new diapair();
		    	sdp.h=Math.max(ldp.h,rdp.h)+1;
		    	int dia=ldp.h+rdp.h+2;
		    	sdp.d=Math.max(dia, Math.max(ldp.d, rdp.d));
		    	return sdp;
		    	
		    }

		 
		}

}
