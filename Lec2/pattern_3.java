package Lec2;
import java.util.*;

public class pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=n;
		while(row<=n) {
			int i=1;
			while(i<=nst) {
				System.out.print("* ");
				i++;
			}
			nst--;
			row++;
			System.out.println();
		}
		
		

	}

}
