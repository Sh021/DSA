package Lec2;
import java.util.*;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int i=n;
		int number=n;//number of star in each row
		while(row<=n) {
			int j=1;
			int count=n;
			while(j<=number) {
				if(j!=i) {
				System.out.print(count+" ");
				}
				else {
					System.out.print("* ");
				}
				count--;
				j++;
			}
			i--;
			row++;
			System.out.println();
		}

	}

}