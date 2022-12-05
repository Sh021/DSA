package lec45;

import java.util.Scanner;

public class traversal {

	Scanner sc=new Scanner(System.in);
	public class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public traversal() {
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
	
	public void preorder() {
		preorder(this.root);
		System.out.println();
	}
	
	private void preorder(Node nn) {
		if(nn==null) {
			return ;
		}
		System.out.print(nn.data+"	");
		preorder(nn.left);
		preorder(nn.right);
	}
	public void postorder() {
		postorder(this.root);
		System.out.println();
	}
	
	private void postorder(Node nn) {
		if(nn==null) {
			return ;
		}
		postorder(nn.left);
		postorder(nn.right);
		System.out.print(nn.data+"	");
	}
	public void inorder() {
		inorder(this.root);
		System.out.println();
	}
	
	private void inorder(Node nn) {
		if(nn==null) {
			return ;
		}
		inorder(nn.left);
		System.out.print(nn.data+"	");
		inorder(nn.right);
	}

}
