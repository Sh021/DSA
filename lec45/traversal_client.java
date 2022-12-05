package lec45;

public class traversal_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		traversal pre=new traversal();
		//10 true 30 true 70 false false true 50 true 11 false true 12 true 13 false false false true 180 false false true 140 true 170 false false true 180 true 120 false false true 130 true 110 false true 12 false false false
		pre.preorder();
	//	System.out.println();
		pre.postorder();
		pre.inorder();

	}

}
