package lec46;

public class LCAII {
	  //Definition for a binary tree node.
	  public class TreeNode {
	     int val;
	     TreeNode left;
	    TreeNode right;
	     TreeNode(int x) { val = x; }
	  }

	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(find(root, p)==false || find(root, q)==false) {
			return null;
		}
	else {
		if(root==null) {
			return null;
		}
		if(root==p || root==q) {
			return root;
		}
		TreeNode left=lowestCommonAncestor(root.left, p, q);
		TreeNode right=lowestCommonAncestor(root.right, p, q);
		if(left!=null&&right!=null) {
			return root;
		}
		if(left==null) {
			return right;
		}else {
			return left;
		}
	}
	}
	
	public Boolean find(TreeNode root,TreeNode p) {
		if(root==null) {
			return false;
		}
		if(root==p) {
			return true;
		}
		return find(root.left,p)|| find(root.right, p);
		
	}
}


