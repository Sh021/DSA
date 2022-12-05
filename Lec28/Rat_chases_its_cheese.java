package Lec28;
import java.util.*;
public class Rat_chases_its_cheese {
		static boolean st=false;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char[][]ques=new char[n][m];
		for(int i=0;i<ques.length;i++) {
			String s=sc.next();
			for(int j=0;j<ques[0].length;j++) {
				ques[i][j]=s.charAt(j);
			}
		}
		int [][]ans=new int [n][m];
		rat(0,0,ques,ans);
		if(st==false) {
			System.out.println("NO PATH FOUND");
		}
		
	}
	
	
	public static void rat(int cr,int cc,char[][]ques,int [][]ans) {
		if(cr==ans.length-1&&cc==ans[0].length-1) {
			if(ques[cr][cc]=='O') {
			ans[cr][cc]=1;
			st=true;
			display(ans);
			ans[cr][cc]=0;
			}
			return;
		}
		
		
		if(cr>ans.length-1 ||cr<0 || cc>ans[0].length-1 ||  cc<0 || ques[cr][cc]=='X') {
			return;
		}
		
		int [] r= {0,0,-1,1};
		int [] c= {-1,1,0,0};
		
		ans[cr][cc]=1;
		ques[cr][cc]='X';
		
		for(int i=0;i<r.length;i++) {
			
			rat(cr+r[i],cc+c[i],ques,ans);
			
		}
		ans[cr][cc]=0;
		ques[cr][cc]='O';
		
		
		
	}
	
	public static void display(int [][]ans) {
		
		for(int i=0;i<ans.length;i++) {
			System.out.println();
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
		}
		
	}
	

}
