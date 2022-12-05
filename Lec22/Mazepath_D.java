package Lec22;

import java.util.Scanner;

public class Mazepath_D {
	  static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		Mazepath(n-1,m-1,0,0,"");
		System.out.println("\n"+count);

	}
	
	public static void Mazepath(int er,int ec,int cc,int cr,String ans) {
		//er=end row
		//ec=end column
		//cc=current column
		//cr=current row
		if(cc==ec && cr==er) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(cc>ec || cr > er) {
			return;
		}
		
		
		Mazepath(er,ec,cc,cr+1,ans+"V");
		Mazepath(er,ec,cc+1,cr,ans+"H");
		Mazepath(er,ec,cc+1,cr+1,ans+"D");
		
	}

}
