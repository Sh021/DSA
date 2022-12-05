package Lec29;

import java.util.Scanner;

public class n_queen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char [] [] board=new char[n][n];
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[0].length;j++) {
				board[i][j]='.';
			}
		}
		queen(board,n,0);
		
	}
	
	public static void queen(char [] [] board,int queen,int cr) {
		if(queen==0) {
			display(board);
			return;
		}
		if(cr==board.length) {
			return;
		}
		
		for(int col=0;col<board[0].length;col++) {
			if(isitpossible(board,cr,col)==true) {
				board[cr][col]='Q';
				queen(board,queen-1,cr+1);
				board[cr][col]='.';
			}
		}
		
	}
	
	public static void display(char[][] board) {
		for(int i=0;i<board.length;i++) {
			System.out.println();
			for(int j=0;j<board[0].length;j++) {
				System.out.print(board[i][j]+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("*******");
		
	}

	public static boolean isitpossible(char [] [] board,int cr,int cc) {
		//up
		int r=cr;
		while(r>=0) {
			if(board[r][cc]=='Q') {
				return false;
			}
			r--;
		}
		//diagonal left
		 r=cr;
		int c=cc;
		while(r>=0&&c>=0) {
			if(board[r][c]=='Q') {
				return false;
			}
			r--;
			c--;
		}
		//diagonal right
		r=cr;
		c=cc;
		while(r>=0&&c<board[0].length) {
			if(board[r][c]=='Q') {
				return false;
			}
			r--;
			c++;
		}
		return true;
		
	}

}
