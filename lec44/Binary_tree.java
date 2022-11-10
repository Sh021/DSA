package lec44;

import java.util.Scanner;

public class Binary_tree {
	Scanner sc=new Scanner(System.in);
	public class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public Binary_tree() {
		this.root=CreateTree();
	}

	private Node CreateTree() {
		// TODO Auto-generated method stub
		int item = sc.nextInt();
		Node nn = new Node();
		nn.data = item;
		boolean hlc = sc.nextBoolean();
		if (hlc == true) {
			nn.left = CreateTree();// left subtree
		}
		boolean hrc = sc.nextBoolean();
		if (hrc == true) {
			nn.right = CreateTree();// right subtree
		}
		return nn;
	}
	
	public void Display() {
		Display(this.root);
	}
	
	private void Display(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		str += nn.data;
		str = "<--" + str + "-->";
		if (nn.left != null) {
			str = nn.left.data + str;
		} else {
			str = "." + str;
		}
		if (nn.left != null) {
			str = str + nn.right.data;
		} else {
			str = str + ".";
		}

		System.out.println(str);
		Display(nn.left);
		Display(nn.right);
		
				
	}
	
	public int max () {
		 return max(this.root);
	}
	
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int lmax=max(nn.left);
		int rmax=max(nn.right);
		return Math.max(lmax, Math.max(rmax, nn.data));		
	}
	
	public boolean find(int item) {
		return find(this.root,item);
	}
	
	private boolean find(Node nn,int item) {
		if(nn==null) {
			return false;
		}
		
		if(nn.data==item) {
			return true;
		}
		return find(nn.left, item)|| find(nn.right, item);
	
	}
	
	

}
