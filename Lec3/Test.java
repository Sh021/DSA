package Lec3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int row = 1;
		int space = n - 1;
		int temp = 1;
		while (row <= n) {
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i = i + 1;
			}
			int j = 1;
			int val = temp;
			while (j <= star) {
				System.out.print(val + " ");

				if (j < star / 2 + 1) {
					val = val + 1;
				} 
				else {
					val = val - 1;
				}
				j = j + 1;
			}

			if (row < n / 2 + 1) {
				star = star + 1;
				space = space - 2;
				temp = temp + 1;
			} else {
				star = star - 1;
				space = space + 2;
				temp = temp - 1;
			}

			row = row + 1;
			System.out.println();
		}
	}
}
