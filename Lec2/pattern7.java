package Lec2;

import java.util.Scanner;

public class pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int row = 1;
		while (row <= n) {
			if (row == 1 || row == n) {
				int i = 1;
				while (i <= star) {
					System.out.print("*" + " ");
					i++;
				}
			} else {
				int i = 1;
				while (i <= n) {
					if (i == 1 || i == n) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
					i++;
				}
			}
			row++;
			System.out.println();
		}

	}

}
