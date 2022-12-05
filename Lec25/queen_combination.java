package Lec25;

import java.util.Scanner;

public class queen_combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		boolean [] board=new boolean [n];
		nqueen(board,t,0,"",-1);

	}
	public static void nqueen(boolean []board,int tq,int nqpsf,String ans,int idx) {
		//tq-->total queen
		//nqpsf-->no. of queen placed so far
		if(tq==nqpsf) {
			System.out.println(ans);
			return;
		}
		
		for(int i=idx+1;i<board.length;i++) {
			if(board[i]==false) {//queen placed nhi hai 
				board[i]=true;//queen placed
				nqueen(board,tq,nqpsf+1,ans+"b"+i+"q"+nqpsf+" ",i);
				board[i]=false;//un do
			}
		}
	}

}
