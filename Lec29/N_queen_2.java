package Lec29;

import java.util.Scanner;

public class N_queen_2 {
		
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
		System.out.println(queen(board,n,0));
		
	}
	
	public static int queen(char [] [] board,int queen,int cr) {
        int c=0;
		if(queen==0) {
			return 1;
		}
		if(cr==board.length) {
			return 0;
		}
		
		for(int col=0;col<board[0].length;col++) {
			if(isitpossible(board,cr,col)==true) {
				board[cr][col]='Q';
			c+=	queen(board,queen-1,cr+1);
				board[cr][col]='.';
			}
		}
		return c;
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