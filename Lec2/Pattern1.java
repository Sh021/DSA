package Lec2;
import java.util.*;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nst=n;//number of star in each row
		while(row<=n) {
			int cst=1;//count of star
			while(cst<=nst) {
				System.out.print("*"+" ");
				cst++;
			}
			row++;
			System.out.println();
		}

	}

}
