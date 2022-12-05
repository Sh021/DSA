package Lec29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nqueen_leetcode {

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
		List<String> ll=new ArrayList<>();
		List<List<String>> as=new ArrayList<>();
		queen(board,n,0,as,0);
		System.out.println(as);
		
	}
	public static List<String> construct(int n,char [] [] board) {
		List<String> ll=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String s=new String(board[i]);
			ll.add(s);
		}
		return ll;
	}
	
	public static void queen(char [] [] board,int queen,int cr,List<List<String>> as,int check) {
		if(check==queen) {
			as.add(construct(queen,board));
			return;
		}
		if(cr==board.length) {
			return;
		}
		
		for(int col=0;col<board[0].length;col++) {
			if(isitpossible(board,cr,col)==true) {
				board[cr][col]='Q';
				queen(board,queen,cr+1,as,check+1);
				board[cr][col]='.';
			}
		}
		
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