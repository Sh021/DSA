package lec13;

import java.util.Scanner;

public class squareroot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		squareroot(n);
	}

	public static void squareroot(int n) {
		long ans = Integer.MIN_VALUE;
		long low = 0;
		long high = n;
		while (high >= low)
		{
			long mid = (high + low) / 2;
			if ((Math.pow(mid, 2)) == n)
			{
				ans = mid;
				break;
			} 
			else if ((Math.pow(mid, 2)) < n) 
			{
				low = mid +1;
			} 
			else 
			{
				high = mid - 1;
			}
		}
		if(ans<0) {
			System.out.println((int)(Math.sqrt(n)));
		}
		else {
			System.out.println(ans);
		}
	}
}
