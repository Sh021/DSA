package lec46;

import java.util.*;
public class LCA_hackblock {
	Scanner sc=new Scanner(System.in);

	    public class binarytree{
	        public class Node{
	            int data;
	            Node left;
	            Node right;
	        }

	        private Node root;

	        public binarytree(){
	            this.root=Createtree();
	        }
	        private Node Createtree(){
	            int item=sc.nextInt();
	            Node nn=new Node();
	            nn.data=item;
	            boolean lt=sc.nextBoolean();
	            if(lt==true){
	                nn.left=Createtree();
	            }
	            boolean rt=sc.nextBoolean();
	            if(rt==true){
	                nn.right=Createtree();
	            }
	            return nn;
	        }
	        public static void main(String args[]) {
		    	Scanner sc=new Scanner(System.in);
		        binarytree bt=new binarytree();
		        int n=sc.nextInt();
		        int m=sc.nextInt();
		        Node ans=lowestCommonAncestor(bt,n,m);

		    }

		    public Node lowestCommonAncestor(binarytree bt, int p, int q) {
			       if(bt==null) {
			    	   return null;
			       }
			    	if(bt.data==p||bt.data==q) {
			        	return bt;
			        }
			    Node left=lowestCommonAncestor(bt.left, p, q);
			    Node right=lowestCommonAncestor(bt.right, p, q);
			    if(left!=null&&right!=null) {
			    	return bt;
			    }
			    if(left==null) {
			    	return right;
			    }else {
			    	return left;
			    }
			    
			    }
	    }

		
		   
		
	}


