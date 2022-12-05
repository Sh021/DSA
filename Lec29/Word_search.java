package Lec29;

public class Word_search {

	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [][] ques= {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String target="ABCCED";
		for(int i=0;i<ques.length;i++) {
			for(int j=0;j<ques[0].length;j++) {
				if(ques[i][j]!=target.charAt(0)) {
					continue;
				}
				else {
					boolean ans=search(ques,target,i,j,0);	
					if(ans==true) {
						System.out.println(true);
						return;
					}
				}
			}
		}
		System.out.println(false);
	
	}
	
	public static boolean search(char [][] ques,String target,int cr,int cc,int idx) {
		if(idx==target.length()) {
			return true;
		}
		if(cr>ques.length-1 ||cr<0 || cc>ques[0].length-1 ||  cc<0 || ques[cr][cc]!=target.charAt(idx)) {
			return false;
		}
		
		
		int [] r= {0,0,-1,1};
		int [] c= {-1,1,0,0};
		
		ques[cr][cc]='*';
		
		for(int i=0;i<r.length;i++) {
		
		boolean ans=search(ques,target,cr+r[i],cc+c[i],idx+1);
		if(ans==true) {
			return ans;
		}
		}
		ques[cr][cc]=target.charAt(idx);
		
		return false;
	}

}
